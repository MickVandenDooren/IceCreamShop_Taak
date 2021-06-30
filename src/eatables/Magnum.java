package eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum(){}

    public Magnum(MagnumType type){
        this.type=type;
    }

    public MagnumType getType() {
        return type;
    }

    @Override
    public void eat(){
        System.out.println("\n"+"You're eating a Magnum with " +getType() + " flavor.");
    }

}
