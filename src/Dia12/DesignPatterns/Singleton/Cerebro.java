package Dia12.DesignPatterns.Singleton;

/**
 *
 * @author matheus
 */
public class Cerebro {
    private static Cerebro instacia;
    
    private Cerebro() {
    }
    
    public synchronized static Cerebro getInstance() {
        if (instacia == null) {
            instacia = new Cerebro();
        }
        return instacia;
    }
}