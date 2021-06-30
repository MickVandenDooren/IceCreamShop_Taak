package application;
import eatables.*;
import sellers.*;

public class IceCreamApp {

    public static void main(String[] args) {

        // Priclist instance
        PriceList priceList1 = new PriceList(1.30,2.50,3.00);

        // Initializing Ice Salon

        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList1, 0);

        //Order of Ice Creams
        Flavor[] favouriteFlavs = {Flavor.STRACIATELLA, Flavor.MOKKA};
        Cone favouriteCone = iceCreamSalon.orderCone(favouriteFlavs);

        IceRocket iceRocket = iceCreamSalon.orderIceRocket();

        Magnum favouriteMagnum = iceCreamSalon.orderMagnum(MagnumType.MILKCHOCOLATE);

        //Array eatable of previous order
        Eatable[] eatable = {favouriteCone, iceRocket, favouriteMagnum};

        favouriteCone.eat();
        iceRocket.eat();
        favouriteMagnum.eat();

        System.out.println("Total Profit Salon: " + iceCreamSalon.getProfit());




    }
}
