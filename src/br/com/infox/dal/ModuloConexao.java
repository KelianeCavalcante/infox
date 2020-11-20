package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {

    //método responsavel por estabelecer a conexao com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //a linha abaixo chama o driver 
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informacoes referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // a linha abaixo serve de apoio para esclarecer o erro 
            //System.out.println(e);
            return null;
        }

    }

}
