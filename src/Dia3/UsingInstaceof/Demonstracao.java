package Dia3.UsingInstaceof;

/**
 *
 * @author matheus
 */
public class Demonstracao {

    public static void main(String[] args) {

        final int numero = 12;
        
        /*numero = 23;
        Exemplificando o uso da palavra reservada final, que não permite que um valor seja
        atribuido a uma variável que já possui um valor e é final*/
        
        Pai p = new Pai();  
        p = new Filho();
        Filho f = new Filho();

        if (p instanceof Pai) {
            System.out.println("p é uma instância de Pai");
        }
        if (p instanceof Filho) {
            System.out.println("p é uma instância de Filho");
        }
        if (f instanceof Pai) {
            System.out.println("f é uma instância de Pai");
        }
        if (f instanceof Filho) {
            System.out.println("f é uma instância de Filho");
        }
    }
}
