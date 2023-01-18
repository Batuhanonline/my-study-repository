import java.util.Scanner;
public class Main {
    static String isAsal(int number){
        int num = number - 1;
        if (num == 1){
            return "Sayı asaldır.";
        } else if (number % num == 0){
            return "Sayı asal değildir.";
        } else {
            return isAsal(number, num-1);
        }
    }
    static String isAsal(int number, int num){
        if (num == 1){
            return "Sayı asaldır.";
        } else if (number % num == 0){
            return "Sayı asal değildir.";
        } else {
            return isAsal(number, num-1);
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sorgulanacak sayı: ");
        number = scanner.nextInt();

        System.out.println(isAsal(number));
    }
}