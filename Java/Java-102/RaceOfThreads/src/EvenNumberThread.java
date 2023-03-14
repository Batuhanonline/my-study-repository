import java.util.ArrayList;

public class EvenNumberThread implements Runnable{
    private ArrayList<Integer> numbers = new ArrayList<>();
    private ArrayList<Integer> evenNumbers = new ArrayList<>();
    private int counter = 0;

    public EvenNumberThread(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    synchronized void plusCounter() {
        this.counter++;
    }

    synchronized int getCounter() {
        return this.counter;
    }

    synchronized void addEvenNumbers(Integer number) {
        this.evenNumbers.add(number);
    }

    public synchronized ArrayList<Integer> getEvenNumbers() {
        return this.evenNumbers;
    }

    @Override
    public void run() {
        Integer number = numbers.get(getCounter());
        System.out.println(number);
        if (number % 2 == 0) {
            addEvenNumbers(number);
        }
        plusCounter();
    }
}
