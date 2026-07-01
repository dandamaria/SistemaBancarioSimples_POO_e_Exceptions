package entites;

import exceptions.ContaBloqueadaException;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numeroConta, int agencia, double saldo, Cliente titular) {
        super(numeroConta, agencia, saldo, titular);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor-2);
    }

    @Override
    public void transferir(double valor, Conta destinatario) {
        super.transferir(valor, destinatario);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public void mostrarDados() {
        System.out.println("--- Conta Corrente ---");
        super.mostrarDados();
    }
}
