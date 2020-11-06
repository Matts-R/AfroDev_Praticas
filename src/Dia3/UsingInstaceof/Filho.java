package Dia3.UsingInstaceof;

/**
 *
 * @author matheus
 */
public class Filho extends Pai {
//Irá resultar em um erro de compilação, pois a classe Pai é final
    void metodoMaisNovo() {
        System.out.println("Metodo da classe filho");
    }

    @Override
    void metodoMaisVelho() {
        /*Irá resultar em um erro de compilação, pois o metódo metodoMaisVelho()
        é final*/
        System.out.println("Metodo da classe pai foi sobrescrito");
    }
}
