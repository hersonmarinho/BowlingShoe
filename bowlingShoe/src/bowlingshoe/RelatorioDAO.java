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
 * @author Ester Valéria
 */
public class RelatorioDAO {

    public List<ItemDevolucao> getMostraRelatorio(ItemDevolucao devolucao) {
        String sql = "SELECT M.ID_MOVIMENTACAO, M.ID_FUNCIONARIO, C.NOME, M.CPF, S.ID_SAPATO, S.NOME_PRODUTO, S.NUMERO, M.STATUS\n"
                + "FROM MOVIMENTACAO M\n"
                + "JOIN CLIENTE C ON M.CPF = C.CPF\n"
                + "JOIN SAPATOS S ON M.ID_SAPATO = S.ID_SAPATO\n"
                + "JOIN FUNCIONARIO F ON M.ID_FUNCIONARIO = F.ID_FUNCIONARIO\n";

        List<ItemDevolucao> lista = new ArrayList<>();
        try {
            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                ItemDevolucao item = new ItemDevolucao();

                item.setIdMovimentacao(rs.getInt("ID_MOVIMENTACAO"));
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

}
