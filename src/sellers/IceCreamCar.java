package sellers;
import eatables.*;

public class IceCreamCar implements IceCreamSeller{

    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock){
        this.priceList=priceList;
        this.stock=stock;
    }

    @Override
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


    @Override
    public IceRocket orderIceRocket(IceRocket iceRocket) {
        return IceCreamSeller.super.orderIceRocket(iceRocket);
    }
    /*
    public IceRocket prepareIceRocket(IceRocket iceRocket) {
        return iceRocket;
    }  OPLOSSING VOOR ZOEKEN!!!
     */

    @Override
    public Magnum orderMagnum(MagnumType magnum) {
        return IceCreamSeller.super.orderMagnum(magnum);
    }

    /*
    public Magnum prepareMagnum(MagnumType Magnum){
        return magnum;
    }  OPLOSSING VOOR ZOEKEN!!!
     */

    @Override
    public void getProfit() {
        return profit;
    }

}
