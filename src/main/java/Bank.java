import java.util.ArrayList;
import java.util.List;

public class Bank{

    private int bankId;
    private String location;
    private boolean isLegal;        //does bank exist?

    List<String> account = new ArrayList<>();

    public Bank(int bankId, String location, boolean isLegal, List<String> account) {
        if (bankId > 999 && bankId <10000) {
            this.bankId = bankId;
        }
        this.location = location;
        this.isLegal = isLegal;
        this.account = account;
    }

}
