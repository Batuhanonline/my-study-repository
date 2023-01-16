public class Main {
    public static void main(String[] args) {
        int [] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double harmonik = 0, average;

        for (double number: list){
            harmonik += (1 / number);
        }

        average = list.length / harmonik;

        System.out.println("Harmonik seri: " + harmonik);
        System.out.println("Harmonik ortalaması: " + average);

    }
}