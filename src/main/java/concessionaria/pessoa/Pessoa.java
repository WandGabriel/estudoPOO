package concessionaria.pessoa;

import concessionaria.carro.Carro;

public class Pessoa {

    String nome;
    String endereco;
    long telefone;
    int numeroMatricula;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, long telefone, int numeroMatricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void compraCarro(Carro carro, Cliente pessoa){
        System.out.println(pessoa);
        System.out.printf(String.format("%.2f",pessoa.valorEmDinheiro));
    }
}
