import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int left = 0, right = 1, sup, basamak;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        basamak = scanner.nextInt();

        for (int i = 0; i <= basamak; i++){
            System.out.print(left + ", ");
            sup = right;
            right += left;
            left = sup;
        }

    }
}