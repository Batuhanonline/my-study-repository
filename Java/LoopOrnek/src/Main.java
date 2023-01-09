import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, four = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            sayi = scanner.nextInt();
            if (sayi % 4 == 0){
                four += sayi;
            }
        } while (sayi % 2 == 0);

        System.out.println("4'e tam bölünen sayıların toplamı: " + four);
    }
}