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

    public List<Movimentacao> getListaR(Cliente cliente) {
        String sql = "SELECT M.ID_MOVIMENTACAO, M.ID_FUNCIONARIO, C.NOME, M.CPF, S.NOME_PRODUTO, S.NUMERO, M.STATUS\n"
                + "FROM MOVIMENTACAO M\n"
                + "JOIN CLIENTE C ON M.CPF = C.CPF\n"
                + "JOIN SAPATOS S ON M.ID_SAPATO = S.ID_SAPATO\n"
                + "JOIN FUNCIONARIO F ON M.ID_FUNCIONARIO = F.ID_FUNCIONARIO\n"
                + "WHERE M.CPF = ?";
        List<Movimentacao> lista = new ArrayList<>();
        try {

            PreparedStatement p = DBconexao.getPreparedStatement(sql);
            p.setString(1, cliente.getCpf());
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                Movimentacao movimentacao = new Movimentacao();
                Cliente clienteBd = new Cliente();
                Sapato sapatoBd = new Sapato();
                movimentacao.setIdFun(rs.getInt("ID_FUNCIONARIO"));
                movimentacao.setCpfCliente(rs.getString("CPF"));
                clienteBd.setNome(rs.getString("NOME"));
                movimentacao.setCliente(clienteBd);
                sapatoBd.setNome(rs.getString("NOME_PRODUTO"));
                movimentacao.setSapato(sapatoBd);
                sapatoBd.setNumero(rs.getInt("NUMERO"));
                movimentacao.setSapato(sapatoBd);
                movimentacao.setStatus(rs.getString("STATUS"));
                lista.add(movimentacao);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL" + e.getMessage());
        }
        return lista;
    }

}
