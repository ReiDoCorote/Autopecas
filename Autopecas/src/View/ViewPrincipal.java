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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnpPrincipal = new javax.swing.JPanel();
        jBrPrincipal = new javax.swing.JMenuBar();
        JmArquivos = new javax.swing.JMenu();
        JmSair = new javax.swing.JMenuItem();
        JmCadastro = new javax.swing.JMenu();
        JmCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnpPrincipalLayout = new javax.swing.GroupLayout(pnpPrincipal);
        pnpPrincipal.setLayout(pnpPrincipalLayout);
        pnpPrincipalLayout.setHorizontalGroup(
            pnpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1033, Short.MAX_VALUE)
        );
        pnpPrincipalLayout.setVerticalGroup(
            pnpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        JmArquivos.setText("Arquivos");

        JmSair.setText("Sair");
        JmArquivos.add(JmSair);

        jBrPrincipal.add(JmArquivos);

        JmCadastro.setText("Cadastro");

        JmCliente.setText("Cliente");
        JmCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmClienteActionPerformed(evt);
            }
        });
        JmCadastro.add(JmCliente);

        jBrPrincipal.add(JmCadastro);

        setJMenuBar(jBrPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmClienteActionPerformed
        ViewCadastroCliente vCadCli = new ViewCadastroCliente();
        pnpPrincipal.removeAll();
        pnpPrincipal.add(vCadCli);
        pnpPrincipal.updateUI();
    }//GEN-LAST:event_JmClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmArquivos;
    private javax.swing.JMenu JmCadastro;
    private javax.swing.JMenuItem JmCliente;
    private javax.swing.JMenuItem JmSair;
    private javax.swing.JMenuBar jBrPrincipal;
    private javax.swing.JPanel pnpPrincipal;
    // End of variables declaration//GEN-END:variables
}
