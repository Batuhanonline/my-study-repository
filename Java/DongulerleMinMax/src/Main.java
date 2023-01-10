import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i= 0, dongu, sayi, kSayi = 1000, bSayi = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksizin: ");
        dongu = scanner.nextInt();

        while (i < dongu){
            System.out.print("Sayı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi < kSayi) kSayi = sayi;

            if (sayi > bSayi) bSayi = sayi;

            i++;
        }

        System.out.println("Büyük sayı: " + bSayi);
        System.out.println("Küçük sayı: " + kSayi);

    }
}