package sellers;

import eatables.*;

public class IceCreamSalon implements IceCreamSeller {

    PriceList pricelist;
    double totalProfit;

    public IceCreamSalon(PriceList priceList, double totalProfit){
        this.pricelist= priceList;
        this.totalProfit = totalProfit;
    }

    public double getProfit() {
        return totalProfit;
    }

    public Cone orderCone(Flavor[] balls) {
        Cone cone = new Cone(balls);
        totalProfit+= pricelist.getBallPrice() * balls.length;
        return cone;
    }

    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit+= pricelist.getRocketPrice();
        return iceRocket;
    }

    public Magnum orderMagnum(MagnumType type) {
       Magnum magnum = new Magnum(type);
       totalProfit += pricelist.getMagnumPrice(type);
       return magnum;
    }

    @Override
    public String toString() {
        return "\n"+"IceCreamSalon{" +
                "totalProfit=" + totalProfit +
                '}';
    }
}
