import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14, r, alan, cevre;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        alan = pi*r*r;
        cevre = 2*pi*r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
    }
}