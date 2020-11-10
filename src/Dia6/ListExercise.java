package Dia6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author matheus
 */
public class ListExercise {

    public static void main(String[] args) {
        List<String> listaAprovados = new ArrayList<>();

        listaAprovados.add("Maria");
        listaAprovados.add("Joao");
        listaAprovados.add("Antonio");
        listaAprovados.add("Ana");
        listaAprovados.add("joao");
        listaAprovados.add("Fernanda");

        listaAprovados.forEach((aprovado) -> System.out.println(aprovado));

        Collections.sort(listaAprovados);
        listaAprovados.forEach((aprovado) -> System.out.println(aprovado));
    }
}
