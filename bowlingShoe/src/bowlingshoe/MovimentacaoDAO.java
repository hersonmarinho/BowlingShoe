/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingshoe;

import dbconexao.DBconexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Herson
 */
public class MovimentacaoDAO {
    
    public boolean inserirMovimentacao(Movimentacao movimentacao) {
        String sql = "INSERT INTO MOVIMENTACAO (ID_FUNCIONARIO, CPF, ID_SAPATO, DATA_MOV, STATUS) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setInt(1, movimentacao.getIdFun());
            p.setString(2, movimentacao.getCpfCliente());
            p.setInt(3, movimentacao.getIdSap());
            p.setString(4, movimentacao.getData());
            p.setString(5, movimentacao.getStatus());
            if (p.executeUpdate() > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Movimentacão não realizada!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return false;
    }
    
    
    
    
}
