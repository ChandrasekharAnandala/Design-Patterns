package adapter;

public class Client {
    public static void main(String[] args) {
        /*
        * The Adapter design pattern is a structural pattern that allows objects with incompatible interfaces
        *  to work together. It acts as a bridge between two incompatible interfaces, converting the interface
        * of a class into another interface that a client expects. This pattern is useful when integrating
        * existing or third-party code with different interfaces without modifying their source code.*/
    BankAdapter bankAdapter = new ICICICIAdapter();
    bankAdapter.sendMoney("12234","434567",1000);
    bankAdapter.checkBalance("12234");
    bankAdapter.register("7897653421");
    }
}
