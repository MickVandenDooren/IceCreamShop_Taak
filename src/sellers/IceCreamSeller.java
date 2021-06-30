package sellers;

import eatables.*;

public interface IceCreamSeller extends Profitable {

    Cone orderCone(Flavor[] balls);

    IceRocket orderIceRocket();

    Magnum orderMagnum(MagnumType type);
}
