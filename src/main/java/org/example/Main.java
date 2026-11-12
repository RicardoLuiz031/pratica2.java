package org.example;

import produto.Produtos;

public class Main {
    static void main(String[] args) {
        Produtos produto = new Produtos("teclado mecanico" , 250.0 , 15);
        System.out.println(produto);
        produto.adicionarEstoque(5);
        produto.setPreco(-50.0);
        produto.removerEstoque(2);
        System.out.println(produto);
    }
}
