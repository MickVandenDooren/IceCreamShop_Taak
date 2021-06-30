package sellers;

import eatables.*;

public interface IceCreamSeller extends Profitable {

    default Cone orderCone(Flavor[] balls) {

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
