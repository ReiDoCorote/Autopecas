/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author radjunior
 */
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnpPrincipal = new javax.swing.JPanel();
        jBrPrincipal = new javax.swing.JMenuBar();
        JmArquivos = new javax.swing.JMenu();
        JmSair = new javax.swing.JMenuItem();
        JmCadastro = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnpPrincipalLayout = new javax.swing.GroupLayout(pnpPrincipal);
        pnpPrincipal.setLayout(pnpPrincipalLayout);
        pnpPrincipalLayout.setHorizontalGroup(
            pnpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1258, Short.MAX_VALUE)
        );
        pnpPrincipalLayout.setVerticalGroup(
            pnpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );

        JmArquivos.setText("Arquivos");

        JmSair.setText("Sair");
        JmArquivos.add(JmSair);

        jBrPrincipal.add(JmArquivos);

        JmCadastro.setText("Cadastro");

        jMenu1.setText("Cliente");

        jMenuItem1.setText("Jurídico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Físico");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        JmCadastro.add(jMenu1);

        jBrPrincipal.add(JmCadastro);

        setJMenuBar(jBrPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ViewCadastroClienteJur cliJur = new ViewCadastroClienteJur();
        pnpPrincipal.removeAll();
        pnpPrincipal.add(cliJur);
        pnpPrincipal.updateUI();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ViewCadastroClienteFis cliFis = new ViewCadastroClienteFis();
        pnpPrincipal.removeAll();
        pnpPrincipal.add(cliFis);
        pnpPrincipal.updateUI();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    public void abrirBusca(){
        ViewCadastroBuscar cadBusc = new ViewCadastroBuscar();
        pnpPrincipal.add(cadBusc);
        pnpPrincipal.updateUI();
                
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmArquivos;
    private javax.swing.JMenu JmCadastro;
    private javax.swing.JMenuItem JmSair;
    private javax.swing.JMenuBar jBrPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel pnpPrincipal;
    // End of variables declaration//GEN-END:variables
}
