import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++){
            if (sayi % i == 0){
                total += i;
            }
        }

        if (total == sayi){
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}