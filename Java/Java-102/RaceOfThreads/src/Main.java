import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10000);
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        // 1'den 10000'e kadar olan sayıları ArrayList'e ekle
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        // 4 eşit parçaya ayır
        int partSize = 2500;
        ArrayList<ArrayList<Integer>> numberParts = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i += partSize) {
            numberParts.add(new ArrayList<>(numbers.subList(i, Math.min(i + partSize, numbers.size()))));
        }

        // 4 ayrı Thread ile tek ve çift sayıları bul
        ArrayList<Thread> threads = new ArrayList<>();
        for (ArrayList<Integer> part : numberParts) {
            Thread evenThread = new Thread(() -> {
                for (Integer number : part) {
                    if (number % 2 == 0) {
                        synchronized (evenNumbers) {
                            evenNumbers.add(number);
                        }
                    }
                }
            });
            Thread oddThread = new Thread(() -> {
                for (Integer number : part) {
                    if (number % 2 != 0) {
                        synchronized (oddNumbers) {
                            oddNumbers.add(number);
                        }
                    }
                }
            });
            threads.add(evenThread);
            threads.add(oddThread);
            evenThread.start();
            oddThread.start();
        }

        // Tüm Thread'lerin bitmesini bekle
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Çift: " + evenNumbers);
        System.out.println("Tek: " + oddNumbers);


    }
}