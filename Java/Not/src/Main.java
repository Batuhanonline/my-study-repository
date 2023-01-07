import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, tarih, muzik;
        double sonuc;
        String durum;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz");
        fizik = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz");
        muzik = input.nextInt();

        sonuc = (mat + fizik + turkce + tarih + muzik) / 5;
        System.out.println("Not ortlamanız: " + sonuc);


        durum = (sonuc >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
    }
}