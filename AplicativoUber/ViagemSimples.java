package AplicativoUber;

public class ViagemSimples implements Viagem {

    private double tarifaSimples;

    ViagemSimples(){
        this.setTarifaSimples(0.50);
    }

    public double getTarifaSimples() {
        return tarifaSimples;
    }

    public void setTarifaSimples(double tarifaSimples) {
        this.tarifaSimples = tarifaSimples;
    }

    @Override
    public void viajar(Pessoa p, Pessoa m, double distancia){
        System.out.println("O passageiro " + p + "solicitou uma viagem simples com o motorista " + m + ". Distancia: " +  distancia);
        System.out.println("O preço ficou em " + distancia * getTarifaSimples());
}

   
    }