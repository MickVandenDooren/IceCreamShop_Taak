package sellers;

public interface Profitable {

    default double getProfit(){
        return 0;
    }
}
