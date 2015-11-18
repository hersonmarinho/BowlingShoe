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
                + "WHERE M.CPF = ? AND M.DATA_MOV = ?";
        List<ItemDevolucao> lista = new ArrayList<>();
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setString(1, devolucao.getCpfCliente());
            p.setString(1, devolucao.getDataRetirada());
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                devolucao.setIdFuncionario(rs.getInt("ID_FUNCIONARIO"));
                devolucao.setNomeCliente(rs.getString("NOME"));
                devolucao.setCpfCliente(rs.getString("CPF"));
                devolucao.setIdSapato(rs.getInt("ID_SAPATO"));
                devolucao.setNomeProduto(rs.getString("NOME_PRODUTO"));
                devolucao.setNumeroProduto(rs.getInt("NUMERO"));
                devolucao.setStatusMovimentacao(rs.getString("STATUS"));
                lista.add(devolucao);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL" + e.getMessage());
        }
        return lista;
    }

}
