public class Main {

    public static void main(String[] args) {

        TrechoRodovia[] trechos =
                new TrechoRodovia[4];

        trechos[0] = new TrechoRodovia(0, 5, 20);

        trechos[1] = new TrechoRodovia(5, 10, 45);

        trechos[2] = new TrechoRodovia(10, 15, 70);

        trechos[3] = new TrechoRodovia(15, 20, 90);

        RocadaMecanizada rocada = new RocadaMecanizada();
        Pulverizacao pulverizacao = new Pulverizacao();

        System.out.println("\n===== RELATÓRIO DE PRIORIDADE =====\n");
        int posicao = 1;

        for (TrechoRodovia trecho : trechos) {
            if (trecho.getNivelVegetacao() >= 80) {
                System.out.println(posicao + ".");
                trecho.transmitirDadosSensor();
                System.out.println("Prioridade ALTA");
                rocada.executarServico();
                posicao++;
            }
        }

        for (TrechoRodovia trecho : trechos) {
            if (trecho.getNivelVegetacao() >= 40 && trecho.getNivelVegetacao() < 80) {
                System.out.println(posicao + ".");
                trecho.transmitirDadosSensor();
                System.out.println("Prioridade MÉDIA");
                pulverizacao.executarServico();
                posicao++;
            }
        }

        for (TrechoRodovia trecho : trechos) {
            if (trecho.getNivelVegetacao() < 40) {
                System.out.println(posicao + ".");
                trecho.transmitirDadosSensor();
                System.out.println("Prioridade BAIXA");
                System.out.println("-- Monitoramento Padrão --\n");
                posicao++;
            }
        }

    }
}
