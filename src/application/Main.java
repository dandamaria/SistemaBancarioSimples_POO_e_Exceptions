package application;

import entites.Cliente;
import entites.Conta;
import entites.ContaCorrente;
import entites.ContaPoupanca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //LocalDate.parse(dataTexto, formatter)
        Cliente cliente = new Cliente("João", "203.023.342-17", LocalDate.of(1990,5,30));
        Cliente cliente1 = new Cliente("Eva", "200.150.370-17", LocalDate.of(1970, 12, 20));


        ContaPoupanca conta1_cliente = new ContaPoupanca(1023, 001, 1_020.69, cliente);
        ContaCorrente conta2_cliente = new ContaCorrente(1003, 002, 800.50, cliente);

        ContaPoupanca conta1_cliente1 = new ContaPoupanca(1023, 001, 1_020.69, cliente1);
        ContaCorrente conta2_cliente1 = new ContaCorrente(1023, 001, 620.19, cliente1);

        conta1_cliente1.mostrarDados();
        conta2_cliente.mostrarDados();

    }
}