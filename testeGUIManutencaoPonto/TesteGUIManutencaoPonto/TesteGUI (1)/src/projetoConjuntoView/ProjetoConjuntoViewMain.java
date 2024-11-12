package projetoConjuntoView;

/**
 *
 * @author 0072379
 */
public class ProjetoConjuntoViewMain extends javax.swing.JFrame {

    private ManutencaoConjuntoView manutencaoConjuntoView;

    public ProjetoConjuntoViewMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarra = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        arquivoNovo = new javax.swing.JCheckBoxMenuItem();
        arquivoSair = new javax.swing.JCheckBoxMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuConjunto = new javax.swing.JMenu();
        conjuntoManutencao = new javax.swing.JCheckBoxMenuItem();
        menuPonto = new javax.swing.JMenu();
        pontoManutencao = new javax.swing.JCheckBoxMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArquivo.setMnemonic('A');
        menuArquivo.setText("Arquivo");

        arquivoNovo.setSelected(true);
        arquivoNovo.setText("Novo");
        menuArquivo.add(arquivoNovo);

        arquivoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        arquivoSair.setSelected(true);
        arquivoSair.setText("Sair");
        arquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivoSairActionPerformed(evt);
            }
        });
        menuArquivo.add(arquivoSair);

        menuBarra.add(menuArquivo);

        menuEditar.setMnemonic('E');
        menuEditar.setText("Editar");
        menuBarra.add(menuEditar);

        menuConjunto.setMnemonic('C');
        menuConjunto.setText("Conjunto");

        conjuntoManutencao.setMnemonic('M');
        conjuntoManutencao.setSelected(true);
        conjuntoManutencao.setText("Manutenção");
        conjuntoManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuntoManutencaoActionPerformed(evt);
            }
        });
        menuConjunto.add(conjuntoManutencao);

        menuBarra.add(menuConjunto);

        menuPonto.setMnemonic('P');
        menuPonto.setText("Ponto");

        pontoManutencao.setMnemonic('M');
        pontoManutencao.setSelected(true);
        pontoManutencao.setText("Manutenção");
        pontoManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoManutencaoActionPerformed(evt);
            }
        });
        menuPonto.add(pontoManutencao);

        menuBarra.add(menuPonto);

        menuSobre.setMnemonic('S');
        menuSobre.setText("Sobre");
        menuBarra.add(menuSobre);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivoSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_arquivoSairActionPerformed

    private void conjuntoManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoManutencaoActionPerformed
        // TODO add your handling code here:
        //localização: ManutencaoConjuntoView (linhas 147 - 154)
        if (manutencaoConjuntoView == null) {
            manutencaoConjuntoView = new ManutencaoConjuntoView(this, true);
        }
        manutencaoConjuntoView.setVisible(true);
    }//GEN-LAST:event_conjuntoManutencaoActionPerformed

    private void pontoManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoManutencaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pontoManutencaoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoConjuntoViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem arquivoNovo;
    private javax.swing.JCheckBoxMenuItem arquivoSair;
    private javax.swing.JCheckBoxMenuItem conjuntoManutencao;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuConjunto;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuPonto;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JCheckBoxMenuItem pontoManutencao;
    // End of variables declaration//GEN-END:variables
}
