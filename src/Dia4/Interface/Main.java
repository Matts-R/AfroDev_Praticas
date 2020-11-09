package Dia4.Interface;

/**
 *
 * @author matheus
 */
public class Main {
    public static void main(String[] args) {
        
        GeraNumeros pa = new ProgressaoAritmetica();
        GeraNumeros pg = new ProgressaoGeometrica();
        
        pa.geraNumeros(3, 6);
        System.out.println("\n");
        pg.geraNumeros(3, 6);
    }
}
