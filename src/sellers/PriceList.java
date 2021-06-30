package sellers;

public class PriceList {

    double ballPrice = 1.00;
    double rocketPrice = 1.80;
    double magnumStandardPrice = 2.50;

    PriceList(){
    }

    PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice){
    this.ballPrice=ballPrice;
    this.rocketPrice=rocketPrice;
    this.magnumStandardPrice=magnumStandardPrice;
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

    public double getMagnumStandardPrice() {
        return magnumStandardPrice;
    }
}
