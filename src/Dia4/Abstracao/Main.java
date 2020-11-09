package Dia4.Abstracao;

/**
 *
 * @author matheus
 */
public class Main {
    public static void main(String[] args) {
        
        Subtracao subtracao = new Subtracao();
        Soma soma = new Soma();
        
        double resultSoma = 0;
        double resultSubtracao = 0;
        
        soma.fazCalculo(12, 45);
        subtracao.fazCalculo(12, 45);
        
    }
   
}
