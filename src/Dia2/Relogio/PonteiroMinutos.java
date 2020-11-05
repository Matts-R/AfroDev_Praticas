
package Dia2.Relogio;

import java.util.Random;

/**
 *
 * @author matheus
 */
public class PonteiroMinutos {
    private final Random minutos = new Random();
    
    public int exibeMinutos(){
        return minutos.nextInt(60) + 1;
        //Usei a classe Random apenas para fins didáticos
        //Esse metódo irá retornar um número aleatório entre 1 e 60
    }
}
