import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, count = 1, kay;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        n = scanner.nextInt();

        for (int i = 0; i<n; i++){
            kay = n - i - 1;
            for (int j = 0; j < kay; j++){
                System.out.print(" ");
            }
            for (int j = 0; j<count; j++){
                System.out.print("*");
            }
            System.out.println();

            count += 2;

        }
        kay = 0;
        count -= 4;
        for (int i = n; 1<i; i--){
            kay++;
            for (int j = 0; j < kay; j++){
                System.out.print(" ");
            }
            for (int j = 0; j<count; j++){
                System.out.print("*");
            }
            System.out.println();

            count -= 2;

        }
    }
}