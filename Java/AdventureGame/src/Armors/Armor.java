package Armors;

abstract public class Armor {
    int ID;
    String name;
    int damagePrevention;
    int price;

    public Armor(int ID, String name, int damagePrevention, int price) {
        this.ID = ID;
        this.name = name;
        this.damagePrevention = damagePrevention;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamagePrevention() {
        return damagePrevention;
    }

    public void setDamagePrevention(int damagePrevention) {
        this.damagePrevention = damagePrevention;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
