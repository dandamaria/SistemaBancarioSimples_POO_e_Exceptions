package entites;

import exceptions.ContaBloqueadaException;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numeroConta, int agencia, double saldo, Cliente titular) {
        super(numeroConta, agencia, saldo, titular);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor-2);
    }

    @Override
    public void mostrarDados() {
        System.out.println("--- Conta Corrente ---");
        super.mostrarDados();
    }
}
