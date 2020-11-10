package Dia6;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class MapExercise {

    public static void main(String[] args) {

        Map<Double, Double> map = new HashMap<>();
        Double chave = Double.parseDouble(JOptionPane
                .showInputDialog("Favor informe um número para que seu logaritom seja calculado"));
        Double logaritmo;

        Double valorObtido = map.get(chave);

        map.computeIfAbsent(chave, valor -> Math.log(chave));
        /*Usando o metódo computeIfAbsent caso uma chave não exista ou caso seu 
        respectivo valor seja null, nos fornecemos uma função que irá criar essa 
        chave e produzir um valor para ela
        */
        
        System.out.println(map.get(chave));
    }
}
