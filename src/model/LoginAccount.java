package model;

public class LoginAccount {

    private int accountId;
    private String name;
    private String username;
    private String passwordLogin;
    private int function;

    public LoginAccount() {
        this(-1, "", "", "", -1);
    }

    public LoginAccount(int account_id, String name, String username, String passwordLogin, int function) {
        this.accountId = account_id;
        this.name = name;
        this.username = username;
        this.passwordLogin = passwordLogin;
        this.function = function;
    }

}
