package Dia7.ThreadsExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author matheus
 */
public class SafeLock implements Runnable {

    public static AtomicInteger inteiro = new AtomicInteger();

    @Override
    public void run() {
        do {
            System.out.println(Thread.currentThread().getName() + " count: " + SafeLockDemo.incremento());
        } while (SafeLockDemo.get() < 11);
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new SafeLock());
        pool.execute(new SafeLock());
        
    }
}
