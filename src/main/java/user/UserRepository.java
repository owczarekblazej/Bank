package user;

import account.BankAccount;

import java.util.HashMap;

public class UserRepository {
    //  tworzymy singleton
    // typ lazy:
    private static UserRepository instance = new UserRepository();

    private HashMap<String, User> users;

    public static UserRepository getInstance() {
        return instance;
    }

//    typ eager:
//    private static UserRepository instance;
//
//    private HashMap<String, User> users;
//
//    public static UserRepository getInstance() {
//        if (instance == null) {
//            synchronized broni nas przed błędem w przypadku wielowątkowości
//            synchronized (UserRepository.class) {
//                if (instance == null) {
//                    instance = new UserRepository();
//                    return instance;
//                }
//            }
//            return instance;
//        }
//    }

    private UserRepository() {
        users = new HashMap<>();
//         tworzenie obiektów po staremu

//        BankAccount bankAccountOne = new BankAccount("111111111111111122222222","1010",
//                "Safety BANK", "John Account1010", 0.0,null,false,
//                null,null,true);

//        tworzenie obiektu za pomocą buildera
        BankAccount bankAccountOne = BankAccount.builder("111111111111111122222222")
                .addAccountCode("1010")
                .addBalence(3000.0)
                .addAccountName("John Account1010")
                .addBankName("Safety BANK").build(); // metoda build jest tu potrzebna tak samo jak toString
        // na końcu w StringBuilder

        BankAccount bankAccountTwo = BankAccount
                .builder("333333333333333344444444")
                .addAccountCode("2020")
                .addBankName("Safety BANK")
                .addAccountName("Andres Account2020")
                .build();

        BankAccount bankAccountThree = BankAccount
                .builder("333333333333333344444445")
                .addAccountCode("3020")
                .addBankName("Safety BANK")
                .addAccountName("Bob Account3020")
                .addDailyLimit(800)
                .build();

        User userOne = new User("Jan Kowalski", bankAccountOne);
        User userTwo = new User("Andrzej Badura", bankAccountTwo);
        User userThree = new User("Bob Nowak", bankAccountThree);

        users.put(userOne.getFullName(), userOne);
        users.put(userTwo.getFullName(), userTwo);
        users.put(userThree.getFullName(), userThree);
    }

    public HashMap<String, User> getUsers() {
        return users;
    }
}
