package sellers;

import eatables.*;

public class IceCreamCar implements IceCreamSeller{

    PriceList priceList = new PriceList();
    Stock stock = new Stock();
    public double profit;

    @Override
    public Cone orderCone(Flavor[] balls) {
        return IceCreamSeller.super.orderCone(balls);
    }

    /*
    public Cone prepareCone(Flavor[] balls){
    } OPLOSSING VOOR ZOEKEN!!!!
    */

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
