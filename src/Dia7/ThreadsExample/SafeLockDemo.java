package Dia7.ThreadsExample;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author matheus
 */
public class SafeLockDemo {
    
    private static AtomicInteger count = new AtomicInteger();
    
    public static Integer incremento(){
        return count.incrementAndGet();
    }
    
    public static Integer get(){
        return count.get();
    }
}
