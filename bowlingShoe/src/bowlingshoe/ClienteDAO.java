/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingshoe;

import dbconexao.DBconexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {

    public boolean inserirPessoa(Cliente pessoa) {
        String sql = "INSERT INTO PESSOA (NOME) VALUES (?)";
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setString(1, pessoa.getNome());
            if (p.executeUpdate() > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro não realizado!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return false;
    }
    
    public boolean inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO CLIENTE (IDADE, EMAIL, TELEFONE, CPF, RG) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setInt(1, cliente.getIdade());
            p.setString(2, cliente.getEmail());
            p.setString(3, cliente.getTelefone());
            p.setString(4, cliente.getCpf());
            p.setString(5, cliente.getRg());
            if (p.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Clinte cadastrado com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro não realizado!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return false;
    }
    
    
    

}
