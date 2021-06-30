package sellers;

import eatables.MagnumType;

public class PriceList {

    double ballPrice;
    double rocketPrice;
    double magnumStandardPrice;

    PriceList(){
        this(0,0,0);
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice){
    setBallPrice(ballPrice);
    setRocketPrice(rocketPrice);
    setMagnumStandardPrice(magnumStandardPrice);
    }

    public void setBallPrice(double ballPrice){
        this.ballPrice=ballPrice;
    }

    public void setRocketPrice(double rocketPrice){
        this.rocketPrice=rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumStandardPrice(MagnumType magnumType) {

        if(magnumType == MagnumType.ALPINENUTS){
            magnumStandardPrice *= 1.50;
        }

        return magnumStandardPrice;
    }
}
