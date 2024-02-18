package Decorator;

public class OrangeCone implements IceCream{
    //This will only act like a base add on
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange cone";
    }
}
