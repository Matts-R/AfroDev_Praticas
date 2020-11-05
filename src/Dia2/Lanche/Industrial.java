package Dia2.Lanche;

/**
 *
 * @author matheus
 */
/*O objetivo desse exercício é simplesmente demonstrar como a Herança (um dos 
pilares da POO) funciona.
 */
public class Industrial extends Hamburguer {

    public Industrial() {
        super.precoPadrao -= 1.0;
        /*Digamos que os Hamburgues DO TIPO Insdustrial tenham um valor inferior
        A palavra reservada super serve para fazer referência a atributos e 
        metódos da Classe Superior, nessa caso a Classe Hamburguer*/
    }

    public static void main(String[] args) {
        Hamburguer hamburguerIndustrial = new Industrial();

        System.out.println(hamburguerIndustrial.precoPadrao);
        //Saída: 6.8
    }
}
