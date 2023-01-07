import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut = 2.14, armutkilo,
                elma = 3.67, elmakilo,
                domates = 1.11, domateskilo,
                muz = 0.95, muzkilo,
                patlıcan = 5, patlıcankilo,
                total;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo? ");
        armutkilo = input.nextDouble();

        System.out.print("Elma kaç kilo? ");
        elmakilo = input.nextDouble();

        System.out.print("Domates kaç kilo? ");
        domateskilo = input.nextDouble();

        System.out.print("Muz kaç kilo? ");
        muzkilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? ");
        patlıcankilo = input.nextDouble();

        total = armut*armutkilo+elma*elmakilo+domates*domateskilo+muz*muzkilo+patlıcan*patlıcankilo;

        System.out.println("Toplam tutar: " + total);
        System.out.println(Integer.MAX_VALUE);
    }
}