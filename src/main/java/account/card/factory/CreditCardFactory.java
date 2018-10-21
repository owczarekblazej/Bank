package account.card.factory;

import account.card.AmericanExpressCreditCard;
import account.card.MasterCardCreditCard;
import account.card.VisaCreditCard;
import account.card.CreditCard;
import account.card.type.CreditCardType;

public class CreditCardFactory {
    public CreditCard createCreditCard(CreditCardType creditCardType, String number, String expirationDate, double balance, double maxCredit){
        switch (creditCardType){
            case VISA:
                return new VisaCreditCard(CreditCardType.VISA,number,expirationDate,balance,maxCredit);
            case AMERICAN_EXPRESS:
                return new AmericanExpressCreditCard(CreditCardType.AMERICAN_EXPRESS,number,expirationDate,balance,maxCredit);
            case MASTER_CARD:
                return new MasterCardCreditCard(CreditCardType.MASTER_CARD,number,expirationDate,balance,maxCredit) ;
        }
        return null;
    }
}
