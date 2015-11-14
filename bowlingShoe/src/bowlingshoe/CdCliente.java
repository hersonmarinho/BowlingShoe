/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingshoe;

import dbconexao.DBconexao;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hmarinho
 */
public class CdCliente extends javax.swing.JDialog {

    /**
     * Creates new form CdCliente
     */
    public CdCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        emailCliente = new javax.swing.JTextField();
        dadoCpfCliente = new javax.swing.JLabel();
        cpfCliente = new javax.swing.JFormattedTextField();
        rgCliente = new javax.swing.JFormattedTextField();
        DadoRgCliente = new javax.swing.JLabel();
        salvarCadastro = new javax.swing.JButton();
        Infos = new javax.swing.JLabel();
        telCliente = new javax.swing.JLabel();
        telefoneCliente = new javax.swing.JFormattedTextField();
        nCliente = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        iCliente = new javax.swing.JLabel();
        cancelarCadastro = new javax.swing.JButton();
        eCliente = new javax.swing.JLabel();
        idadeCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        emailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailClienteActionPerformed(evt);
            }
        });

        dadoCpfCliente.setText("CPF*");

        try {
            cpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteActionPerformed(evt);
            }
        });

        try {
            rgCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        DadoRgCliente.setText("RG*");

        salvarCadastro.setText("SALVAR");
        salvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCadastroActionPerformed(evt);
            }
        });

        Infos.setText("*Informações obrigatórias");

        telCliente.setText("TELEFONE");

        try {
            telefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        nCliente.setText("NOME COMPLETO*");

        nomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteActionPerformed(evt);
            }
        });

        iCliente.setText("IDADE*");

        cancelarCadastro.setText("CANCELAR");
        cancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCadastroActionPerformed(evt);
            }
        });

        eCliente.setText("E-MAIL");

        idadeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dadoCpfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(173, 173, 173)
                        .addComponent(DadoRgCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addGap(262, 262, 262))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpfCliente)
                        .addGap(28, 28, 28)
                        .addComponent(rgCliente)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Infos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(354, 354, 354))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(311, 311, 311))
                            .addComponent(nomeCliente))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addComponent(idadeCliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(294, 294, 294))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailCliente)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(51, 51, 51))
                            .addComponent(telefoneCliente))
                        .addGap(6, 6, 6)))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(salvarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCliente)
                    .addComponent(idadeCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailCliente)
                    .addComponent(telefoneCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadoCpfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(DadoRgCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(rgCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Infos, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailClienteActionPerformed

    private void cpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteActionPerformed

    }//GEN-LAST:event_cpfClienteActionPerformed

    private void salvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCadastroActionPerformed
        String cpf = cpfCliente.getText();
        String nome = nomeCliente.getText();
        String email = emailCliente.getText();
        String rg = rgCliente.getText();
        String telefone = telefoneCliente.getText();
        String idade = idadeCliente.getText();
        if (idade.equals("")) {
            idade = "0";
        }
        int nasCliente = Integer.parseInt(idade);

        if (nome.equals("") || nasCliente == 0 || cpf.trim().equals("") || rg.trim().equals("")) {
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
                    Cliente cliente = new Cliente(nome, email, cpf, rg, telefone, idade);
                    ClienteDAO dao = new ClienteDAO();
                    DBconexao conexao = new DBconexao();
                    try {
                        conexao.conecta();
                        ResultSet rs = conexao.exec("SELECT * FROM CLIENTE");
                        while(rs.next()){
                            System.out.println(rs.getString("nome"));
                        }
                        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                        conexao.desconecta();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Não foi possível conectar com o banco!");
                        Logger.getLogger(CdCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Dados incorretos ou campos inválidos (CPF*).\n Digite novamente por favor!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Dados incorretos ou campos inválidos (CPF*).\n Digite novamente por favor!");
            }
        }
    }//GEN-LAST:event_salvarCadastroActionPerformed

    private void nomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteActionPerformed

    }//GEN-LAST:event_nomeClienteActionPerformed

    private void cancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCadastroActionPerformed
        Object[] opcao = {"SIM", "NÃO"};

        int n = JOptionPane.showOptionDialog(this, "Tem certeza que "
                + "deseja cancelar a operação? ", "Selecione uma opção!", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[1]);
        if (n == 0) {
            CdCliente.this.setVisible(false);
        }
    }//GEN-LAST:event_cancelarCadastroActionPerformed

    private void idadeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeClienteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DadoRgCliente;
    private javax.swing.JLabel Infos;
    private javax.swing.JButton cancelarCadastro;
    private javax.swing.JFormattedTextField cpfCliente;
    private javax.swing.JLabel dadoCpfCliente;
    private javax.swing.JLabel eCliente;
    private javax.swing.JTextField emailCliente;
    private javax.swing.JLabel iCliente;
    private javax.swing.JTextField idadeCliente;
    private javax.swing.JLabel nCliente;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JFormattedTextField rgCliente;
    private javax.swing.JButton salvarCadastro;
    private javax.swing.JLabel telCliente;
    private javax.swing.JFormattedTextField telefoneCliente;
    // End of variables declaration//GEN-END:variables
}
