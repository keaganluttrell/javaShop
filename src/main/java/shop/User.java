package shop;

import java.util.Date;

public class User {
    //fields
    private final String userId;
    private String password;
    private String loginStatus;
    private final Date registerDate;

    public User(String userId, String password, String loginStatus) {
        this.userId = userId;
        this.password = password;
        this.loginStatus = loginStatus;
        this.registerDate = new Date();
    }

    public User(String userId, String password, String loginStatus, Date registerDate) {
        this.userId = userId;
        this.password = password;
        this.loginStatus = loginStatus;
        this.registerDate = registerDate;
    }

    //methods
    public boolean verifyLogin() {
        return !this.loginStatus.equals("logged out");
    }

    public String getUserId() {
        return this.userId;
    }

    public String getPassword() {
        return this.password;
    }

    public Date getRegisterDate() {
        return this.registerDate;
    }

    public String getLoginStatus() {
        return this.loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
