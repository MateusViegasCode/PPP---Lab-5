package Exercicio4;

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao("Teste", 30.00);

        AcaoBroker broker = new AcaoBroker();

        Investidor investidor = new Investidor(broker, 25.00, 40.00);

        acao.addInvestidor(investidor);

        acao.setPreco(35.00);

        acao.setPreco(42.00);

        acao.setPreco(24.00);
    }
}