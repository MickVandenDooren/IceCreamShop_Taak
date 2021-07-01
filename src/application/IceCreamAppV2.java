package application;

import eatables.*;
import sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {


        // Pricelist instance
        PriceList priceList = new PriceList(0.5, 1, 1);

        //Stock instance
        Stock truckStock = new Stock(10, 10, 1, 10);

        // Initializing Ice Cream Truck
        IceCreamSeller iceCreamTruck = new IceCreamCar(priceList, truckStock) {
        };

        //Array eatable initializing with max length of inventory
        Eatable[] order = new Eatable[truckStock.getCones()+ truckStock.getIceRockets()+ truckStock.getMagni()];

        //put order of Ice Creams into array with catch
        try{
            order[0]= iceCreamTruck.orderCone(new Flavor[]{Flavor.MOKKA, Flavor.LEMON, Flavor.PISTACHE});
            order[1]= iceCreamTruck.orderIceRocket();
            order[2]= iceCreamTruck.orderMagnum(MagnumType.ALPINENUTS);
        } catch (noMoreIceCreamException e){
            e.printStackTrace();
        }

        //eat method print for every ice cream
        for (Eatable orders : order) {
            if (orders != null) {
                orders.eat();
            }
        }

        //Print profit
        System.out.println(iceCreamTruck);

    }

}
