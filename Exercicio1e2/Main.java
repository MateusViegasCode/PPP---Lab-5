package Exercicio1e2;

class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionaItem(new Item("Livro GoF", 150.00));

        carrinho.realizaPagamento(new PixPagamento(), new SedexFrete());
    }
}
