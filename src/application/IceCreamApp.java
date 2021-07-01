package application;
import eatables.*;
import sellers.*;

public class IceCreamApp {

    public static void main(String[] args) {

        // Pricelist instance
        PriceList priceList = new PriceList(1.0,2.50,3.00);

        // Initializing Ice Salon
        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList, 0);

        //Array eatable initializing
        Eatable[] order = new Eatable[1000];

        //Put order of ice cream into array with catch
       try{
        order[0]= iceCreamSalon.orderCone(new Flavor[]{Flavor.STRAWBERRY, Flavor.CHOCOLATE, Flavor.STRACIATELLA});
        order[1]= iceCreamSalon.orderIceRocket();
        order[2]= iceCreamSalon.orderMagnum(MagnumType.ALPINENUTS);
        order[3]= iceCreamSalon.orderMagnum(MagnumType.MILKCHOCOLATE);
       } catch (noMoreIceCreamException e){
           e.printStackTrace();
       }

        //Eat method print for every ice cream
        for (Eatable orders : order) {
            if (orders != null) {
                orders.eat();
            }
        }

        //Print out profit
        System.out.println(iceCreamSalon);
    }
}
