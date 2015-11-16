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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    public boolean inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO CLIENTE (NOME, IDADE, EMAIL, TELEFONE, CPF, RG) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setString(1, cliente.getNome());
            p.setInt(2, cliente.getIdade());
            p.setString(3, cliente.getEmail());
            p.setString(4, cliente.getTelefone());
            p.setString(5, cliente.getCpf());
            p.setString(6, cliente.getRg());
            if (p.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro não realizado!");
            }
        } catch (SQLException e){
            String erro = e.getMessage();
            if (erro.equalsIgnoreCase("[SQLITE_CONSTRAINT] Abort due to constraint violation (UNIQUE constraint failed:CLIENTE.CPF)")){
                erro = "CPF JÁ CADASTRADO";
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + erro);
            }
            else
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + erro);
        }
        return false;
    }
    
    
    

}
