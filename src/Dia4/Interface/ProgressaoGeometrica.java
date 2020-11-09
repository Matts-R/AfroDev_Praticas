package Dia4.Interface;

/**
 *
 * @author matheus
 */
public class ProgressaoGeometrica implements GeraNumeros {

    @Override
    public void geraNumeros(int constante, int razao) {
        int numero = 1;

        for (int i = 0; i < razao; i++) {
            numero *= constante;
            System.out.print(numero + ", ");
        }
    }
}
