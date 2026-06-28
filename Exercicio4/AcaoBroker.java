package Exercicio4;

class AcaoBroker {
    public void vender(Acao acao, Investidor investidor) {
        System.out.println("Broker: Ação vendida " + acao.getNome());
    }
    public void comprar(Acao acao, Investidor investidor) {
        System.out.println("Broker: Ação comprada " + acao.getNome());
    }
}

