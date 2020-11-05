package Dia2.Relogio;

/**
 *
 * @author matheus
 */
public class Relogio {

    private final PonteiroHoras ponteiroHoras;
    private final PonteiroMinutos ponteiroMinutos;
    private final PonteiroSegundos ponteiroSegundos;

    private final int Numero = 2;

    /*Tornando todos os atributos privados para protege-los e final para que seus
      valores não possam ser sobrescritos em nenhum momento*/

    public Relogio() {
        this.ponteiroHoras = new PonteiroHoras();
        this.ponteiroMinutos = new PonteiroMinutos();
        this.ponteiroSegundos = new PonteiroSegundos();
        //Inicializando os ponteiros somente quando um relógio for criado
    }

    public void mostraHoras() {
        System.out.println("Horas: " + this.ponteiroHoras.exibeHoras()
                + "\nMinutos: " + this.ponteiroMinutos.exibeMinutos()
                + "\nSegundos: " + this.ponteiroSegundos.exibeSegundos());
    }

    public static void main(String[] args) {

        Relogio relogio = new Relogio();
        relogio.mostraHoras();
    }
}
