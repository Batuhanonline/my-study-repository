package LambdaExpressions;

public class Main {
    public static void main(String[] args) {


        /*
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r1 sınıfı");
            }
        };
        r1.run();

        //Lamda Expression kullanarak yazma

        Runnable r2 = () -> System.out.println("r2 sınıfı");
        r2.run();
         */

        Matematik toplama = (a, b) -> a + b;
        Matematik cikarma = (a, b) -> a - b;
        Matematik carpma = (a, b) -> a * b;
        Matematik bolme = (a, b) -> {
            if (b == 0) {
                b = 1;
            }
            return a / b;
        };




    }
}
