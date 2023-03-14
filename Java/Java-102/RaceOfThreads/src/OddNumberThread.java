import java.util.ArrayList;

public class OddNumberThread implements Runnable{
    private ArrayList<Integer> numbers = new ArrayList<>();
    private ArrayList<Integer> oddNumbers = new ArrayList<>();
    private int counter = 0;

    public OddNumberThread(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    synchronized void plusCounter() {
        this.counter++;
    }

    synchronized int getCounter() {
        return this.counter;
    }

    synchronized void addOddNumbers(Integer number) {
        this.oddNumbers.add(number);
    }

    public synchronized ArrayList<Integer> getOddNumbers() {
        return this.oddNumbers;
    }

    @Override
    public void run() {
        Integer number = numbers.get(getCounter());
        if (number % 2 != 0) {
            addOddNumbers(number);
        }
        plusCounter();
    }
}
