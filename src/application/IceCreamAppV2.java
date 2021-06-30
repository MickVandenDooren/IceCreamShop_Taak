package application;

import eatables.*;
import sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {


        // Pricelist instance
        PriceList priceList = new PriceList(1.5, 3.0, 3.5);

        //Stock instance
        Stock truckStock = new Stock(10, 10, 10, 10);

        // Initializing Ice Cream Truck
        IceCreamSeller iceCreamTruck = new IceCreamCar(priceList, truckStock, 0) {
        };

        //Order of Ice Creams
        Flavor[] secondFavouriteFlavs = {Flavor.VANILLA, Flavor.CHOCOLATE};

        Cone secondFavouriteCone = iceCreamTruck.orderCone(secondFavouriteFlavs);
        IceRocket iceRocket1 = iceCreamTruck.orderIceRocket();
        IceRocket iceRocket2 = iceCreamTruck.orderIceRocket();
        Magnum secondFavouriteMagnum = iceCreamTruck.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES);


        //Print eat
        secondFavouriteCone.eat();
        iceRocket1.eat();
        iceRocket2.eat();
        secondFavouriteMagnum.eat();

    }

}
