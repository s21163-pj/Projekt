public class User {

    private String name;
    private String email;
    private String phoneNumber;
    private int userId;

    public User(String name, String email, String phoneNumber, int userId) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
