import java.util.regex.Pattern;

public class Account extends User {


    private String typeOfAccount;
    private float creditLimit;
    private float currentMoney;
    private String accountNumber;

    public Account(String name, String email, String phoneNumber, int userId, String typeOfAccount, float creditLimit, float currentMoney, String accountNumber) {
        super(name, email, phoneNumber, userId);
        this.typeOfAccount = typeOfAccount;
        this.creditLimit = creditLimit;
        this.currentMoney = currentMoney;
        this.accountNumber = accountNumber;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public float getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(float currentMoney) {
        this.currentMoney = currentMoney;
    }

    public String getAccountNumber() {
        if (Pattern.matches("[a-zA-Z]+", accountNumber) == false && accountNumber.length() == 26) {
            System.out.println("Number is correct");
            return accountNumber;
        } else {
        return "Change account number";
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
