package eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum(){}

    public Magnum(MagnumType type){
        this.type=type;
    }

    @Override
    public void eat(){
        System.out.print("\n"+"You're eating a Magnum with " +getType() + " flavor.");
    }

    public MagnumType getType() {
        return type;
    }
}
