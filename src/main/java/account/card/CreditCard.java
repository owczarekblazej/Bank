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
}
