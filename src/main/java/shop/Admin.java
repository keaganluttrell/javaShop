package shop;

public class Admin extends User{
    private String adminName;
    private String email;

    public Admin(String userId, String password, String loginStatus, String adminName, String email) {
        super(userId, password, loginStatus);
        this.adminName = adminName;
        this.email = email;
    }

    public String getAdminName() {
        return this.adminName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
