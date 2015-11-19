/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import bowlingshoe.Funcionario;
import bowlingshoe.FuncionarioDAO;
import bowlingshoe.MovimentacaoDAO;
import bowlingshoe.Sapato;
import bowlingshoe.SapatoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Herson
 */
public class DesativarSapato extends javax.swing.JDialog {

    public void atualizaTabela() {
        SapatoDAO dao = new SapatoDAO();
        listObjetos.clear();
        listObjetos.addAll(dao.getListaTodos());
        int linha = listObjetos.size() - 1;
        if (linha >= 0) {
            tbItens.setRowSelectionInterval(linha, linha);
            tbItens.scrollRectToVisible(tbItens.getCellRect(linha, linha, true));
        }
    }

    public DesativarSapato(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listObjetos = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Sapato>());
        idFun = new javax.swing.JLabel();
        idFuncionario = new javax.swing.JTextField();
        guiaSapato = new javax.swing.JTabbedPane();
        scrollSapato = new javax.swing.JScrollPane();
        tbItens = new javax.swing.JTable();
        btCancelar = new javax.swing.JButton();
        btDesativar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Desativar Item");
        setResizable(false);

        idFun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idFun.setText("ID Funcionario*:");

        tbItens.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listObjetos, tbItens);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numero}"));
        columnBinding.setColumnName("Número");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${status}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        scrollSapato.setViewportView(tbItens);

        guiaSapato.addTab("Itens", scrollSapato);

        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btDesativar.setText("DESATIVAR");
        btDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesativarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guiaSapato, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(idFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGap(331, 331, 331)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88)
                .addComponent(btDesativar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(idFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(idFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guiaSapato, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDesativar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesativarActionPerformed
        String idfuncionario = idFuncionario.getText();

        if (idfuncionario.equals("")) {
            idfuncionario = "0";
        }
        int IDFuncionario = Integer.parseInt(idfuncionario);
        if (IDFuncionario == 0) {
            JOptionPane.showMessageDialog(null, "Insira o ID do Funcionário!");
        } else {
            Funcionario funcionario = new Funcionario();
            funcionario.setIdFuncionario(IDFuncionario);
            FuncionarioDAO daoFuncionario = new FuncionarioDAO();
            if (daoFuncionario.pesquisarFuncionario(funcionario)) {
                Sapato sapato = new Sapato();
                SapatoDAO daoSapato = new SapatoDAO();
                int quantidadeSapatos = daoSapato.contarItens();
                if (quantidadeSapatos == 10) {
                    Object[] opcao = {"SIM", "NÃO"};

                    int n = JOptionPane.showOptionDialog(this, "Faltam 10 itens para ZERAR o estoque.\n"
                            + "Deseja continuar?", "Selecione uma opção!", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[1]);
                    if (n == 0) {
                        int linha = tbItens.getSelectedRow();
                        int coluna = tbItens.getSelectedColumn();

                        if (coluna != 0) {
                            JOptionPane.showMessageDialog(null, "Selecione o ID do item");
                        } else {
                            Object id = tbItens.getValueAt(linha, coluna);
                            int idItem = Integer.parseInt(id.toString());
                            sapato.setId(idItem);
                            daoSapato.desativarSapato(sapato);
                            atualizaTabela();
                        }
                    } else {
                        this.setVisible(false);
                    }
                }
                if (quantidadeSapatos > 0 && quantidadeSapatos != 10) {
                    int linha = tbItens.getSelectedRow();
                    int coluna = tbItens.getSelectedColumn();

                    if (coluna != 0) {
                        JOptionPane.showMessageDialog(null, "Selecione o ID do item");
                    } else {
                        Object id = tbItens.getValueAt(linha, coluna);
                        int idItem = Integer.parseInt(id.toString());
                        sapato.setId(idItem);
                        daoSapato.desativarSapato(sapato);
                        atualizaTabela();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não cadastrado!");
            }
        }
    }//GEN-LAST:event_btDesativarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        Object[] opcao = {"SIM", "NÃO"};

        int n = JOptionPane.showOptionDialog(this, "Tem certeza que "
                + "deseja cancelar a operação? ", "Selecione uma opção!", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[1]);
        if (n == 0) {
            DesativarSapato.this.setVisible(false);
        }
    }//GEN-LAST:event_btCancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDesativar;
    private javax.swing.JTabbedPane guiaSapato;
    private javax.swing.JLabel idFun;
    private javax.swing.JTextField idFuncionario;
    private java.util.List<Sapato> listObjetos;
    private javax.swing.JScrollPane scrollSapato;
    private javax.swing.JTable tbItens;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}