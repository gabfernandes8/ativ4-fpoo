package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;
import br.senai.sp.jandira.model.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoController {

    Conexao Conecao = new Conexao();
    Connection connection = Conecao.getConnection();
    public void pesquisarProdutos(Integer id) throws SQLException {
        Statement statement = connection.createStatement();
        String queryPesquisa = "select * from clientes where cpf='"+id+"'";
    }

    public void cadastrarProdutos(Cliente cliente) throws SQLException {
        Statement statement = connection.createStatement();
        String queryCadastro = "insert into clientes (nome, cpf, email) values ('" +
                cliente.getNome() + "','" + cliente.getCpf() + "','" +
                cliente.getEmail() + "');";


    }
}

}
