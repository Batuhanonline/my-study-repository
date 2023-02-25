package Locations;

import Game.Player;

abstract public class Location {
    Player player;
    int ID;
    String name;
    boolean isSafeLocation;

    public Location(Player player, int ID, String name, boolean isSafeLocation) {
        this.player = player;
        this.ID = ID;
        this.name = name;
        this.isSafeLocation = isSafeLocation;
    }
}
