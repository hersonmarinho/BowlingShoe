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
import javax.swing.JOptionPane;

/**
 *
 * @author Herson
 */
public class FuncionarioDAO {

    public boolean pesquisarFuncionario(Funcionario funcionario) {
        String sql = "SELECT * FROM FUNCIONARIO WHERE ID_FUNCIONARIO = ?";
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setInt(1, funcionario.getIdFuncionario());
            ResultSet rs = p.executeQuery();
            int verificarDado = 0;
            while (rs.next()) {
                verificarDado++;
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return false;
    }

}
