package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conexao;
import br.senai.sp.jandira.model.ProdutoInterno;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoInternoController {

    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();
    public void pesquisarProdutos(String codigo) throws SQLException {
        Statement statement = connection.createStatement();
        String queryPesquisa = "select * from produtos where codigo='"+codigo+"'";
    }

    public void cadastrarProdutos(ProdutoInterno produtoInterno) throws SQLException {
        Statement statement = connection.createStatement();
        String queryCadastro = "insert into produtos (nome, codigo, quantidade, preco, descricao, atributo, fornecedor, categoria, memoria, ram, nucleo) values ('" +
                produtoInterno.getNome() + "','" + produtoInterno.getCodigo() + "','" +
                produtoInterno.getQuantidade() + "','" + produtoInterno.getPreco() + "','" +
                produtoInterno.getDescricao() + "','" + produtoInterno.getAtributo() + "','" +
                produtoInterno.getFornecedor() + "','" + produtoInterno.getCategoria() + "','" +
                produtoInterno.getMemoria() + "','" + produtoInterno.getRam() + "','" + produtoInterno.getNucleo() + "')";


    }
}