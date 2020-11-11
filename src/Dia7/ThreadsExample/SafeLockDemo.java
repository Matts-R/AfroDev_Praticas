package Dia7.ThreadsExample;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author matheus
 */
public class SafeLockDemo {
    
    public static int count = 0;
    
    public static int incremento(){
        return ++count;
    }
    
    public static int get(){
        return count;
    }
}
