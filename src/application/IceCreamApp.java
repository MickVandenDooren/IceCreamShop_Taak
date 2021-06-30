package application;
import eatables.*;
import sellers.*;

public class IceCreamApp {

    public static void main(String[] args) {

        // Priclist instance
        PriceList priceList = new PriceList();
        priceList.setBallPrice(1.30);
        priceList.setRocketPrice(2.50);
        priceList.setMagnumStandardPrice(3.00);

        // Initializing Ice Salon

        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);

        //Order of Ice Creams
        Flavor[] favouriteFlavs = {Flavor.STRACIATELLA, Flavor.MOKKA};
        Cone favouriteCone = iceCreamSalon.orderCone(favouriteFlavs);

        IceRocket iceRocket = iceCreamSalon.orderIceRocket();

        Magnum favouriteMagnum = iceCreamSalon.orderMagnum(MagnumType.MILKCHOCOLATE);

        //Array eatable of previous order
        Eatable[] eatable = {favouriteCone, iceRocket, favouriteMagnum};




    }
}
