import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km, total= 10, kmTutar = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen km: ");
        km = input.nextDouble();

        total += (kmTutar * km);
        total = (total<20) ? 20 : total;

        System.out.println("Toplam ödemeniz gereken tutar: " + total);
    }
}