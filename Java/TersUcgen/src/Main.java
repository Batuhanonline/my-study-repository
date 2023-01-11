import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int basamak, k = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        basamak = scanner.nextInt();

        for (int i = 0; i < basamak; i++){

            for (int j = i; j > 0; j--){
                System.out.print(" ");
            }

            for (int j = 0; j < (basamak*2)-k; j++){
                System.out.print("*");
            }

            k += 2;
            System.out.println();
        }
    }
}