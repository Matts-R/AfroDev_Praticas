package Dia1.Carro;

import java.util.Random;

/**
 *
 * @author matheus
 */

/*Objetivo desse exercício é criar um metódo que altere algum dos atributos 
da Classe Carro*/
public class Carro {

    byte quantidadeDeCombustiveis;

    short quantidadeDePneus;

    int velocidadeMaxima;

    long kmRodados;

    float consumoMedio;

    double velocidadeMedia;

    boolean ligado;

    char etiquetaNacionalConservacaoDeEnergia;

    void mudaParaGastao() {
        this.etiquetaNacionalConservacaoDeEnergia = 'E';
    }

    void ligar() {
        this.ligado = true;
    }

    void desligar() {
        this.ligado = false;
        //metódo criado
    }

    long returnKmRodados() {
        Random random = new Random();
        this.kmRodados = random.nextLong();
        return this.kmRodados;
        //metódo criado
    }

    public static void main(String[] args) {

        Carro c = new Carro();

        c.etiquetaNacionalConservacaoDeEnergia = 'A';
        System.out.println(c.etiquetaNacionalConservacaoDeEnergia);
        c.mudaParaGastao();
        System.out.println(c.etiquetaNacionalConservacaoDeEnergia);

        System.out.println(c.ligado);
        c.ligar();
        System.out.println(c.ligado);
        c.desligar();
        System.out.println(c.ligado);
        
        System.out.println(c.kmRodados);
        c.returnKmRodados();
        System.out.println(c.kmRodados);

        System.out.println(c.velocidadeMedia);
        c.velocidadeMedia = 87.5D;
        System.out.println(c.velocidadeMedia);

    }

}
