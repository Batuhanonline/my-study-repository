package Game;

import Characters.Archer;
import Characters.CharacterPlayer;
import Characters.Knight;
import Characters.Samurai;

import java.util.Scanner;

public class Game {
    Player player;

    Scanner scanner = new Scanner(System.in);

    public Game(){
        player = new Player(selectCharacter());
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





}
