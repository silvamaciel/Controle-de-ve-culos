package com.veiculos.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String URL = "jdbc:mysql://localhost:3306/veiculos";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";

    public static Connection obterConexao(){
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        catch (SQLException e){
            throw new RuntimeException(" Erro ao obeter a conexão com o banco de dados ",e);
        }
    }
}
