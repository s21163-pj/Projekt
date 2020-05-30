
public class Main {

    public static void main(String[] args) {

        Account account = new Account("Tom", "Tom@emial.com", "722 456 213", 3456, "Regular",
                7800, 2500, "1234567891");
        Account account1 = new Account("Bob", "Bob@email.com", "789 456 321", 7854, "Premium",
                25000, 150000, "");

        System.out.println(account.getAccountNumber());

        Functions functions = new Functions(account.getCurrentMoney(), account.getAccountNumber());
        functions.accountBalance(account);



    }
}
