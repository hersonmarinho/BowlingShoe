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
import bowlingshoe.ItemDevolucao;

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
            p.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return false;
    }

    public List<ItemDevolucao> getListaItensRetirados(ItemDevolucao devolucao) {
        String sql = "SELECT M.ID_MOVIMENTACAO, M.ID_FUNCIONARIO, C.NOME, M.CPF, S.ID_SAPATO, S.NOME_PRODUTO, S.NUMERO, M.STATUS\n"
                + "FROM MOVIMENTACAO M\n"
                + "JOIN CLIENTE C ON M.CPF = C.CPF\n"
                + "JOIN SAPATOS S ON M.ID_SAPATO = S.ID_SAPATO\n"
                + "JOIN FUNCIONARIO F ON M.ID_FUNCIONARIO = F.ID_FUNCIONARIO\n"
                + "WHERE M.CPF = ? AND M.DATA_MOV = ? AND M.STATUS = 'RETIRADA'";
        List<ItemDevolucao> lista = new ArrayList<>();
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setString(1, devolucao.getCpfCliente());
            p.setString(2, devolucao.getDataRetirada());
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                ItemDevolucao item = new ItemDevolucao();
                item.setIdFuncionario(rs.getInt("ID_FUNCIONARIO"));
                item.setNomeCliente(rs.getString("NOME"));
                item.setCpfCliente(rs.getString("CPF"));
                item.setIdSapato(rs.getInt("ID_SAPATO"));
                item.setNomeProduto(rs.getString("NOME_PRODUTO"));
                item.setNumeroProduto(rs.getInt("NUMERO"));
                item.setStatusMovimentacao(rs.getString("STATUS"));
                lista.add(item);
            }
            p.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL" + e.getMessage());
        }
        return lista;
    }

    public boolean alterarMovimentacao(Movimentacao movimentacao) {
        String sql = "UPDATE MOVIMENTACAO SET STATUS = 'DEVOLUÇÃO' WHERE ID_SAPATO = ?";
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setInt(1, movimentacao.getIdSap());
            if (p.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Movimentação realizada com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Movimentação não realizada com sucesso!");
            }
            p.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return false;
    }

}
