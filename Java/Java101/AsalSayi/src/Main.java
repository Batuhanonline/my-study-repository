import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi;
        boolean isAsal;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 2; i < sayi; i++){
            isAsal = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    isAsal = false;
                    break;
                }
            }
            if (isAsal){
                System.out.println(i);
            }
        }
    }
}