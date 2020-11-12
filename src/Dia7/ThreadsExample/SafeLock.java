package Dia7.ThreadsExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author matheus
 */

/*O intuito desse exemplo é demonstrar como Threads e o ExecutorService funciona
adicionando Threads em uma pool e as organizando, de maneira que duas Threads não
"interajam" com o mesmo dado ao mesmo tempo, pois isso pode acarretar e irá 
acarretar em um erro
*/
public class SafeLock implements Runnable {

    @Override
    public void run() {
        do {
            SafeLockDemo.incremento();
            System.out.println(Thread.currentThread().getName() + " count: " + SafeLockDemo.get());
        } while (SafeLockDemo.get() < 11);
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new SafeLock());
        pool.execute(new SafeLock());
        
    }
}
