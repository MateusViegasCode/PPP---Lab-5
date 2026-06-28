package Exercicio1e2;

class BoletoPagamento implements PagamentoStrategy {
    public void realizaPagamento(double montante) {
        System.out.println(montante + " realizado via Boleto Bancário.");
    }
}
