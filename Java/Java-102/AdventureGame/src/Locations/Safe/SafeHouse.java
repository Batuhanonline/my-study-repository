package Locations.Safe;

import Game.Player;

public class SafeHouse extends SafeLocation{
    Player player;
    public SafeHouse(Player player){
        this.player = player;

        healPlayer();
    }

    Player healPlayer() {
        this.player.getCharacter().setHealty(this.player.getCharacter().getMaxHealty());
        return this.player;
    }
}
