package account.card;

import account.card.type.CreditCardType;

public abstract class CreditCard {

    private CreditCardType creditCardType;
    private String number;
    private String expirationDate;
    private double balance;
    private  double maxCredit;

    public abstract String getCreditCardPartners();
}
