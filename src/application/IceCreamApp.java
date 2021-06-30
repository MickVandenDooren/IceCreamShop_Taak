package application;
import eatables.*;
import sellers.*;

public class IceCreamApp {

    public static void main(String[] args) {

        // Pricelist instance
        PriceList priceList = new PriceList(1.0,2.50,3.00);

        // Initializing Ice Salon

        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList, 0);

        //Order of Ice Creams
        Flavor[] favouriteFlavs = {Flavor.STRACIATELLA, Flavor.MOKKA};
        Cone favouriteCone = iceCreamSalon.orderCone(favouriteFlavs);

        IceRocket iceRocket = iceCreamSalon.orderIceRocket();

        Magnum favouriteMagnum = iceCreamSalon.orderMagnum(MagnumType.ALPINENUTS);

        //Array eatable of previous order
        Eatable[] eatable = {favouriteCone, iceRocket, favouriteMagnum};


        //eat method for order
        favouriteCone.eat();
        iceRocket.eat();
        favouriteMagnum.eat();

        //print out profit
        System.out.println(iceCreamSalon);




    }
}
