package Dia2.Relogio;

import java.util.Random;

/**
 *
 * @author matheus
 */
public class PonteiroSegundos {
    private final Random segundos = new Random();
    
    public int exibeSegundos(){
        return segundos.nextInt(60) + 1;
        //Usei a classe Random apenas para fins didáticos
        //Esse metódo irá retornar um número aleatório entre 1 e 60
    }
}
