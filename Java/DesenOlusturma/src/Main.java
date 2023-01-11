import java.util.Scanner;
public class Main {
    static void pattern(int number, boolean isNumber, int num){

        System.out.print(number + " ");

        if (isNumber){
            if (number <= 0){
                isNumber = false;
                number += 5;
                pattern(number, isNumber, num);
            } else {
                number -= 5;
                pattern(number, isNumber, num);
            }
        } else {
            if (number < num){
                number += 5;
                pattern(number, isNumber, num);
            }
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Desen sayısını giriniz: ");
        number = scanner.nextInt();

        pattern(number, true, number);
    }
}