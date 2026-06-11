public class TrechoRodovia
        implements MonitoravelViaIoT {

    private int quilometroInicial;
    private int quilometroFinal;
    private double nivelVegetacao;

    public TrechoRodovia(int quilometroInicial,
                         int quilometroFinal,
                         double nivelVegetacao) {

        this.quilometroInicial = quilometroInicial;
        this.quilometroFinal = quilometroFinal;
        this.nivelVegetacao = nivelVegetacao;
    }

    public double getNivelVegetacao() {
        return nivelVegetacao;
    }
    @Override
    public void transmitirDadosSensor() {

        System.out.println("Trecho KM " + quilometroInicial+
                " ao " + quilometroFinal + " --> Vegetação: " + nivelVegetacao + " cm");
    }
}
