package eatables;

public class IceRocket implements Eatable{

    public IceRocket(){
    }

    @Override
    public void eat() {
        System.out.print("\n"+"You're eating an IceRocket");
    }


}
