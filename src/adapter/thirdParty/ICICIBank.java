package adapter.thirdParty;

public class ICICIBank {
    public void sendMoney(int amountString, String tooAcc, String fromAcc){
        System.out.println("ICICI transferring money API");
    }
    public double checkBalance(String accNumber){
        System.out.println("ICICI get Balance API");
        return 0.0;
    }

    public void registerAcc(String phone) {
        System.out.println("ICICI register account");
    }
}
