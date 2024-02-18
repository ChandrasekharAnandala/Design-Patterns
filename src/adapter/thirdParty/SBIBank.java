package adapter.thirdParty;

public class SBIBank {
    public void sendMoney(String tooAcc, String fromAcc, int amount){
        System.out.println("SBI transferring money API");
    }
    public double checkBalanceFromAccount(String accNumber){
        System.out.println("SBI get Balance API");
        return 0.0;
    }

    public void registerAccount(String phone) {
        System.out.println("SBI register account");
    }
}
