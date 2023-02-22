package Weaponry;

public class Weapon {
    int ID;
    String name;
    int damage;
    int price;
    boolean isWeapon = false;

    public Weapon(){}
    public Weapon(int ID, String name, int damage, int price) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.price = price;
        isWeapon = true;
    }

    public int getID() {
        if (isWeapon) return ID;
        return 0;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        if (isWeapon) return name;
        return "Yok";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        if (isWeapon) return damage;
        return 0;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        if (isWeapon) return price;
        return 0;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
