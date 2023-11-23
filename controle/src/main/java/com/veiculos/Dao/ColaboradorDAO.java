package com.veiculos.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.veiculos.Model.Colaborador;
import com.veiculos.Utilities.ConexaoBanco;

public class ColaboradorDAO {
    public void adicionarColaborador(Colaborador colaborador) {
        String sql = "INSERT INTO colaborador (nome, cpf, telefone, email, endereco, cargo, salario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoBanco.obterConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, colaborador.getNome());
            stmt.setString(2, colaborador.getMatricula());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir um colaborador no banco de dados. Origem: " + e.getMessage());
        }
    }
}
