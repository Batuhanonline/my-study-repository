package Monsters;

public class Monster {
    int ID;
    String name;
    int damage;
    int healty;
    int money;

    public Monster(int ID, String name, int damage, int healty, int money) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.healty = healty;
        this.money = money;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
