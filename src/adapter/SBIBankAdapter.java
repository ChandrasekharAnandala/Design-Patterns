package adapter;

import adapter.thirdParty.SBIBank;

public class SBIBankAdapter implements BankAdapter{
    SBIBank sbiBank = new SBIBank();
    @Override
    public void sendMoney(String fromAcc, String toAcc, double amount) {
        sbiBank.sendMoney(toAcc,fromAcc, (int) amount);
    }

    @Override
    public double checkBalance(String accountNumber) {
        sbiBank.checkBalanceFromAccount(accountNumber);
        return 0;
    }

    @Override
    public void register(String phoneNumber) {
        sbiBank.registerAccount(phoneNumber);
    }
}
