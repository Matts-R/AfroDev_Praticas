package Dia4.Abstracao;

/**
 *
 * @author matheus
 */
public abstract class Calculadora {

    protected abstract double calcula(double firstNumber, double secondNumber);

    protected void fazCalculo(double firstNumber, double secondNumber) {
        double result;
        
        inicioOperacao();
        result = calcula(firstNumber, secondNumber);
        System.out.println(result);
        fimOperacao();
    }

    private void inicioOperacao() {
        System.out.println("Inicio da Operação");
    }

    private void fimOperacao() {
        System.out.println("Final da Operação");
    }

}
