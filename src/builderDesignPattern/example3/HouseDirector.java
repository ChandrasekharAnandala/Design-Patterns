package builderDesignPattern.example3;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse(){
        houseBuilder.constructWalls();
        houseBuilder.constructRoof();
        houseBuilder.installDoors();
    }
}
