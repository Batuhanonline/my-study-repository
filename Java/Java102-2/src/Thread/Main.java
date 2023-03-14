package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        Counter c1 = new Counter("Counter-1");
        Counter c2 = new Counter("Counter-2");

        c1.start();
        c2.start();
         */

        //Runnable interface ini kullanarak thread oluşturma
        /*
        CounterRunnable c1 = new CounterRunnable("c1");
        CounterRunnable c2 = new CounterRunnable("c2");
        CounterRunnable c3 = new CounterRunnable("c3");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
         */

        //Thread durdurmak ve bekletmek
        /*
        Thread t1 = new Thread(new CounterSleep("c1", 1));
        t1.start();
         */

        // Kritik Bölümler (Critical Sections) ve Veriye Erişim Yarışması (Race Condition)

        /*
        Thread t1 = new Thread(new OrderMatic());
        t1.start();
        t1.join();

        Thread t2 = new Thread(new OrderMatic());
        t2.start();
        t2.join();

         */

        /*
        OrderMatic orderMatic = new OrderMatic();
        List<Thread> islemler = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(orderMatic);
            islemler.add(t);
            t.start();
        }

        System.out.println(orderMatic.getOrderNo());

         */

        //ThreadPooling
        /*
        OrderMatic orderMatic = new OrderMatic();

        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            pool.execute(orderMatic);
        }

        System.out.println(orderMatic.getOrderNo());
         */
    }
}
