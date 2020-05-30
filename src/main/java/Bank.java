import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank extends Account {

    private int bankId;
    private String location;
    private boolean isLegal;        //does bank exist?

    List<String> account = new ArrayList<>();

    public Bank(String name, String email, String phoneNumber, int userId, String typeOfAccount, BigDecimal creditLimit, BigDecimal currentMoney,
                int bankId, String location, boolean isLegal, List<String> account) {
        super(name, email, phoneNumber, userId, typeOfAccount, creditLimit, currentMoney);
        this.bankId = bankId;
        this.location = location;
        this.isLegal = isLegal;
        this.account = account;
    }
}
