package projetoConjuntoView;

import helper.ConjuntoHelper;
import helper.ConjuntoHelperPonto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ponto.Conjunto;
import ponto.Ponto;

/**
 *
 * @author 0072379
 */
public class ManutencaoPontoView extends javax.swing.JDialog {

    public ManutencaoPontoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblCoordenadaX = new javax.swing.JLabel();
        lblCoordenadaY = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtCoordenadaY = new javax.swing.JTextField();
        txtCoordenadaX = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        lblCodigoConjunto = new javax.swing.JLabel();
        txtCodigoConjunto = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnAssociar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCodigo.setText("Código:");

        lblDescricao.setText("Descrição:");

        lblCoordenadaX.setText("Coordenada X:");

        lblCoordenadaY.setText("Coordenada Y:");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        txtCoordenadaY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoordenadaYActionPerformed(evt);
            }
        });

        txtCoordenadaX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoordenadaXActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        lblCodigoConjunto.setText("Código Conjunto:");

        txtCodigoConjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoConjuntoActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnAssociar.setText("Associar");
        btnAssociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoConjunto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoordenadaY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoordenadaX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCoordenadaY)
                    .addComponent(txtCoordenadaX))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAssociar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoordenadaX)
                    .addComponent(txtCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoordenadaY)
                    .addComponent(txtCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssociar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoConjunto)
                    .addComponent(txtCodigoConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCoordenadaYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoordenadaYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoordenadaYActionPerformed

    private void txtCoordenadaXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoordenadaXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoordenadaXActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoConjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoConjuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoConjuntoActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnAssociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociarActionPerformed
        // TODO add your handling code here:
        //Professor, eu não sabia que função colocar ao botão associar, portanto deixei em branco.
    }//GEN-LAST:event_btnAssociarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
        Ponto temp = null;
        int codigo = 0;
        int coordenadaX = 0;
        int coordenadaY = 0;
        String descricao = null;
        try {
            coordenadaX = Integer.parseInt(txtCoordenadaX.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Digite a coordenada de x:");
            return;
        }
        try {
            coordenadaY = Integer.parseInt(txtCoordenadaY.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Digite a coordenada de y:");
            return;
        }
        try {
            codigo = Integer.parseInt(txtCodigo.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Digite o código do conjunto:");
            return;
        }

        descricao = txtDescricao.getText();
        if (descricao.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Descrição inválida.");
            return;
        }
        temp = new Ponto(descricao, coordenadaX, coordenadaY, codigo);
        ConjuntoHelperPonto.getInstance().addponto(temp);
        JOptionPane.showMessageDialog(this, "Objeto incluído!");


    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        Ponto temp = null;
        int codigo = 0, cgd = 0;
        int coordenadaX = 0;
        int coordenadaY = 0;
        String descricao = null;

        descricao = txtDescricao.getText();
        if (descricao.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Descrição inválida.");
            return;
        }

        try {
            coordenadaX = Integer.parseInt(txtCoordenadaX.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Digite a coordenada de x:");
            return;
        }
        try {
            coordenadaY = Integer.parseInt(txtCoordenadaY.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Digite a coordenada de y:");
            return;
        }
        try {
            cgd = Integer.parseInt(txtCodigo.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Digite o código do conjunto.");
            return;
        }

        Ponto ponto = new Ponto(descricao, coordenadaX, coordenadaY, cgd);
        if (ConjuntoHelperPonto.getInstance().alterar(ponto) >= 0) {
            JOptionPane.showMessageDialog(this, "Objeto alterado.");
        } else {
            JOptionPane.showMessageDialog(this, "Objeto não alterado.");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        String descricao = null;
        descricao = txtDescricao.getText();
        if (descricao.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Digite o valor a ser excluído:");
            return;
        }

        ConjuntoHelperPonto conjuntoHelperPonto = ConjuntoHelperPonto.getInstance();
        int totalObjetos = 0;
        totalObjetos = conjuntoHelperPonto.excluir(descricao);
        if (totalObjetos > 0) {
            JOptionPane.showMessageDialog(this, "Total de objetos excluidos: " + totalObjetos);
        } else {
            JOptionPane.showMessageDialog(this, "Código não encontrado.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        ConjuntoHelperPonto conjuntoHelperPonto = ConjuntoHelperPonto.getInstance();
        Ponto temp = null;
        String descricao = null;
        descricao = txtDescricao.getText();
        if (descricao.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Digite o valor a ser pesquisado:");
            return;
        }

        temp = conjuntoHelperPonto.pesquisar(descricao);
        if (temp != null) {
            JOptionPane.showMessageDialog(this, "Objeto encontrado." + temp);
            txtDescricao.setText(temp.getDescricao());
            txtCoordenadaX.setText("" + temp.getX());
            txtCoordenadaY.setText("" + temp.getY());
            txtCodigo.setText("" + temp.getCodigo());
        } else {
            JOptionPane.showMessageDialog(this, "Código não encontrado.");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPontoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPontoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPontoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPontoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPontoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPontoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPontoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPontoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManutencaoPontoView dialog = new ManutencaoPontoView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAssociar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoConjunto;
    private javax.swing.JLabel lblCoordenadaX;
    private javax.swing.JLabel lblCoordenadaY;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoConjunto;
    private javax.swing.JTextField txtCoordenadaX;
    private javax.swing.JTextField txtCoordenadaY;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
