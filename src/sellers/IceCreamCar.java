package sellers;
import eatables.*;

public abstract class IceCreamCar implements IceCreamSeller{

    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock){
        this.priceList=priceList;
        this.stock=stock;
    }


    public Cone orderCone(Flavor[] flavors) {
        Cone cone = prepareCone(flavors);
        return cone;
    }


    public Cone prepareCone(Flavor[] balls) {
    Cone cone = new Cone();
    stock.setCones(stock.getCones()-1);
    stock.setBalls(stock.getBalls() - balls.length);

    this.profit += priceList.getBallPrice() * balls.length;
    return cone;
    }


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


    public Magnum orderMagnum(MagnumType magnumType) {
       Magnum magnum = prepareMagnum(magnumType);
       return magnum;
    }


    public Magnum prepareMagnum(MagnumType magnumType){
        Magnum magnum = new Magnum();

        stock.setMagni(stock.getMagni()-1);
        this.profit += priceList.getMagnumStandardPrice(magnumType);
        return magnum;
    }

    @Override
    public double getProfit() {
        return profit;
    }

}
