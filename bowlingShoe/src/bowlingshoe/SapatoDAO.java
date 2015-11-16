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
import javax.swing.JOptionPane;

/**
 *
 * @author herson.nmarinho
 */
public class SapatoDAO {

    public List<Sapato> getListaD() {
        String sql = "SELECT * FROM SAPATOS WHERE STATUS = 'D' ORDER BY NUMERO ASC";
        List<Sapato> lista = new ArrayList<>();
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                Sapato obj = new Sapato();
                obj.setId(rs.getInt("ID_SAPATO"));
                obj.setNome(rs.getString("NOME_PRODUTO"));
                obj.setNumero(rs.getInt("NUMERO"));
                obj.setStatus(rs.getString("STATUS"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL" + e.getMessage());
        }
        return lista;
    }

    public List<Sapato> getListaR() {
        String sql = "SELECT M.ID_MOVIMENTACAO, M.ID_FUNCIONARIO, F.NOME, M.CPF, C.NOME, S.NOME_PRODUTO, S.NUMERO, M.STATUS \n"
                + "    FROM MOVIMENTACAO M\n"
                + "    INNER JOIN CLIENTE C ON M.CPF = C.CPF\n"
                + "    INNER JOIN SAPATOS S ON M.ID_SAPATO = S.ID_SAPATO\n"
                + "    INNER JOIN FUNCIONARIO F ON M.ID_FUNCIONARIO = F.ID_FUNCIONARIO\n"
                + "WHERE M.CPF = '?"
                + "ORDER BY S.NUMERO ASC;";
        List<Sapato> lista = new ArrayList<>();
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                Sapato obj = new Sapato();
                obj.setId(rs.getInt("ID_MOVIMENTACAO"));
                obj.setNome(rs.getString("ID_FUNCIONARIO"));
                obj.setNumero(rs.getInt("NUMERO"));
                obj.setStatus(rs.getString("STATUS"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL" + e.getMessage());
        }
        return lista;
    }

    public boolean inserirSapato(Sapato sapato) {
        String sql = "INSERT INTO SAPATOS (NOME_PRODUTO, NUMERO, STATUS) VALUES (?,?,?)";
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setString(1, sapato.getNome());
            p.setInt(2, sapato.getNumero());
            p.setString(3, sapato.getStatus());
            if (p.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Item incluido com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Item não incluido com sucesso");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return false;
    }

    public boolean alterarSapatoR(Sapato sapato) {
        String sql = "UPDATE SAPATOS SET STATUS = 'R' WHERE ID_SAPATO = ?";
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setInt(1, sapato.getId());
            if (p.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Item retirado com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Item não retirado com sucesso");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return false;
    }

    public boolean alterarSapatoD(Sapato sapato) {
        String sql = "UPTADE SAPATOS SET STATUS = 'D' WHERE ID_SAPATO = ?";
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setInt(1, sapato.getId());
            if (p.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Item devolvido com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Item não devolvido com sucesso");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return false;
    }

}
