import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, n3, secim;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayı: ");
        n1 = input.nextInt();
        System.out.print("2. sayı: ");
        n2 = input.nextInt();
        System.out.print("3. sayı: ");
        n3 = input.nextInt();

        System.out.println("1- Büyükten küçüğe\n2- Küçükten büyüğe");
        secim = input.nextInt();

        if (secim==1){
            if (n1>n2 && n1>n3){
                System.out.println(n1);
                if (n2>n3){
                    System.out.println(n2);
                    System.out.println(n3);
                }
            } else if (n2>n3 && n2>n1) {
                System.out.println(n2);
                if (n3>n1){
                    System.out.println(n3);
                    System.out.println(n1);
                }
            } else {
                System.out.println(n3);
                if (n2>n1){
                    System.out.println(n2);
                    System.out.println(n1);
                }
            }
        } else if (secim == 2) {
            if (n1<n2 && n1<n3){
                System.out.println(n1);
                if (n2<n3){
                    System.out.println(n2);
                    System.out.println(n3);
                }
            } else if (n2<n3 && n2<n1) {
                System.out.println(n2);
                if (n3<n1)
            {
                    System.out.println(n3);
                    System.out.println(n1);
                }
            } else {
                System.out.println(n3);
                if (n2<n1){
                    System.out.println(n2);
                    System.out.println(n1);
                }
            }
        } else {
            System.out.println("Hatalı seçim yaptınız.");
        }
    }
}