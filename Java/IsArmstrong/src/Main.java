import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, supSayi, basamak, i=0, total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        sayi = scanner.nextInt();
        supSayi = sayi;
        while (supSayi != 0){
            supSayi /= 10;
            i++;
        }
        supSayi = sayi;

        while (supSayi != 0){
            basamak = 1;
            for(int j =1; j <= i; j++){
                basamak *= (supSayi % 10);
            }
            total += basamak;
            supSayi /= 10;
        }

        if (total == sayi){
            System.out.println("Sayı armstrong.");
        } else {
            System.out.println("Sayı armstrong değil.");
        }


    }
}