package Dia6.ComparandoObjetos;

import java.util.*;

/**
 *
 * @author matheus
 */

/*O objetivo desta atividade é criar uma lista de Pessoa (uma classe criada para 
esse exercício) e então ordenar essa lista, o primeiro paramêtro deorganização é 
o nome da pessoa e caso haja duas pessoas com nomes iguais, a idade será usada como
segundo paramêtro de ordenação.
Veja o arquivo Pessoa para ter detalhes da implementação dos respectivos metódos 
usados para ordenação.
*/
public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        String nome;

        int idade;

        for (int i = 0; i < 10; i++) {
            System.out.print("\nFavor informe seu nome: ");
            nome = input.nextLine();

            System.out.printf("%s favor informe sua idade: ", nome);
            idade = input.nextInt();
            input.nextLine();

            pessoas.add(new Pessoa(nome, idade));
        }

        try {

            System.out.println("Lista antes da ordenação ...");
            pessoas.forEach(pessoa -> System.out.println(pessoa));

            Collections.sort(pessoas);

            System.out.println("\nLista depois da ordenação ...");
            pessoas.forEach(pessoa -> System.out.println(pessoa));

            input.close();

        } catch (NomeInvalidoException nie) {
            System.out.println(nie.getMessage());
        } catch (IdadeInvalidaException iie) {
            System.out.println(iie.getMessage());
        }
    }
}
