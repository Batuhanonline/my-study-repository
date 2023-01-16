import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0], max = list[0];
        int num;

        Scanner scanner = new Scanner(System.in);

        for (int number: list){
            if ((number < min)){
                min = number;

            } else if ((max < number)) {
                max = number;
            }
        }

        System.out.println("Max: " + max + "\nMin: " + min);


        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

        System.out.print("Sayıyı giriniz: ");
        num = scanner.nextInt();
        Arrays.sort(list);
        min = list[0];
        max = list[list.length-1];

        for (int number: list){
            if ((num < number) && (number < max)){
                max = number;
            } else if ((number < num) && (min < number)) {
                min = number;
            }
        }

        System.out.println("Küçük en yakın sayı: " + min + "\nBüyük en yakın sayı: " + max);


    }
}