package AplicativoUber;

public class Motorista extends Pessoa{ //Herança
    private String veiculo;
    private String avaliacao;
    //Encapsulamento
    public String getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    public String getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
}
