package br.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private String USER = "";
    private String PASSWORD = "";
    private Connection conexao;

    public Connection conectar() {
        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e) {
            System.out.println("Erro ao conectar no banco de dados\n" + e);
        }
        return conexao;
    }

}
