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
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Flavor[] balls)
    {
        Cone cone = new Cone(balls);
        totalProfit+= pricelist.getBallPrice() * balls.length;
        return cone;
    }


    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit+= pricelist.getRocketPrice();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
       Magnum magnum = new Magnum(type);
       totalProfit += pricelist.getMagnumStandardPrice(type);
       return magnum;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "totalProfit=" + totalProfit +
                '}';
    }
}
