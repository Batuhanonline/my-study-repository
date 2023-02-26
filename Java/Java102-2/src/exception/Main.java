package exception;

import java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws AgeCheckExeption {
        if (age < 18) {
            throw new AgeCheckExeption("Yaşınız tutmuyor");
        }

        System.out.println("Yaşı uygundur.");
    }
    public static void main(String[] args) {
//        System.out.println("Program başladı");
//
//        int a = 0;
//        int b = 20;
//        try {
//            System.out.println(b/a);
//        } catch (Exception e) {
//            System.out.println(e.getMessage() );
//        }
//
//        System.out.println("Program bitti.");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();
        try{
            checkAge(age);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Program bitti.");

    }
}
