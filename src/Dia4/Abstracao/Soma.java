package Dia4.Abstracao;

import java.io.File;

/**
 *
 * @author matheus
 */
public class Soma extends Calculadora {

    
    @Override
    protected double calcula(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}
