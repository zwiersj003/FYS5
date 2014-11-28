package model;

public class Customerinfo {

    public String Name;
    public String Adress;
    public String shippingAdress;
    public String City;
    public String Postal;
    public String Country;
    public String Email;

    public Customerinfo() {
        this("", "", "", "", "", "", "");
    }

    public Customerinfo(String Name, String Adress, String shippingAdress, String City, String Postal, String Country, String Email) {
        this.Name = Name;
        this.Adress = Adress;
        this.shippingAdress = shippingAdress;
        this.City = City;
        this.Postal = Postal;
        this.Country = Country;
        this.Email = Email;
    }

    /**
     * @return the categoryId
     */
}
