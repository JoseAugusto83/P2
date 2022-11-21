package AplicativoUber;

public class Passageiro extends Pessoa{ //Herança
    private double saldo; //quantia de dinheiro que o passageiro possui
    //Encapsulamento
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
