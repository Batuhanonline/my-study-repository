package Armors;

public class Armor {
    int ID;
    String name;
    int damagePrevention;
    int price;
    boolean isArmor = false;

    public Armor(){}
    public Armor(int ID, String name, int damagePrevention, int price) {
        this.ID = ID;
        this.name = name;
        this.damagePrevention = damagePrevention;
        this.price = price;
        this.isArmor = true;
    }

    public int getID() {
        if (isArmor) return ID;
        return 0;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        if (isArmor) return name;
        return "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamagePrevention() {
        if (isArmor) return damagePrevention;
        return 0;
    }

    public void setDamagePrevention(int damagePrevention) {
        this.damagePrevention = damagePrevention;
    }

    public int getPrice() {
        if (isArmor) return price;
        return 0;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
