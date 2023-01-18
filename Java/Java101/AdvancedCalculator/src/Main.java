import java.util.Scanner;
public class Main {
    static void sum(){
        double n1, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        n1 = scanner.nextDouble();
        System.out.print("Sarı giriniz: ");
        n2 = scanner.nextDouble();

        System.out.println("Toplama: " + (n1 + n2));
    }

    static void extraction(){
        double n1, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        n1 = scanner.nextDouble();
        System.out.print("Sarı giriniz: ");
        n2 = scanner.nextDouble();

        System.out.println("Çıkarma: " + (n1 - n2));

    }

    static void multip(){
        double n1, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        n1 = scanner.nextDouble();
        System.out.print("Sarı giriniz: ");
        n2 = scanner.nextDouble();

        System.out.println("Çarpma: " + (n1 * n2));

    }

    static void division(){
        double n1, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        n1 = scanner.nextDouble();
        System.out.print("Sarı giriniz: ");
        n2 = scanner.nextDouble();

        if (n2 != 0){
            System.out.println("Bölme: " + (n1 / n2));
        } else {
            System.out.println("Bir sayı 0'a bölünemez!!!");
        }
    }

    static void exponential(){
        double n1, n2, expon = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban sayı giriniz: ");
        n1 = scanner.nextDouble();
        System.out.print("Üs sayı giriniz: ");
        n2 = scanner.nextDouble();

        for (int i = 0; i < n2; i++){
            expon *= n1;
        }
        System.out.println("Üs alma: " + expon);

    }

    static void factorial(){
        int n1, result=1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktoriyel sayısını giriniz: ");
        n1 = scanner.nextInt();

        for (int i = 1; i <= n1; i++){
            result *= i;
        }
        System.out.println("Faktoriyel: " + result);

    }

    static void modding(){
        double n1, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        n1 = scanner.nextDouble();
        System.out.print("Sayı giriniz: ");
        n2 = scanner.nextDouble();

        System.out.println("Kalanı: " + (n1 % n2));
    }

    static void rectangle(){
        double n1, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uzun kenarı giriniz(cm cimsinden): ");
        n1 = scanner.nextDouble();
        System.out.print("Kısa kenarı giriniz(cm cimsinden): ");
        n2 = scanner.nextDouble();

        System.out.println("Alan: " + (n1 * n2));
        System.out.println("Çevre: " + (((n1 * 2)) + (n2 * 2)));
    }
    public static void main(String[] args) {
        int select;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme\n5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n7- Mod alma\n8- Dikdörtgen Alan ve Çevre Hesabı");
        select = scanner.nextInt();

        switch (select){
            case 1:
                sum();
                break;
            case 2:
                extraction();
                break;
            case 3:
                multip();
                break;
            case 4:
                division();
                break;
            case 5:
                exponential();
                break;
            case 6:
                factorial();
                break;
            case 7:
                modding();
                break;
            case 8:
                rectangle();
                break;
            default:
                System.out.println("Geçersiz işlem girdisi!!!");

        }


    }
}