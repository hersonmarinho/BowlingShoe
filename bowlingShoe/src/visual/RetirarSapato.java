/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import bowlingshoe.Movimentacao;
import bowlingshoe.MovimentacaoDAO;
import bowlingshoe.Sapato;
import bowlingshoe.SapatoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hmarinho
 */
public class RetirarSapato extends javax.swing.JDialog {

    SapatoDAO dao = new SapatoDAO();

    public void atualizaTabela() {
        listObjetos.clear();
        listObjetos.addAll(dao.getListaD());
        int linha = listObjetos.size() - 1;
        if (linha >= 0) {
            tbItens.setRowSelectionInterval(linha, linha);
            tbItens.scrollRectToVisible(tbItens.getCellRect(linha, linha, true));
        }
    }

    /**
     * Creates new form ItensRetirar
     */
    public RetirarSapato(java.awt.Frame parent, boolean modal) {
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

        listObjetos = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Sapato>())
        ;
        guiaItens = new javax.swing.JTabbedPane();
        painelItens = new javax.swing.JPanel();
        painelComItens = new javax.swing.JScrollPane();
        tbItens = new javax.swing.JTable();
        scrollTab = new javax.swing.JScrollBar();
        idFuncionario = new javax.swing.JLabel();
        idFun = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btRetirar = new javax.swing.JButton();
        dadoCliente = new javax.swing.JLabel();
        cpfCliente = new javax.swing.JFormattedTextField();
        dMov = new javax.swing.JLabel();
        dataMov = new javax.swing.JFormattedTextField();
        infos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Itens Disponíveis");
        setResizable(false);

        painelItens.setLayout(new java.awt.BorderLayout());

        tbItens.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listObjetos, tbItens);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("ID Sapato");
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
        painelComItens.setViewportView(tbItens);

        painelItens.add(painelComItens, java.awt.BorderLayout.CENTER);
        painelItens.add(scrollTab, java.awt.BorderLayout.LINE_END);

        guiaItens.addTab("Itens", painelItens);

        idFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idFuncionario.setText("ID Funcionário*: ");

        idFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFunActionPerformed(evt);
            }
        });

        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btRetirar.setText("RETIRAR");
        btRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetirarActionPerformed(evt);
            }
        });

        dadoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dadoCliente.setText("CPF*: ");

        try {
            cpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteActionPerformed(evt);
            }
        });

        dMov.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dMov.setText("DATA*:");

        try {
            dataMov.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        infos.setText("*Informações obrigatórias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guiaItens)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66)
                        .addComponent(btRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idFun, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dadoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataMov, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dadoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cpfCliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataMov))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(idFun)
                    .addComponent(infos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiaItens, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFunActionPerformed

    }//GEN-LAST:event_idFunActionPerformed

    private void btRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetirarActionPerformed
        String cpf = cpfCliente.getText();
        String data = dataMov.getText();
        String idfuncionario = idFun.getText();

        if (idfuncionario.equals("")) {
            idfuncionario = "0";
        }
        int IDFuncionario = Integer.parseInt(idfuncionario);

        if (cpf.trim().equals("") || data.trim().equals("") || IDFuncionario == 0) {
            JOptionPane.showMessageDialog(null, "Dados incorretos ou campos inválidos.\n Digite novamente por favor!");
        } else {
            int digitosCPF = cpf.length();
            int someCPF, divisaoCPF, segundaSomaCPF, segundaDivisaoCPF;
            int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
            int b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
            int c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11;

            if (digitosCPF == 14) {
                a1 = Character.getNumericValue(cpf.charAt(0));
                a2 = Character.getNumericValue(cpf.charAt(1));
                a3 = Character.getNumericValue(cpf.charAt(2));
                a4 = Character.getNumericValue(cpf.charAt(4));
                a5 = Character.getNumericValue(cpf.charAt(5));
                a6 = Character.getNumericValue(cpf.charAt(6));
                a7 = Character.getNumericValue(cpf.charAt(8));
                a8 = Character.getNumericValue(cpf.charAt(9));
                a9 = Character.getNumericValue(cpf.charAt(10));
                a10 = Character.getNumericValue(cpf.charAt(12));
                a11 = Character.getNumericValue(cpf.charAt(13));

                b1 = a1 * 1;
                b2 = a2 * 2;
                b3 = a3 * 3;
                b4 = a4 * 4;
                b5 = a5 * 5;
                b6 = a6 * 6;
                b7 = a7 * 7;
                b8 = a8 * 8;
                b9 = a9 * 9;

                someCPF = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9;
                divisaoCPF = someCPF % 11;
                if (divisaoCPF == 10) {
                    divisaoCPF = 0;
                }

                c1 = a1 * 9;
                c2 = a2 * 8;
                c3 = a3 * 7;
                c4 = a4 * 6;
                c5 = a5 * 5;
                c6 = a6 * 4;
                c7 = a7 * 3;
                c8 = a8 * 2;
                c9 = a9 * 1;

                segundaSomaCPF = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9;
                segundaDivisaoCPF = segundaSomaCPF % 11;
                if (segundaDivisaoCPF == 10) {
                    segundaDivisaoCPF = 0;
                }

                if (divisaoCPF == a10 && segundaDivisaoCPF == a11) {
                    SapatoDAO daoSapato = new SapatoDAO();
                    Sapato sapato = new Sapato();

                    int linha = tbItens.getSelectedRow();
                    int coluna = tbItens.getSelectedColumn();

                    if (coluna != 0) {
                        JOptionPane.showMessageDialog(null, "Selecione o ID do item");
                    } else {
                        Object id = tbItens.getValueAt(linha, coluna);
                        int idItem = Integer.parseInt(id.toString());
                        sapato.setId(idItem);
                        daoSapato.alterarSapatoR(sapato);
                        MovimentacaoDAO daoMovimentacao = new MovimentacaoDAO();
                        Movimentacao movimentacao = new Movimentacao(IDFuncionario, cpf, idItem, data, "RETIRADA");
                        

                        this.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Dados incorretos ou campos inválidos (CPF*).\n Digite novamente por favor!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Dados incorretos ou campos inválidos (CPF*).\n Digite novamente por favor!");
            }
        }


    }//GEN-LAST:event_btRetirarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        Object[] opcao = {"SIM", "NÃO"};

        int n = JOptionPane.showOptionDialog(this, "Tem certeza que "
                + "deseja cancelar a operação? ", "Selecione uma opção!", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[1]);
        if (n == 0) {
            RetirarSapato.this.setVisible(false);
        }
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btRetirar;
    private javax.swing.JFormattedTextField cpfCliente;
    private javax.swing.JLabel dMov;
    private javax.swing.JLabel dadoCliente;
    private javax.swing.JFormattedTextField dataMov;
    private javax.swing.JTabbedPane guiaItens;
    private javax.swing.JTextField idFun;
    private javax.swing.JLabel idFuncionario;
    private javax.swing.JLabel infos;
    private java.util.List<Sapato> listObjetos;
    private javax.swing.JScrollPane painelComItens;
    private javax.swing.JPanel painelItens;
    private javax.swing.JScrollBar scrollTab;
    private javax.swing.JTable tbItens;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}