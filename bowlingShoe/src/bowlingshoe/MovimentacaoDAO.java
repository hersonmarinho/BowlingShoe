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
                JOptionPane.showMessageDialog(null, "Movimentação realizada!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Movimentacão não realizada!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return false;
    }
    
    
    public List<Movimentacao> getListaR() {
        String sql = "SELECT M.ID_MOVIMENTACAO, M.ID_FUNCIONARIO, F.NOME, M.CPF, C.NOME, S.NOME_PRODUTO, S.NUMERO, M.STATUS \n"
                + "    FROM MOVIMENTACAO M\n"
                + "    INNER JOIN CLIENTE C ON M.CPF = C.CPF\n"
                + "    INNER JOIN SAPATOS S ON M.ID_SAPATO = S.ID_SAPATO\n"
                + "    INNER JOIN FUNCIONARIO F ON M.ID_FUNCIONARIO = F.ID_FUNCIONARIO\n"
                + "WHERE M.CPF = ?";
        List<Movimentacao> lista = new ArrayList<>();
        try {
            Movimentacao movimentacao = new Movimentacao();
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setString(1, movimentacao.getCpfCliente());
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                Movimentacao obj = new Movimentacao();
                obj.setIdFun(rs.getInt("ID_FUNCIONARIO"));
                obj.setCpfCliente(rs.getString("CPF"));
                obj.setIdSap(rs.getInt("ID_SAPATO"));
                obj.setData(rs.getString("DATA_MOV"));
                obj.setStatus(rs.getString("STATUS"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL" + e.getMessage());
        }
        return lista;
    }
    
    
    
}
