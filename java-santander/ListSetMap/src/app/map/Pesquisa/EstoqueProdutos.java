package app.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtos);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if(!produtos.isEmpty()){
            for (Produto produto : produtos.values()) {
                valorTotal += produto.getQuantidade() * produto.getPreco();
            }
        }
        System.out.println("Valor total do estoque: " + valorTotal);
        return valorTotal;
    }


    public void obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;
        if(!produtos.isEmpty()){
            for (Produto produto : produtos.values()) {
                if (produto.getPreco() > precoMaisCaro) {
                    produtoMaisCaro = produto;
                    precoMaisCaro = produto.getPreco();
                }
            }
        }

        System.out.println("Produto mais caro: " + produtoMaisCaro);
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1, "Produto1", 10, 20.0);
        estoqueProdutos.adicionarProduto(2, "Produto2", 5, 15.0);
        estoqueProdutos.adicionarProduto(3, "Produto3", 3, 30.0);

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.calcularValorTotalEstoque();
        estoqueProdutos.obterProdutoMaisCaro();



    }

}
