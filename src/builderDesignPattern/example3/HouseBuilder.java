package builderDesignPattern.example3;

public interface HouseBuilder {
    void constructRoof();
    void installDoors();
    void constructWalls();
    House getHouse();
}
