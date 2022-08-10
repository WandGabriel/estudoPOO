package concessionaria.carro;

public class Carro {
    String modelo;
    int anoFabricacao;
    Double preco;

    public Carro(String modelo, int anoFabricacao, Double preco) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public Double getPreco() {
        return preco;
    }
}
