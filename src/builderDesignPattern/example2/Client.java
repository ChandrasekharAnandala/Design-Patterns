package builderDesignPattern.example2;

public class Client {
    public static void main(String[] args) {
        House house = House.getBuilder()
                .setNoOfRooms(4)
                .setRoofType("Flat")
                .setDoorType("Double")
                .build();
        /*Builder design pattern is allowing me to create the house with different combinations,
         i,e in the above object I did not set parking type but still I am able to build the House,
         and it did not force House class to have different combinations of constructors.

         One thing to notice here is we have delegated the building of complex object to the another class called
         Builder.

         If we want to add any validations of the parameters we can add it in build method of the Builder class.
         */
    }
}
