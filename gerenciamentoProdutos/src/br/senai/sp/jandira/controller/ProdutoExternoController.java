package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;
import br.senai.sp.jandira.model.ProdutoExterno;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoExternoController {

    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();
    public void pesquisarProdutos(String codigo) throws SQLException {
        Statement statement = connection.createStatement();
        String queryPesquisa = "select * from produtos where codigo='"+codigo+"'";
    }

    public void cadastrarProdutos(ProdutoExterno produtoExterno) throws SQLException {
        Statement statement = connection.createStatement();
        String queryCadastro = "insert into produtos (nome, codigo, quantidade, preco, descricao, atributo, fornecedor, categoria, tamanho, cor, bluetooth) values ('" +
                produtoExterno.getNome() + "','" + produtoExterno.getCodigo() + "','" +
                produtoExterno.getQuantidade() + "','" + produtoExterno.getPreco() + "','" +
                produtoExterno.getDescricao() + "','" + produtoExterno.getAtributo() + "','" +
                produtoExterno.getFornecedor() + "','" + produtoExterno.getCategoria() + "','" +
                produtoExterno.getTamanho() + "','" + produtoExterno.getCor() + "','" + produtoExterno.getBluetooth() + "')";


    }

    public void deletarProdutos(String codigo) throws SQLException{
        Statement statement = connection.createStatement();
        String queryDeletar = "delete * from produtos where codigo='"+codigo+"'";
    }
}