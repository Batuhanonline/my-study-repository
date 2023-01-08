import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int islem;
        double sayi1, sayi2;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayı: ");
        sayi1 = input.nextDouble();
        System.out.print("İkinci sayı: ");
        sayi2 = input.nextDouble();
        System.out.print("1- Toplama \n2- Çıkarma \n3- Çarpma \n4- Bölme \nİşleminizi seçiniz: ");
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.println(sayi1 + sayi2);
                break;
            case 2:
                System.out.println(sayi1 - sayi2);
                break;
            case 3:
                System.out.println(sayi1 * sayi2);
                break;
            case 4:
                if (sayi2 != 0){
                    System.out.println(sayi1 / sayi2);
                } else {
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Hatalı işlem girdiniz");
        }
    }
}