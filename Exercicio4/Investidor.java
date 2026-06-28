package Exercicio4;

class Investidor implements InvestidorObserver {
    private AcaoBroker broker;
    private double limiteMinimo;
    private double limiteMaximo;

    public Investidor(AcaoBroker broker, double limiteMinimo, double limiteMaximo) {
        this.broker = broker;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
    }

    public void update(Acao acao, double precoAtual) {
        if (precoAtual >= limiteMaximo) {
            broker.vender(acao, this);
        } else if (precoAtual <= limiteMinimo) {
            broker.comprar(acao, this);
        }
    }
}
