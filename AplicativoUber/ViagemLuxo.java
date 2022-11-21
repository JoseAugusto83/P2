package AplicativoUber;

public class ViagemLuxo implements Viagem {
    private double distancia;
    public double getDistancia() {
        return distancia;
    }


    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    private double tarifaLuxo;

    public double getTarifaLuxo() {
        return tarifaLuxo;
    }


    public void setTarifaLuxo(double tarifaLuxo) {
        this.tarifaLuxo = tarifaLuxo;
    }

    @Override
    public void viajar(Pessoa p, Pessoa m, double distancia){
        this.setDistancia(distancia);
        System.out.println("O passageiro " + p + "solicitou uma viagem de luxo com o motorista " + m + ". Distancia: " +  distancia);
        System.out.println("O preço ficou em " + distancia * getTarifaLuxo());
}
   
    }