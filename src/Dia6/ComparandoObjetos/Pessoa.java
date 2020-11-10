package Dia6.ComparandoObjetos;

import java.util.Objects;

/**
 *
 * @author matheus
 */
public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        if (nome == null) {
            throw new NomeInvalidoException("Desculpe, mas esse nome não é válido");
        } else if (idade < 0 || idade > 130 || idade == null) {
            throw new IdadeInvalidaException("Desculpe, mas essa idade não é válida");
        }

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.idade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        int nameCompare = this.nome.compareTo(pessoa.getNome());
        return (nameCompare != 0 ? nameCompare : this.idade.compareTo(pessoa.getIdade()));
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade();
    }

}
