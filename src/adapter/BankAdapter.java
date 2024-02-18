package adapter;

public interface BankAdapter {

    void sendMoney(String fromAcc, String toAcc, double amount);

    double checkBalance(String accountNumber);

    void register(String accNumber);
}
