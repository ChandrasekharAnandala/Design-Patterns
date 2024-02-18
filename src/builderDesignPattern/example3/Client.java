package builderDesignPattern.example3;

public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new ConcreteHouseBuilder();
        HouseDirector director = new HouseDirector(houseBuilder);
        director.constructHouse();
        House house = houseBuilder.getHouse();
        System.out.print("Constructed House: ");
        System.out.println(house);
    }
}
