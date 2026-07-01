package entites;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numeroConta, int agencia, double saldo, Cliente titular) {
        super(numeroConta, agencia, saldo, titular);
    }

    @Override
    public void mostrarDados() {
        System.out.println("--- Conta Poupança ---");
        super.mostrarDados();

    }

}
