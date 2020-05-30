import java.math.BigDecimal;

public class Functions extends Account {

    public Functions(float currentMoney, String accountNumber) {
        super("default", "default", "default", 0000, "default", 0000, currentMoney, accountNumber);
    }

    public BigDecimal accountBalance(User user) {
        System.out.println("Your balance is: " + getCurrentMoney());
        BigDecimal currentState = new BigDecimal(getCurrentMoney());
        return currentState;
    }

}
