package Thread;

public class Counter extends Thread{
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + " : " + i);
        }
    }
}
