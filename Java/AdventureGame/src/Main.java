import Game.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        System.out.println(game.getPlayer().getArmor().getDamagePrevention());
    }
}