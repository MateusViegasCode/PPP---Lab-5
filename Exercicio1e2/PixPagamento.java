package Exercicio1e2;

class PixPagamento implements PagamentoStrategy {
    public void realizaPagamento(double montante) {
        System.out.println(montante + " realizado via Pix.");
    }
}
