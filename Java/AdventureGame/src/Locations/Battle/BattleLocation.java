package Locations.Battle;

import Game.Player;
import Locations.Location;
import Monsters.Monster;

abstract public class BattleLocation extends Location {
    Monster monster;
    Player player;

    public BattleLocation(Player player, int ID, String name, boolean isSafeLocation, Monster monster) {
        super(player, ID, name, isSafeLocation);
        this.monster = monster;
    }

    public Player combat(){
        while (this.player.getCharacter().getHealty() > 0){
            this.monster.setHealty(this.monster.getHealty() - (this.player.getCharacter().getDamage() + this.player.getWeapon().getDamage()));
            if (this.monster.getHealty() > 0){
                this.player.getCharacter().setHealty(this.player.getCharacter().getHealty() - (this.player.getArmor().getDamagePrevention() - this.monster.getDamage()));
            } else {
                return this.player;
            }
        }
        System.out.println("Game Over!!!");
        return this.player;
    }
}