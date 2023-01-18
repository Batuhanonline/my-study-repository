import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birth;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        birth = scanner.nextInt();

        if (birth%12 == 0){
            System.out.println("Maymun");
        } else if (birth % 12 == 1) {
            System.out.println("Horoz");
        } else if (birth % 12 == 2) {
            System.out.println("Köpek");
        } else if (birth % 12 == 3) {
            System.out.println("Domuz");
        } else if (birth % 12 == 4) {
            System.out.println("Fare");
        } else if (birth % 12 == 5) {
            System.out.println("Öküz");
        } else if (birth % 12 == 6) {
            System.out.println("Kaplan");
        } else if (birth % 12 == 7) {
            System.out.println("Tavşan");
        } else if (birth % 12 == 8) {
            System.out.println("Ejderha");
        } else if (birth % 12 == 9) {
            System.out.println("Yılan");
        } else if (birth % 12 == 10) {
            System.out.println("At");
        } else if (birth % 12 == 11) {
            System.out.println("Koyun");
        }
    }
}