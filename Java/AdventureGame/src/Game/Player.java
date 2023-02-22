package Game;

import Armors.Armor;
import Weaponry.Weapon;
import  Characters.CharacterPlayer;

public class Player {
    CharacterPlayer character;
    Weapon weapon = new Weapon();
    Armor armor = new Armor();

    public Player(CharacterPlayer character) {
        this.character = character;
    }

    public CharacterPlayer getCharacter() {
        return character;
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


}
