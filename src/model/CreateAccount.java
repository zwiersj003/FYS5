package model;

public class CreateAccount {

    public String userid;
    public Boolean succes;
    public String username;
    public String passwordd;
    public String accounttype;
    public String name;
    public String adress;
    public String city;
    public String postal;
    public String country;
    public String email;

    public CreateAccount() {
      this("",false,"", "", "", "", "", "", "", "", "");
}

    public CreateAccount(String userid, Boolean succes, String username, String passwordd, String accounttype, String name, String adress, String city, String postal, String country, String email) {
        this.userid = userid;
        this.succes=succes;
        this.username = username;
        this.passwordd = passwordd;
        this.accounttype = accounttype;
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.postal = postal;
        this.country = country;
        this.email = email;
    }
}
