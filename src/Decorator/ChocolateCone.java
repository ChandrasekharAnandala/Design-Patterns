package Decorator;

public class ChocolateCone implements IceCream{
    private IceCream iceCream;

    public ChocolateCone(){}

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null){
            return 9;
        }
        return iceCream.getCost()+9;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Chocolate Cone";
        }
        return iceCream.getDescription()+" Chocolate Cone ";
    }
}
