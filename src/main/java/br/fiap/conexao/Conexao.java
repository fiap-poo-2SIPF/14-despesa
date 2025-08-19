package br.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static String USER = "";
    private static String PASSWORD = "";
    private static Connection conexao;

    public static Connection conectar() {
        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e) {
            System.out.println("Erro ao conectar no banco de dados\n" + e);
        }
        return conexao;
    }

}
