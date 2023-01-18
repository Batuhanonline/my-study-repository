import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, ort = 0, gecmeNotu = 55;
        int ders=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matemetik Notunuz: ");
        mat = input.nextDouble();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextDouble();
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextDouble();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextDouble();
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextDouble();

        if ((0 <= mat) && (mat <= 100)){
            ort += mat;
            ders++;
        } else {
            System.out.println("Matematik notunuz geçersizdir.");
        }
        if ((0 <= fizik) && (fizik <= 100)){
            ort += fizik;
            ders++;
        } else {
            System.out.println("Fizik notunuz geçersizdir.");
        }
        if ((0 <= turkce) && (turkce <= 100)){
            ort += turkce;
            ders++;
        } else {
            System.out.println("Türkçe notunuz geçersizdir.");
        }
        if ((0 <= kimya) && (kimya <= 100)){
            ort += kimya;
            ders++;
        } else {
            System.out.println("Kimya notunuz geçersizdir.");
        }
        if ((0 <= muzik) && (muzik <= 100)){
            ort += muzik;
            ders++;
        } else {
            System.out.println("Müzik notunuz geçersizdir.");
        }

        ort = ort/ders;

        if (ort>=gecmeNotu){
            System.out.println("Tebrikler sınıfı başarıyla geçtiniz. Ortalamanız: " + ort);
        } else {
            System.out.println("Üzgünüz sınıfta kaldınız. Ortalamanız: \" + ort");
        }


    }
}