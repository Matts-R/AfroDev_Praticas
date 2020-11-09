package Dia4.Abstracao;

/**
 *
 * @author matheus
 */
public class Subtracao extends Calculadora {

    @Override
   protected double calcula(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

}
