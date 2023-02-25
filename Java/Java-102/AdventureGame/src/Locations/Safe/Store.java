package Locations.Safe;

import Armors.Armor;
import Armors.Heavy;
import Armors.Light;
import Armors.Medium;
import Game.Player;
import Weaponry.Pistol;
import Weaponry.Rifle;
import Weaponry.Sword;
import Weaponry.Weapon;

import java.util.Scanner;

public class Store extends SafeLocation{
    Player player;
    Scanner scanner = new Scanner(System.in);
    public Store(Player player){
        this.player = player;
        menu();
    }

    Player menu() {
        int select;
        System.out.println("Mağazaya hoşgeldiniz kategori seçiniz: \n" +
                "1- Silah\n" +
                "2- Zırh");

        select = scanner.nextInt();
        switch (select) {
            case 1 -> weaponMenu();
            case 2 -> armorMenu();
            default -> System.out.println("Hatalı seçim!!!");
        }
        return this.player;
    }

    void selectedWeapon(Weapon weapon) {
        if (this.player.getCharacter().getMoney() > weapon.getPrice()){
            this.player.getCharacter().setMoney(this.player.getCharacter().getMoney() - weapon.getPrice());
            this.player.setWeapon(weapon);
        }
    }
    void weaponMenu(){
        int select;
        System.out.println("Paranız: " + this.player.getCharacter().getMoney() +
                "\n1- Tabanca: Hasar->2 Fiyat->25\n" +
                "2- Kılıç: Hasar->3 Fiyat->35\n" +
                "3- Tüfek: Hasar->7 Fiyat->45");
        select = scanner.nextInt();
        switch (select) {
            case 1 -> {
                Weapon weapon = new Pistol();
                selectedWeapon(weapon);
            }
            case 2 -> {
                Weapon weapon = new Sword();
                selectedWeapon(weapon);
            }
            case 3 -> {
                Weapon weapon = new Rifle();
                selectedWeapon(weapon);
            }
            default -> System.out.println("Hatalı silah seçimi:");
        }
    }

    void selectedArmor(Armor armor) {
        if (this.player.getCharacter().getMoney() > armor.getPrice()) {
            this.player.getCharacter().setMoney(this.player.getCharacter().getMoney() - armor.getPrice());
            this.player.setArmor(armor);
        }
    }

    void armorMenu() {
        int select;
        System.out.println("Paranız: " + this.player.getCharacter().getMoney() +
                "\n1- Hafif: HasarEngelleme->1 Fiyat->15" +
                "\n2- Orta: HasarEngelleme->3 Fiyat->25" +
                "\n3- Ağır: HasarEngelleme->5 Fiyat->40");
        select = scanner.nextInt();
        switch (select) {
            case 1 -> {
                Armor armor = new Light();
                selectedArmor(armor);
            }
            case 2 -> {
                Armor armor = new Medium();
                selectedArmor(armor);
            }
            case 3 -> {
                Armor armor = new Heavy();
                selectedArmor(armor);
            }
        }
    }
}
