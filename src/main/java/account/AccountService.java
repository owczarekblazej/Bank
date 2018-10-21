package account;

public class AccountService {

    public void withdraw(BankAccount sourceBankAccount, double amount) {
        if (amount > 0) {
            if ((sourceBankAccount.getBalence() - amount) >= 0) {
                sourceBankAccount.setBalence(sourceBankAccount.getBalence() - amount);
                System.out.println("Succes");
            } else {
                System.out.println("You have not enough money");
            }
        }
    }

    public void deposit(BankAccount targetBankAccount, double amount) {
        if (amount > 0) {
            targetBankAccount.setBalence(targetBankAccount.getBalence() + amount);
            System.out.println("Succes");
        }
    }
}
