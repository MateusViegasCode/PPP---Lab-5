package Exercicio1e2;

import java.util.ArrayList;
import java.util.List;

class CarrinhoCompras {
    private List<Item> itens;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

// Questao 2
    public double calculaFrete(FreteStrategy freteStrategy) {
        return freteStrategy.calculaFrete();
    }

    public void realizaPagamento(PagamentoStrategy pagamentoStrategy, FreteStrategy freteStrategy) {
        double totalComFrete = calculaTotal() + calculaFrete(freteStrategy);
        pagamentoStrategy.realizaPagamento(totalComFrete);
    }
}
