package sellers;
import eatables.*;

public abstract class IceCreamCar implements IceCreamSeller{

    private PriceList priceList;
    private Stock stock;
    private double totalProfit;

    public IceCreamCar(PriceList priceList, Stock stock){
        this.priceList=priceList;
        this.stock=stock;
    }

    @Override
    public Cone orderCone(Flavor[] balls) throws noMoreIceCreamException {
        if (stock.getBalls() < 1 || stock.getBalls()< balls.length || stock.getCones()<1){
            throw new noMoreIceCreamException("Not enough balls or cones in inventory.");
        } else {
            Cone cone = new Cone(balls);
            prepareCone(balls);
            return cone;
        }
    }

    public Cone prepareCone(Flavor[] balls) {
    Cone cone = new Cone();
    stock.setCones(stock.getCones()-1);
    stock.setBalls(stock.getBalls() - balls.length);

    this.totalProfit += priceList.getBallPrice() * balls.length;
    return cone;
    }

    @Override
    public IceRocket orderIceRocket() throws noMoreIceCreamException {
        if (stock.getIceRockets()<1) {
            throw new noMoreIceCreamException("Not enough icerockets in inventory.");
        } else {
            return prepareIceRocket();
        }
    }

    public IceRocket prepareIceRocket() {
        IceRocket iceRocket = new IceRocket();

        stock.setIceRockets(stock.getIceRockets()-1);
        this.totalProfit += priceList.getRocketPrice();

        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) throws noMoreIceCreamException {
        if (stock.getMagni() < 1){
            throw new noMoreIceCreamException("Not enough magnums in inventory.");
        } else {
            Magnum magnum = new Magnum(magnumType);
            prepareMagnum(magnumType);
            return magnum;
        }
    }


    public Magnum prepareMagnum(MagnumType magnumType){
        Magnum magnum = new Magnum(magnumType);
        stock.setMagni(stock.getMagni()-1);
        this.totalProfit += priceList.getMagnumPrice(magnumType);
        return magnum;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public String toString() {
        return "\n"+"IceCreamCar{" +
                "totalProfit=" + totalProfit +
                '}';
    }
}
