package account.card;

import account.card.type.CreditCardType;

public abstract class CreditCard {
    private CreditCardType creditCardType;
    private String number;
    private String expirationDate;
    private double balance;
    private double maxCredit;

    public CreditCard(CreditCardType creditCardType, String number, String expirationDate, double balance, double maxCredit) {
        this.creditCardType = creditCardType;
        this.number = number;
        this.expirationDate = expirationDate;
        this.balance = balance;
        this.maxCredit = maxCredit;
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(double maxCredit) {
        this.maxCredit = maxCredit;
    }

    public abstract void showCreditCardPartners();
}
