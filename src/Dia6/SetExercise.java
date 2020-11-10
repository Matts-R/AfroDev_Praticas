package Dia6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author matheus
 */
public class SetExercise {
    
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();
        Scanner input = new Scanner(System.in);

        nomes.add("Matheus");
        nomes.add("Carlos");
        nomes.add("Lucas");
        nomes.add("Fernando");
        nomes.add("Matheus");
        nomes.add("Maria");
        nomes.add("Jose");
        nomes.add("Jose");
        nomes.add("Marcos");
        nomes.add("Fernando");
        nomes.add("Caio");

        System.out.println("Implementação TreeSet");
        nomes.stream().forEach(nome -> System.out.println(nome));
        
        Set<String> nomes2 = new TreeSet<>(nomes);
        System.out.println("\nImplementação TreeSet");
        nomes2.stream().forEach(nome -> System.out.println(nome));
    }
}
