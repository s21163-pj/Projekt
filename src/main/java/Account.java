import java.math.BigDecimal;

public class Account extends User {

    private String typeOfAccount;
    private BigDecimal creditLimit;
    private BigDecimal currentMoney;

    public Account(String name, String email, String phoneNumber, int userId, String typeOfAccount, BigDecimal creditLimit, BigDecimal currentMoney) {
        super(name, email, phoneNumber, userId);
        this.typeOfAccount = typeOfAccount;
        this.creditLimit = creditLimit;
        this.currentMoney = currentMoney;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(BigDecimal currentMoney) {
        this.currentMoney = currentMoney;
    }
}
