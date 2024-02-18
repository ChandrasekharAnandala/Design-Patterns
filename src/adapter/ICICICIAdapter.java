package adapter;

import adapter.thirdParty.ICICIBank;

public class ICICICIAdapter implements BankAdapter{
    ICICIBank bank = new ICICIBank();
    public void sendMoney(String fromAcc, String toAcc, double amount){
        bank.sendMoney((int) amount,toAcc,fromAcc);
    }
    public double checkBalance(String accountNumber){
        bank.checkBalance(accountNumber);
        return 0.0;
    }

    @Override
    public void register(String accNumber) {
        bank.registerAcc(accNumber);
    }
}
