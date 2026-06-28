package Exercicio4;

import java.util.ArrayList;
import java.util.List;

class Acao {
    private String nome;
    private double precoAtual;
    private List<InvestidorObserver> investidores;

    public Acao(String nome, double precoInicial) {
        this.nome = nome;
        this.precoAtual = precoInicial;
        this.investidores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double novoPreco) {
        this.precoAtual = novoPreco;
        notifyInvestidores();
    }

    public void addInvestidor(InvestidorObserver i) {
        investidores.add(i);
    }

    public void removeInvestidor(InvestidorObserver i) {
        investidores.remove(i);
    }

    private void notifyInvestidores() {
        for (InvestidorObserver investidor : investidores) {
            investidor.update(this, precoAtual);
        }
    }
}
