import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double total, kdv, fiyat;
        Scanner input = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz: ");
        fiyat = input.nextDouble();

        kdv = (fiyat > 1000) ? 0.08 : 0.18;
        total = fiyat + (fiyat * kdv);

        System.out.println("KDV dahil toplam: " + total);
    }
}