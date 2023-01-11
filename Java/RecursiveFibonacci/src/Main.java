public class Main {
    static int fibonacci(int n){
        int number;
        if (n == 1 || n == 2){
            return 1;
        }

        number = fibonacci(n-1) + fibonacci(n -2);
        return number;

    }
    public static void main(String[] args) {

        int fibNumber = 6;

        System.out.println(fibonacci(fibNumber));
    }
}