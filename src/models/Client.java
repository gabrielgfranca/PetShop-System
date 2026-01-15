package models;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name, phone;
    private Address address;
    private final List<Pet> pets = new ArrayList<>();

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public Address getAddress() { return address; }
    public List<Pet> getPets() { return pets; }
    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(Address address) { this.address = address; }

    public void addPet(Pet pet) { this.pets.add(pet); }
    public void removePet(Pet pet) { this.pets.remove(pet); }
}
