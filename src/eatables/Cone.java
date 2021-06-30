package eatables;
public class Cone implements Eatable {


    Flavor[] balls = new Flavor[100];

    Cone() {
    }

    Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("You're eating a cone with");
        for (Flavor ball : balls) {
            if (ball != null) {
                System.out.print(" " + ball);
            }
        } System.out.print(" flavor(s).");

    }


}
