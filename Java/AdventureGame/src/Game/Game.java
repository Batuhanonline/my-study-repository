package Game;

import Characters.Archer;
import Characters.CharacterPlayer;
import Characters.Knight;
import Characters.Samurai;
import Locations.Battle.Cave;
import Locations.Battle.Forest;
import Locations.Battle.River;
import Monsters.Vampire;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Player player;
    boolean isAlive = true;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public Game(){
        player = new Player(selectCharacter());
        selectLocationLoop();
    }

    public Player getPlayer() {
        return player;
    }

    CharacterPlayer selectCharacter(){
        CharacterPlayer character;
        System.out.println("Lütfen karakter seçimi yapınız.");
        System.out.print("1- Samuray\n2- Okçu\n3- Şovalye\n");
        int select = scanner.nextInt();

        switch (select) {
            case 1 -> character = new Samurai();
            case 2 -> character = new Archer();
            case 3 -> character = new Knight();
            default -> {
                System.out.println("Seçim yanlış yapıldığından dolayı şovalye karakteri atandı!!!");
                character = new Knight();
            }
        }

        return character;
    }



    void playerValues(){
        System.out.println("Can değeri: " + player.character.getHealty());
    }

    void selectLocationLoop() {
        int selectLocation;
        while (this.isAlive){
            playerValues();

            System.out.println("Gitmek istediğiniz konumu seçiniz.");
            System.out.println("1- Güvenli Ev: Sağlık yenile\n" +
                    "2- Mağaza: Destekleyici eşya satın al\n" +
                    "3- Mağara\n" +
                    "4- Orman\n" +
                    "5- Nehir");
            selectLocation = scanner.nextInt();

            switch (selectLocation){
                case 3 -> new Cave(player);
                case 4 -> new Forest(player);
                case 5 -> new River(player);
                default -> {
                    System.out.println("Seçim yanlış olduğundan dolayı eve gittin!!!");
                }
            }

        }
    }




}
