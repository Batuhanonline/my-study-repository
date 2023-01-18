import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        //int number = (int) (Math.ramdom() * 100);
        int number = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int guessNum;

        int count = 5;
        int[] wrongNumbers = new int[5];

        while (count > 0){
            System.out.print("Sayı tahmininiz: ");
            guessNum = scanner.nextInt();

            if (count == 3) {
                System.out.println("Son üç hakkınız kaldı.");
            } else if (count == 2) {
                System.out.println("Son iki hakkınız kaldı.");
            } else if (count == 1) {
                System.out.println("Son bir hakkınız kaldı.");
            }

            if (guessNum < 0 || 100 < guessNum){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz.");
                count--;
            } else {
                if (number == guessNum) {
                    System.out.println("Tebrikler oyunu kazandınız.");
                    break;
                } else {
                    System.out.println("Tahminiz yanlıştır.");
                    wrongNumbers[5 - count] = guessNum;
                    count--;
                    if (guessNum < number) {
                        System.out.println(guessNum + " sayısı küçüktür.");
                    } else if (number < guessNum) {
                        System.out.println(guessNum + " sayısı büyüktür.");
                    }
                }
            }
        }

        if (count == 0){
            System.out.println("Maalesef oyunu kaybettiniz.");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrongNumbers));
            System.out.println("Doğru sayı: " + number);
        }

    }
}