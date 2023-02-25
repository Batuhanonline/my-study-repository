package Characters;

import Armors.Armor;
import Weaponry.Weapon;

abstract public class CharacterPlayer {
    int ID;
    String name;
    int damage;
    int healty;
    int maxHealty;
    int money;

    private boolean isForestWin = false;
    private boolean isCaveWin = false;
    private boolean isRiverWin = false;
    Weapon weapon;
    Armor armor;

    public CharacterPlayer(int ID, String name, int damage, int healty, int money) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.healty = healty;
        this.maxHealty = healty;
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getMaxHealty() {
        return maxHealty;
    }

    public boolean isForestWin() {
        return isForestWin;
    }

    public void setForestWin(boolean forestWin) {
        isForestWin = forestWin;
    }

    public boolean isCaveWin() {
        return isCaveWin;
    }

    public void setCaveWin(boolean caveWin) {
        isCaveWin = caveWin;
    }

    public boolean isRiverWin() {
        return isRiverWin;
    }

    public void setRiverWin(boolean riverWin) {
        isRiverWin = riverWin;
    }
}
