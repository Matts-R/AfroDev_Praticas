package Dia2.Lanche;

/**
 *
 * @author matheus
 */

/*O objetivo desse exercício é simplesmente demonstrar como a Herança (um dos 
pilares da POO) funciona.
 */
public class Artesanal extends Hamburguer {

    public Artesanal(int quantidadeCarne) {
        super.precoPadrao += (numeroPaes * 1.20);
        /*Digamos que o Hamburguer DO TIPO Artesanal tenha o mesmo valor de 
        Hambuguer mais um acrescimo R$ 1.20 para cada carne adicional que ele 
        possa ter.
         */
    }
    
    public static void main(String[] args) {
        
        Hamburguer hamburguerArtesanal = new Artesanal(3);
        
        System.out.println(hamburguerArtesanal.precoPadrao);
        //Saída: 10.2
    }

}
