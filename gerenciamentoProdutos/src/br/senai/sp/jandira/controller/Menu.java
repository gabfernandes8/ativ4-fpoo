package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.ProdutoExterno;
import br.senai.sp.jandira.model.ProdutoInterno;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public void executarMenu() throws SQLException {
        boolean continuar = true;

        while (continuar){
            System.out.println("----- Gerenciamento de Produtos em estoque -----");
            System.out.println(" [1- Cadastrar produto interno]");
            System.out.println(" [2- Cadastrar produto externo]");
            System.out.println(" [3- Cadastrar cliente]");
            System.out.println(" [4- Pesquisar produto interno]");
            System.out.println(" [5- Pesquisar produto externo]");
            System.out.println(" [6- Pesquisar Cliente]");
            System.out.println("-----------------------------");
            System.out.println(" Outros:");
            System.out.println(" [7- Deletar produto]");
            System.out.println(" [8- Deletar Cliente]");
            System.out.println(" [9- Sair]");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            scanner.nextLine();

            ProdutoExternoController produtoExternoController = new ProdutoExternoController();
            ProdutoInternoController produtoInternoController = new ProdutoInternoController();
            ProdutoExterno produtoExterno = new ProdutoExterno();
            ProdutoInterno produtoInterno = new ProdutoInterno();
            Cliente cliente = new Cliente();
            ClienteController clienteController = new ClienteController();

            if(opcao == 1){
                produtoInternoController.cadastrarProdutos(produtoInterno);
            }else if(opcao == 2) {
                produtoExternoController.cadastrarProdutos(produtoExterno);
            }else if(opcao == 3){
                clienteController.cadastrarClientes(cliente);
            }else if(opcao == 4){
                produtoInternoController.pesquisarProdutos(produtoInterno.getCodigo());
            }else if(opcao == 5){
                produtoExternoController.pesquisarProdutos(produtoExterno.getCodigo());
            }else if(opcao == 6){
                clienteController.pesquisarCliente(cliente.getCpf());
            } else if {

            }
        }
    }
}