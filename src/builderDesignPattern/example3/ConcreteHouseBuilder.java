package builderDesignPattern.example3;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void constructRoof() {
        house.setRoof("Concrete roof");
    }

    @Override
    public void installDoors() {
        house.setDoors("Wooden doors");
    }

    @Override
    public void constructWalls() {
        house.setWalls("Bricks walls");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
