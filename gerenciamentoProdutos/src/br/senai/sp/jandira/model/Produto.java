package br.senai.sp.jandira.model;

import java.util.Scanner;

abstract class Produto {

    Scanner scanner = new Scanner(System.in);
    private String nome, descricao, atributo, codigo, fornecedor, categoria;
    private int id = 0, quantidade;
    private double preco;

    public Produto(String nome, String codigo, int quantidade, double preco, String descricao, String atributo, String fornecedor, String categoria) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
        this.descricao = descricao;
        this.atributo = atributo;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
    }

    public void cadastrarProduto() {
        System.out.println("----- CADASTRAR PRODUTO -----");
        System.out.print("Produto: ");
        this.nome = scanner.nextLine();
        System.out.print("Código: ");
        this.codigo = scanner.nextLine();
        System.out.print("Quantidade: ");
        this.quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Descrição: ");
        this.descricao = scanner.nextLine();
        System.out.print("Atributo: ");
        this.atributo = scanner.nextLine();
        System.out.print("Fornecedor: ");
        this.fornecedor = scanner.nextLine();
        System.out.print("Categoria: ");
        this.categoria = scanner.nextLine();

        System.out.println("// CADASTRO CONCLUÍDO //");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}