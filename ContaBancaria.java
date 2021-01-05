package Parte1;

public class ContaBancaria {

    private int num_conta;
    private double saldo;

    public ContaBancaria(int num_conta, double saldo) {
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Valor indisponível para saque");
        }
    }

    public void depositar(double valor) {

        setSaldo(getSaldo() + valor);

    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
