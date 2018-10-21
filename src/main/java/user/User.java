package user;

import account.BankAccount;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor // tworzy konstruktor ze wszystkich argumentów; unikamy wtedy "boiler plate" kodu - czyli niepotrzebnego kodu
@NoArgsConstructor
@Getter
@Setter

public class User {
    public String fullName;
    private BankAccount bankAccount;

}
