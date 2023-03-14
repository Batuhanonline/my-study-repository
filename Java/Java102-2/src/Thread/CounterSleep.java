package Thread;

public class CounterSleep implements Runnable{
    private String name;
    private int id;

    public CounterSleep(String name, int id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public void run() {
        System.out.println(this.name + " Çalıştı.");
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000L * this.id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.name + " : " + i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
