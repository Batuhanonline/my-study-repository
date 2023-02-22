package Locations.Battle;

import Game.Player;
import Monsters.Monster;
import Monsters.Vampire;

public class Forest extends BattleLocation{

    public Forest(Player player, Vampire vampire) {
        super(player, 1, "Forest", false, 1, 3);
    }


}
