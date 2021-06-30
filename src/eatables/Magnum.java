package eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    Magnum(){}

    Magnum(MagnumType type){
        this.type=type;
    }

    @Override
    public void eat(){
        System.out.println("You're eating a " +getType() + " Magnum");
    }

    public MagnumType getType() {
        return type;
    }

}
