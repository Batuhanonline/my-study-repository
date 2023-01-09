import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, r, sonuc;
        Scanner scanner = new Scanner(System.in);

        System.out.print("N sayısı: ");
        n = scanner.nextInt();
        System.out.print("R sayısı: ");
        r = scanner.nextInt();

        sonuc = kombinasyon(n)/(kombinasyon(r)*kombinasyon(n-r));
        System.out.println(sonuc);
    }

    private static int kombinasyon(int a) {
        int total = 0;
        for (int i = 1; i<=a; i++){
            total += i * a;
        }
        return total;
    }
}