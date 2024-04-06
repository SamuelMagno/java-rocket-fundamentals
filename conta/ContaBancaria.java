package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    
    public ContaBancaria() {
        this.saldo = 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    void Depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito realizado: R$%s. Saldo atual: R$%s", valor, this.saldo);
        } else {
            System.out.println("Depósito inválido");
        }
    }

    void Sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.printf("Saque realizado: R$%s. Saldo atual: R$%s", valor, this.saldo);
        } else {
            System.out.println("Saque inválido");
        }
    }
}
