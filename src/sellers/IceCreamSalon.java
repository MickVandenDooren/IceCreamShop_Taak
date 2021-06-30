package sellers;

import eatables.*;

public class IceCreamSalon implements IceCreamSeller {

    PriceList pricelist;
    double totalProfit;

    public IceCreamSalon(PriceList priceList, double totalProfit){
        this.pricelist= priceList;
        this.totalProfit = totalProfit;
    }

    @Override
    public void getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Flavor[] balls) {
        return IceCreamSeller.super.orderCone(balls);
    }


    @Override
    public IceRocket orderIceRocket(IceRocket iceRocket) {
        return IceCreamSeller.super.orderIceRocket(iceRocket);
    }

    @Override
    public Magnum orderMagnum(MagnumType magnum) {
        return IceCreamSeller.super.orderMagnum(magnum);
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "pricelist=" + pricelist +
                ", totalProfit=" + totalProfit +
                '}';
    }

}
