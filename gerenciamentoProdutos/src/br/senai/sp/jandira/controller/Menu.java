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
            System.out.println("----- Gerenciamento de Produtos  -----");
            System.out.println("-----          em estoque        -----");
            System.out.println(" [1- Cadastrar produto]");
            System.out.println(" [2- Cadastrar cliente]");
            System.out.println(" [3- Pesquisar produto]");
            System.out.println(" [4- Pesquisar Cliente]");
            System.out.println("-----------------------------");
            System.out.println(" Outros:");
            System.out.println(" [5- Deletar produto]");
            System.out.println(" [6- Deletar Cliente]");
            System.out.println(" [7- Sair]");
            System.out.println("--------------------------------------");
            System.out.println("");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            scanner.nextLine();

            ProdutoExternoController produtoExternoController = new ProdutoExternoController();
            ProdutoInternoController produtoInternoController = new ProdutoInternoController();
            Cliente cliente = new Cliente();
            ClienteController clienteController = new ClienteController();

            switch (opcao){
                case 1:
                    System.out.println("Cadastrar produto:");
                    System.out.println("[1- Interno]");
                    System.out.println("[2- Externo]");
                    System.out.println("");
                    int resp = scanner.nextInt();
                    scanner.nextLine();

                    if(resp == 1){
                        ProdutoInterno produtoInterno = new ProdutoInterno();
                        produtoInterno.cadastrarProduto();
                        produtoInternoController.cadastrarProdutos(produtoInterno);
                    } else if (resp == 2){
                        ProdutoExterno produtoExterno = new ProdutoExterno();
                        produtoExterno.cadastrarProduto();
                        produtoExternoController.cadastrarProdutos(produtoExterno);
                    }
                    System.out.println("");
                    break;

                case 2:
                    clienteController.cadastrarClientes(cliente);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Pesquisar produto:");
                    System.out.println("[1- Interno]");
                    System.out.println("[2- Externo]");
                    System.out.println("");
                    int respPesqProd = scanner.nextInt();
                    scanner.nextLine();

                    if(respPesqProd == 1){
                        ProdutoInterno produtoInterno = new ProdutoInterno();
                        System.out.print("Digite o código do produto a ser pesquisado: ");
                        String codigo = scanner.nextLine();
                        produtoInternoController.pesquisarProdutos(codigo);

                    } else if(respPesqProd == 2){
                        ProdutoExterno produtoExterno = new ProdutoExterno();
                        System.out.print("Digite o código do produto a ser pesquisado: ");
                        String codigo = scanner.nextLine();
                        produtoExternoController.pesquisarProdutos(produtoExterno.getCodigo());
                    }
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Digite o CPF do cliente a ser pesquisado: ");
                    clienteController.pesquisarCliente(cliente.getCpf());
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Deletar produto:");
                    System.out.println("[1- Interno]");
                    System.out.println("[2- Externo]");
                    System.out.println("");
                    int respDeletar = scanner.nextInt();
                    scanner.nextLine();

                    if (respDeletar == 1){
                        ProdutoInterno produtoInterno = new ProdutoInterno();
                        System.out.print("Digite o código do produto a ser deletado: ");
                        String codigo = scanner.nextLine();
                        produtoInternoController.deletarProdutos(codigo);
                    } else if (respDeletar == 2) {
                        ProdutoExterno produtoExterno = new ProdutoExterno();
                        System.out.print("Digite o código do produto a ser deletado: ");
                        String codigo = scanner.nextLine();
                        produtoExternoController.deletarProdutos(codigo);
                    }
                    System.out.println("");
                    break;


                case 6:
                    System.out.print("Digite o CPF do cliente a ser deletado: ");
                    String cpf = scanner.nextLine();
                    clienteController.deletarCliente(cpf);
                    System.out.println("");
                    break;

                case 7:
                    continuar = false;
                    break;
            }
        }
    }
}