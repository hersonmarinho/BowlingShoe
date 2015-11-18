/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import visual.CdCliente;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

/**
 *
 * @author herson.nmarinho
 */
public class tela1 extends javax.swing.JFrame {

    /**
     * Creates new form tela1
     */
    public tela1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastroCliente = new javax.swing.JButton();
        btRetirada = new javax.swing.JButton();
        btDevolucao = new javax.swing.JButton();
        btInserirSapato = new javax.swing.JButton();
        btExcluirSapato = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        btCadastroCliente.setFont(new java.awt.Font("Futura Md BT", 0, 11)); // NOI18N
        btCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingshoe/icons/Add_User.png"))); // NOI18N
        btCadastroCliente.setText("CADASTRAR");
        btCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroClienteActionPerformed(evt);
            }
        });

        btRetirada.setFont(new java.awt.Font("Futura Md BT", 0, 11)); // NOI18N
        btRetirada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingshoe/icons/Out_Item.png"))); // NOI18N
        btRetirada.setText("RETIRAR");
        btRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetiradaActionPerformed(evt);
            }
        });

        btDevolucao.setFont(new java.awt.Font("Futura Md BT", 0, 11)); // NOI18N
        btDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingshoe/icons/In_Item.png"))); // NOI18N
        btDevolucao.setText("DEVOLVER");
        btDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDevolucaoActionPerformed(evt);
            }
        });

        btInserirSapato.setFont(new java.awt.Font("Futura Md BT", 0, 11)); // NOI18N
        btInserirSapato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingshoe/icons/Add_Item.png"))); // NOI18N
        btInserirSapato.setText("INSERIR ITEM");
        btInserirSapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirSapatoActionPerformed(evt);
            }
        });

        btExcluirSapato.setFont(new java.awt.Font("Futura Md BT", 0, 11)); // NOI18N
        btExcluirSapato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingshoe/icons/Desactivate_Item.png"))); // NOI18N
        btExcluirSapato.setText("DESATIVAR ITEM");
        btExcluirSapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirSapatoActionPerformed(evt);
            }
        });

        btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingshoe/icons/Daily_Report.png"))); // NOI18N
        btRelatorio.setText("RELATÓRIO DIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(btInserirSapato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluirSapato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserirSapato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluirSapato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        btCadastroCliente.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetiradaActionPerformed
        RetirarSapato retirar = new RetirarSapato (this, true);
        retirar.setVisible(true);
        
        
    }//GEN-LAST:event_btRetiradaActionPerformed

    private void btInserirSapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirSapatoActionPerformed
        CdSapato sapato = new CdSapato(this, true);
        sapato.setVisible(true);
        
    }//GEN-LAST:event_btInserirSapatoActionPerformed

    private void btCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroClienteActionPerformed
        CdCliente cliente = new CdCliente (this, true);
        cliente.setVisible(true);
        
    }//GEN-LAST:event_btCadastroClienteActionPerformed

    private void btDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDevolucaoActionPerformed
        DevolverSapato devolver = new DevolverSapato (this, true);
        devolver.setVisible(true);
        
    }//GEN-LAST:event_btDevolucaoActionPerformed

    private void btExcluirSapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirSapatoActionPerformed
        DesativarSapato desativar = new DesativarSapato(this, true);
        desativar.setVisible(true);
    }//GEN-LAST:event_btExcluirSapatoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastroCliente;
    private javax.swing.JButton btDevolucao;
    private javax.swing.JButton btExcluirSapato;
    private javax.swing.JButton btInserirSapato;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btRetirada;
    // End of variables declaration//GEN-END:variables
}
