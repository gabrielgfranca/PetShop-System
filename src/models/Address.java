package models;

public class Address {
    private String street, number, neighborhood, city, state, zipCode, country;

    public Address() {
        this.street = "";
        this.number = "";
        this.neighborhood = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
        this.country = "";
    }

    public Address(String street, String number, String neighborhood, String city, String state, String zipCode, String country) {
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getStreet() { return street; }
    public String getNumber() { return number; }
    public String getNeighborhood() { return neighborhood; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZipCode() { return zipCode; }
    public String getCountry() { return country; }
    public void setStreet(String street) { this.street = street; }
    public void setNumber(String number) { this.number = number; }
    public void setNeighborhood(String neighborhood) { this.neighborhood = neighborhood; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    public void setCountry(String country) { this.country = country; }

    @Override
    public String toString() {
        return "Address: { "
                + "Street:" + street + ", "
                + "Number:" + number + ", "
                + "Neighborhood:" + neighborhood + ", "
                + "City:" + city + ", "
                + "State:" + state + ", "
                + "zipcode:" + zipCode + ", "
                + "Country:" + country
                + " }";
    }

}
