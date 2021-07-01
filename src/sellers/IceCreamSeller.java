package sellers;

import eatables.*;

public interface IceCreamSeller extends Profitable {

    Cone orderCone(Flavor[] balls) throws noMoreIceCreamException;

    default IceRocket orderIceRocket() throws noMoreIceCreamException {
        return null;
    }

    Magnum orderMagnum(MagnumType type) throws noMoreIceCreamException;
}
