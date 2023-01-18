import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int  sayi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        sayi = scanner.nextInt();

        System.out.print("4'ün katları: ");
        for(int i = 4; i <= sayi; i *= 4){
            System.out.print(i + ", ");
        }

        System.out.print("\n5'in katları: ");
        for(int i = 5; i <= sayi; i *= 5){
            System.out.print(i + ", ");
        }
    }
}