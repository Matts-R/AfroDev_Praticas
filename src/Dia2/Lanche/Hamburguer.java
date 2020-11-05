package Dia2.Lanche;

/**
 *
 * @author matheus
 */

/*O objetivo desse exercício é simplesmente demonstrar como a Herança (um dos 
pilares da POO) funciona.
 */
public class Hamburguer extends Lanche {

    protected double precoPadrao = 7.80;
    //Vamos supor que o preço padrão de um hamburguer seja R$ 7.80

    public static void main(String[] args) {
        Hamburguer hamburguer = new Hamburguer();

        System.out.println(hamburguer.numeroPaes);
        //Saída: 2, pois esse valor é HERDADO de Lanche
        System.out.println(hamburguer.precoPadrao);
        /*Saída: 7.80, pois esse valor foi informado nesta Classe, dessa maneira
          o valor HERDADO de Lanche é sobrescrito*/

    }
}
