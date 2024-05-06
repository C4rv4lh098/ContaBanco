package OperacoesBasicas.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : carrinho){
            if (item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotalItem(){
        double valorTotalCarrinho = 0;
        for (Item item : carrinho){
            valorTotalCarrinho += item.getPreco() * item.getQuantidade();
        }
        return valorTotalCarrinho;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Coca-Cola 1,5L", 7.50, 3);
        carrinhoDeCompras.adicionarItem("Baré 2L", 4.50, 3);
        carrinhoDeCompras.adicionarItem("Massa para Bolo, sabor Chocolate", 5, 4);
        carrinhoDeCompras.adicionarItem("Macarrão", 4.20, 5);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("coca-cola 1,5L");
        carrinhoDeCompras.exibirItens();

        System.out.println("Valor total da compra é: " + carrinhoDeCompras.calcularValorTotalItem());
    }
}
