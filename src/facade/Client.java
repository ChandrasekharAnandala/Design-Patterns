package facade;

public class Client {
    public static void main(String[] args) {
        /*
        * The Facade design pattern is a structural pattern that provides a simplified interface to a
        *  complex system of classes, interfaces, or subsystems. It encapsulates the complexity of interacting
        *  with multiple components behind a single interface, making it easier to use and understand.*/
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
    }
}
