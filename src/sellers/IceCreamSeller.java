package sellers;

import eatables.*;

public interface IceCreamSeller extends Profitable {

    default Cone orderCone(Flavor[] balls) {

        Cone[] Order = new Cone[100];
        for (int i=0 ; i< balls.length ; i++){
            if (balls[i] != null) {
               Order[i] = balls[i];
               int Profit = getProfit(IceCreamSalon) + 1.00;
               
            }
        }

        System.out.println("You've order a cone with ");
        for (Flavor ball : balls) {
            if (ball != null) {
                System.out.print(" " + balls);
            }
        }
    }


    default IceRocket orderIceRocket(IceRocket iceRocket){

            System.out.println("You've ordered an " + iceRocket);
    }

    default Magnum orderMagnum(MagnumType magnum){
            System.out.println("You've ordered a " + magnum + " magnum.");
    }

}
