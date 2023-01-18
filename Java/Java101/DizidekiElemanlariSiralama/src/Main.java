import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
        // Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Dizinin boyutu: ");
        n = scanner.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++){
            System.out.print((i+1) + ". Elemanı: ");
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);
        for (int num: nums){
            System.out.print(num + " ");
        }
    }
}