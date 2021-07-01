package eatables;
public class Cone implements Eatable {

    private Flavor[] balls;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.print("\n" + "You're eating a cone with ");
        for (Flavor ball : balls) {
            if (ball != null) {
                System.out.print(ball + " ");
            }
        }
        System.out.print("flavor(s).");
    }
}
