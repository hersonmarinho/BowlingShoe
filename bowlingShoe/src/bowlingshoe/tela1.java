/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingshoe;

import javax.swing.ImageIcon;

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

        btCadastro = new javax.swing.JButton();
        btRetirada = new javax.swing.JButton();
        btDevolucao = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        btCadastro.setFont(new java.awt.Font("Futura Md BT", 0, 11)); // NOI18N
        btCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingshoe/icons/Add_Cadastro.png"))); // NOI18N
        btCadastro.setText("CADASTRO");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        btRetirada.setFont(new java.awt.Font("Futura Md BT", 0, 11)); // NOI18N
        btRetirada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingshoe/icons/Retirada.png"))); // NOI18N
        btRetirada.setText("RETIRADA");
        btRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetiradaActionPerformed(evt);
            }
        });

        btDevolucao.setFont(new java.awt.Font("Futura Md BT", 0, 11)); // NOI18N
        btDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingshoe/icons/Devolução.png"))); // NOI18N
        btDevolucao.setText("DEVOLUÇÃO");
        btDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDevolucaoActionPerformed(evt);
            }
        });

        btRelatorio.setFont(new java.awt.Font("Futura Md BT", 0, 11)); // NOI18N
        btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingshoe/icons/Relatorio_Estoque.png"))); // NOI18N
        btRelatorio.setText("RELATÓRIO");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(btRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(btDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );

        btCadastro.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetiradaActionPerformed
        
        TelaRetirada alugar = new TelaRetirada();
        alugar.show();
        
    }//GEN-LAST:event_btRetiradaActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        // TODO add your handling code here:
        CadastroCliente cadastro = new CadastroCliente();
        cadastro.show();
    }//GEN-LAST:event_btCadastroActionPerformed

    private void btDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDevolucaoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btDevolucao;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btRetirada;
    // End of variables declaration//GEN-END:variables
}
