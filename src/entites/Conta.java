package entites;

import exceptions.ContaBloqueadaException;
import exceptions.SaldoInsuficienteException;
import exceptions.ValorInvalidoException;

public abstract class Conta {
    private int numeroConta;
    private int agencia;
    private double saldo = 0;
    private boolean ativa;
    private Cliente titular;

    public Conta(int numeroConta, int agencia, double saldo, Cliente titular) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.ativa = true;
        this.titular = titular;
    }

    public void depositar(double valor){
        if(!isAtiva()){
            throw new ContaBloqueadaException("A conta está bloqueada");
        }else if(valor<=0){
            throw new ValorInvalidoException("Valor inválido");
        }
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(valor>getSaldo()){
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        if(!isAtiva()){
            throw new ContaBloqueadaException("A conta está bloqueada");
        }else if(valor<=0){
            throw new ValorInvalidoException("Valor inválido");
        }else {
            setSaldo(getSaldo()-valor-2);
        }
    };

    public void transferir(double valor, Conta destinatario){
       if(!isAtiva()){
            throw new ContaBloqueadaException("A conta do titular está bloqueada");
        }else if(!destinatario.isAtiva()){
            throw new ContaBloqueadaException("A conta do destinatário está bloqueada");
        }
        sacar(valor);
        depositar(valor);
    }

    public void consultarSaldo(){
        System.out.println("Saldo: R$"+getSaldo());
    }

    private void bloquear(){
        this.ativa = false;
    }
    private void desbloquear(){
        this.ativa = true;
    }

    private double getSaldo() {
        return saldo;
    }

    private boolean isAtiva() {
        return ativa;
    }

    public void mostrarDados() {
        System.out.println("Numero da conta: "+getNumeroConta()+
                "\n Agência: "+getAgencia()+
                "\n Titular: "+getTitular().getNome()+
                "\n Ativa:"+isAtiva());
    }

    private int getNumeroConta() {
        return numeroConta;
    }

    private int getAgencia() {
        return agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
