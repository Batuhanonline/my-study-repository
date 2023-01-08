import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km,total=0, price=0.10;
        int age, tip;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = scanner.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        age = scanner.nextInt();
        System.out.println("1- Tek yön\n2- Gidiş-Dönüş");
        tip = scanner.nextInt();

        if((km>0) && (age>0)){
            total = price*km;
            if (age<12){
                total -= total*0.5;
            } else if (age<24) {
                total -= total*0.1;
            } else if (age>65) {
                total -= total*0.3;
            }
            if (tip == 2){
                total -= total*0.2;
                total *= 2;
            }
            System.out.println("Toplam tutar: " + total);
        } else {
            System.out.println("Hatalı veri girdiniz !");
        }

    }
}