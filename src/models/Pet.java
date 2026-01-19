package models;

public class Pet {
    private String name, race, type;
    private int age;
    private Client owner;

    public Pet() {
        this.name = "";
        this.race = "";
        this.type = "";
        this.age = 0;
        this.owner = new Client();
    }

    public Pet(String name, String race, String type, int age, Client owner) {
        this.name = name;
        this.race = race;
        this.type = type;
        this.age = age;
        this.owner = owner;
    }

    public String getName() { return name; }
    public String getRace() { return race; }
    public String getType() { return type; }
    public int getAge() { return age; }
    public Client getOwner() { return owner; }
    public void setName(String name) { this.name = name; }
    public void setRace(String race) { this.race = race; }
    public void setType(String type) { this.type = type; }
    public void setAge(int age) { this.age = age; }
    public void setOwner(Client owner) { this.owner = owner; }


}
