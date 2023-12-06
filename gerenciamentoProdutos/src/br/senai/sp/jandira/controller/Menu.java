package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public void executarMenu() throws SQLException {
        boolean continuar = true;

        while (continuar){
            System.out.println("----- Gerenciamento de Produtos em estoque -----");
            System.out.println(" [1- Cadastrar produto]");
            System.out.println(" [2- Cadastrar cliente]");
            System.out.println(" [3- Pesquisar produto]");
            System.out.println(" [4- Pesquisar Cliente]");
            System.out.println("-----------------------------");
            System.out.println(" Outros:");
            System.out.println(" [5- Deletar produto]");
            System.out.println(" [6- Deletar Cliente]");
            System.out.println(" [7- Sair]");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            scanner.nextLine();

            ProdutoExternoController produtoController = new ProdutoExternoController();
            Cliente cliente = new Cliente();
            ClienteController clienteController = new ClienteController();

            if(opcao == 1){
                produto.cadastrarProduto();
            }else if(opcao == 2) {
                cliente.cadastrarCliente();
                clienteController.cadastrarClientes(cliente);
            }else if(opcao == 3){
                clienteController.pesquisarCliente(cliente);
            }else if(opcao == 4){
                System.out.print("Informe o CPF do cliente: ");
                String cpfPesquisa = scanner.nextLine();
                clienteController.pesquisarCliente(cpfPesquisa);
            }else if(opcao == 5){
                System.out.print("Informe o CPF do cliente:");
                String cpfDeletar = scanner.nextLine();
                clienteController.deletarCliente(cpfDeletar);
            }else if(opcao == 6){
                continuar = false;
            }
        }
    }
}