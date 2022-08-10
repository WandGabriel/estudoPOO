package concessionaria.pessoa;

import concessionaria.carro.Carro;

public class Funcionario extends Pessoa{
    int numeroRegistro;

    public Funcionario(int numeroRegistro) {
        super();
    }

    public Funcionario(String nome, String endereco, long telefone, int numeroMatricula, int numeroRegistro) {
        super(nome, endereco, telefone, numeroMatricula);
        this.numeroRegistro = numeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public void vendeCarro(Carro carro) {
        System.out.println("Especificação: ");
        System.out.println("Modelo: "+ carro.getModelo());
        System.out.println("Ano: "+carro.getAnoFabricacao());
        System.out.printf("Preço: R$" + String.format("%.2f",carro.getPreco()));
    }

    public void verificaValorCliente(){

    }
}
