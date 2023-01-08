import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik<5){
            System.out.println("Bu sıcaklıkta kayak yapmalısınız.");
        } else if (sicaklik<15){
            System.out.println("Sinemaya gitmelisiniz.");
        } else if (sicaklik < 25) {
            System.out.println("Piknik güzel olur");
        } else {
            System.out.println("Tam yüzme havası");
        }
    }
}