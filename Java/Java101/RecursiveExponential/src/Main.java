import java.util.Scanner;
public class Main {
    static int exponential(int number, int us){
        int result = 1;
        if (us == 1) return number;
        result = number * number;
        return exponential(number, us-1, result);
    }
    static int exponential(int number, int us, int result){
        if (us == 1) return result;
        result *= number;
        return exponential(number, us-1, result);
    }
    public static void main(String[] args) {
        int number, us;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        number = scanner.nextInt();
        System.out.print("Us giriniz: ");
        us = scanner.nextInt();

        System.out.println("Sonuç: " + exponential(number, us));


    }
}