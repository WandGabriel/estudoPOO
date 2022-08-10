import concessionaria.carro.Carro;
import concessionaria.pessoa.Cliente;
import concessionaria.pessoa.Funcionario;
import concessionaria.pessoa.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Concessionaria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Carro fiat = new Carro("Fiat - Uno",2010,15000.00);
        Carro celta = new Carro("Corsa",2000,17000.00);
        Carro renegade = new Carro("Renegade",2022,127590.00);
        Carro hyundai = new Carro("ix35",2022,124990.00);

        Pessoa pessoa = new Pessoa("Wanderson","Rua CM-14",62996964495L,139);

        Cliente clienteUm = new Cliente("Estela","São Paulo",1198765432L,2,15000.00);

        pessoa.compraCarro(renegade,clienteUm);
        Funcionario funcionario = new Funcionario("Vendedor","Rua CM-14",11951983941L,123,25);

    }
}
