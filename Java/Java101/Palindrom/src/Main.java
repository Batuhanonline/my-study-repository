import java.util.Scanner;
public class Main {
    static boolean polindrom(int number){

        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return reverseNumber == number;
    }
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıs giriniz: ");
        number = scanner.nextInt();

        System.out.println(polindrom(number));

    }
}