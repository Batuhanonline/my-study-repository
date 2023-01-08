import java.time.Year;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yılı giriniz: ");
        year = scanner.nextInt();
        if(year%100 == 0){
            if (year%400 == 0){
                System.out.println(year + " bir artık yıldır.");
            } else {
                System.out.println(year + " bir artık yıl değildir.");
            }
        } else {
            if (year%4 == 0){
                System.out.println(year + " bir artık yıldır.");
            } else {
                System.out.println(year + " bir artık yıl değildir.");
            }
        }
    }
}