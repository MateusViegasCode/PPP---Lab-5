package Exercicio1e2;

class CartaoPagamento implements PagamentoStrategy {
    public void realizaPagamento(double montante) {
        System.out.println(montante + " realizado via Cartão de Crédito.");
    }
}
