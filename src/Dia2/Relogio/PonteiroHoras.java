
package Dia2.Relogio;

import java.util.Random;

/**
 *
 * @author matheus
 */
public class PonteiroHoras {
    private final Random horas = new Random();
    
    public int exibeHoras(){
        return horas.nextInt(12) + 1;
        //Usei a classe Random apenas para fins didáticos
        //Esse metódo irá retornar um número aleatório entre 1 e 12
    }
}
