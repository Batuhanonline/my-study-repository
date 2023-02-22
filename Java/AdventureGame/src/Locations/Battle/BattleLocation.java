package Locations.Battle;

import Game.Player;
import Locations.Location;
import Monsters.Bear;
import Monsters.Monster;
import Monsters.Vampire;
import Monsters.Zombie;

import java.util.Random;

abstract public class BattleLocation extends Location {
    int monsterID;
    int monsterPiece;
    Monster monster;
    Player player;
    String name;
    Random random = new Random();

    public BattleLocation(Player player, int ID, String name, boolean isSafeLocation, int monsterID, int monsterPiece) {
        super(player, ID, name, isSafeLocation);
        this.name = name;
        this.player = player;
        this.monsterID = monsterID;
        this.monsterPiece = monsterPiece;
        combatStart();
    }

    void combatStart(){
        int monsterPiece = random.nextInt(1, this.monsterPiece);
        System.out.println(monsterPiece + " kadar canavar ile karşılaşıldı!!!");
        switch (this.monsterID){
            case 1 -> {
                for (int i = 0; i < monsterPiece; i++){
                    this.monster = new Zombie();
                    combat();
                }
            }
            case 2 -> {
                for (int i = 0; i < monsterPiece; i++){
                    this.monster = new Vampire();
                    combat();
                }
            }
            case 3 -> {
                for (int i = 0; i < monsterPiece; i++){
                    this.monster = new Bear();
                    combat();
                }
            }
            default -> System.out.println("BattleLocation switch case hatası.");
        }
    }
    public Player combat(){
        int monsterDamage;

        while (this.player.getCharacter().getHealty() > 0){
            this.monster.setHealty(this.monster.getHealty() - (this.player.getCharacter().getDamage() + this.player.getWeapon().getDamage()));
            if (this.monster.getHealty() > 0){
                if (this.player.getArmor().getDamagePrevention() - this.monster.getDamage() < 0){
                    monsterDamage = this.monster.getDamage();
                } else {
                    monsterDamage = this.player.getArmor().getDamagePrevention() - this.monster.getDamage();
                }
                this.player.getCharacter().setHealty(this.player.getCharacter().getHealty() - (monsterDamage));
            } else {
                if (name.equals("Forest")) this.player.getCharacter().setForestWin(true);
                if (name.equals("Cave")) this.player.getCharacter().setCaveWin(true);
                if (name.equals("River")) this.player.getCharacter().setRiverWin(true);

                this.player.getCharacter().setMoney(this.player.getCharacter().getMoney() + this.monster.getMoney());
                return this.player;
            }
        }
        System.out.println("Game Over!!!");
        return this.player;
    }
}
