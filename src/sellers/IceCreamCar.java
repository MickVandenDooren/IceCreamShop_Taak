package sellers;
import eatables.*;

public abstract class IceCreamCar implements IceCreamSeller{

    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock, double profit){
        this.priceList=priceList;
        this.stock=stock;
        this.profit=profit;
    }

    @Override
    public Cone orderCone(Flavor[] balls) {
        Cone cone = new Cone(balls);
        prepareCone(balls);
        return cone;
    }


    public Cone prepareCone(Flavor[] balls) {
    Cone cone = new Cone();
    stock.setCones(stock.getCones()-1);
    stock.setBalls(stock.getBalls() - balls.length);

    this.profit += priceList.getBallPrice() * balls.length;
    return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
       IceRocket iceRocket = prepareIceRocket();
       return iceRocket;
    }


    public IceRocket prepareIceRocket() {
        IceRocket iceRocket = new IceRocket();

        stock.setIceRockets(stock.getIceRockets()-1);
        this.profit += priceList.getRocketPrice();

        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
       Magnum magnum = new Magnum(magnumType);
       prepareMagnum(magnumType);
       return magnum;
    }


    public Magnum prepareMagnum(MagnumType magnumType){
        Magnum magnum = new Magnum(magnumType);
        stock.setMagni(stock.getMagni()-1);
        this.profit += priceList.getMagnumStandardPrice(magnumType);
        return magnum;
    }

    @Override
    public double getProfit() {
        return profit;
    }

}
