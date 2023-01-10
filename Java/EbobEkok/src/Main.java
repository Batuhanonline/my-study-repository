import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, kSayi, bSayi, ebob = 0, ekok = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextInt();

        if (n1<n2){
            kSayi = n1;
            bSayi = n2;
        } else {
            kSayi = n2;
            bSayi = n1;
        }

        //EBOB
        for (int i = kSayi; i > 0; i--){
            if ((kSayi % i == 0) && (bSayi % i == 0)){
                ebob = i;
                break;
            }
        }

        //EKOK
        for (int i = 1; i <= (kSayi * bSayi); i++){
            if ((i % kSayi == 0) && (i % bSayi == 0)){
                ekok = i;
                break;
            }
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

    }
}