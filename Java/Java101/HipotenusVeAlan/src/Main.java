import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c, cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print("İkinci kenarı giriniz: ");
        b = input.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Dik üçgenin hipotenüsü: " + c);
        cevre = a + b + c;
        System.out.println("Dik üçgenin çevresi: " + cevre);
    }
}