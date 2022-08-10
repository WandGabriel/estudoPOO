package concessionaria.pessoa;

import concessionaria.carro.Carro;

public class Cliente extends Pessoa{

    Double valorEmDinheiro;

    public Cliente(Double valorEmDinheiro) {
        super();
    }

    public Cliente(String nome, String endereco, long telefone, int numeroMatricula, Double valorEmDinheiro) {
        super(nome, endereco, telefone, numeroMatricula);
        this.valorEmDinheiro = valorEmDinheiro;
    }

    public String toString(Pessoa pessoa){
        return pessoa.getNome();
    }
}
