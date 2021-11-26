package View;

import DAO.CadastroDAO;
import DAO.ProdutoDAO;
import Model.Categoria;
import Model.Fornecedor;
import Model.Marca;
import Model.Pessoa;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import Model.Produto;
import ModelTable.TableFRN;
import ModelTable.TablePF;
import ModelTable.TablePJ;
import ModelTable.TablePRD;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class ViewCadastro extends javax.swing.JInternalFrame {

    CadastroDAO cadDAO;
    ProdutoDAO prdDAO;
    TablePJ tabelaPJ;
    TablePF tabelaPF;
    TableFRN tabelaFRN;
    TablePRD tabelaPRD;

    public ViewCadastro() {
        initComponents();
        this.setVisible(true);
        cadDAO = new CadastroDAO();
        prdDAO = new ProdutoDAO();
        tabelaPJ = new TablePJ();
        tabelaPF = new TablePF();
        tabelaFRN = new TableFRN();
        tabelaPRD = new TablePRD();
        jTableProduto.setModel(tabelaPRD);
        txtCreditoPessoaJuridica.setText("0.0");
        txtCreditoPessoaFisica.setText("0.0");
        iniciador();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoCadastro = new javax.swing.ButtonGroup();
        guiGeral = new javax.swing.JTabbedPane();
        jTpPrincipal = new javax.swing.JPanel();
        pnpCadastrar = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lblCep = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        rbJuridica = new javax.swing.JRadioButton();
        rbFisica = new javax.swing.JRadioButton();
        btnNovo = new javax.swing.JButton();
        pnpBuscar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePessoa = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPnPessoaFisica = new javax.swing.JPanel();
        lblCpf2 = new javax.swing.JLabel();
        txtCPFPessoaFisica = new javax.swing.JFormattedTextField();
        lblRg1 = new javax.swing.JLabel();
        txtRgPessoaFisica = new javax.swing.JTextField();
        lblLimiteCredito2 = new javax.swing.JLabel();
        txtCreditoPessoaFisica = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdPessoaFisica = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPnPessoaJuridica = new javax.swing.JPanel();
        lblCpf = new javax.swing.JLabel();
        txtCnpjPessoaJuridica = new javax.swing.JFormattedTextField();
        lblIncricaoSocial = new javax.swing.JLabel();
        txtInscricaoSocialPessoaJuridica = new javax.swing.JTextField();
        lblLimiteCredito = new javax.swing.JLabel();
        txtCreditoPessoaJuridica = new javax.swing.JTextField();
        txtIdPessoaJuridica = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPnFornecedor = new javax.swing.JPanel();
        txtIdFornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCnpjFornecedor = new javax.swing.JFormattedTextField();
        lblCpf3 = new javax.swing.JLabel();
        txtInscricaoSocialFornecedor = new javax.swing.JTextField();
        lblIncricaoSocial1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRamoAtividadeFornecedor = new javax.swing.JTextField();
        pnpCadastrar1 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        txtRazaoSocial1 = new javax.swing.JTextField();
        lblEndereco1 = new javax.swing.JLabel();
        txtEndereco1 = new javax.swing.JTextField();
        lblTelefone1 = new javax.swing.JLabel();
        txtTelefone1 = new javax.swing.JFormattedTextField();
        lblEmail1 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        lblCelular1 = new javax.swing.JLabel();
        txtCelular1 = new javax.swing.JFormattedTextField();
        lblCep1 = new javax.swing.JLabel();
        lblCidade1 = new javax.swing.JLabel();
        txtCidade1 = new javax.swing.JTextField();
        lblBairro1 = new javax.swing.JLabel();
        txtBairro1 = new javax.swing.JTextField();
        txtCep1 = new javax.swing.JFormattedTextField();
        btnNovo1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cbCategoria = new javax.swing.JComboBox<>();
        txtFkCategoria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cbMarca = new javax.swing.JComboBox<>();
        txtFkMarca = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigoBarrasProduto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUnidadeProduto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPrecoCustoProduto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPrecoVendaProduto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtQtdeProduto = new javax.swing.JTextField();
        btnSalvarProduto = new javax.swing.JButton();
        btnLimparProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblValorMargem = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnNovoCadastroProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txtBuscarProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();

        setClosable(true);
        setTitle("Formulário de Cadastro Pessoa Jurídica");
        setToolTipText("");

        guiGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guiGeralMouseClicked(evt);
            }
        });
        guiGeral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guiGeralKeyPressed(evt);
            }
        });

        pnpCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNome.setText("Nome Completo / Razão Social");

        lblEndereco.setText("Endereço");

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        lblTelefone.setText("Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });

        lblEmail.setText("E-mail");

        lblCelular.setText("Celular");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });

        lblCep.setText("CEP");

        lblCidade.setText("Cidade");

        lblBairro.setText("Bairro");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });

        TipoCadastro.add(rbJuridica);
        rbJuridica.setText("Juridica");
        rbJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuridicaActionPerformed(evt);
            }
        });

        TipoCadastro.add(rbFisica);
        rbFisica.setText("Fisica");
        rbFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFisicaActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnpCadastrarLayout = new javax.swing.GroupLayout(pnpCadastrar);
        pnpCadastrar.setLayout(pnpCadastrarLayout);
        pnpCadastrarLayout.setHorizontalGroup(
            pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnpCadastrarLayout.createSequentialGroup()
                        .addComponent(rbFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbJuridica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnpCadastrarLayout.createSequentialGroup()
                        .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCelular)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addGroup(pnpCadastrarLayout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(txtEmail)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnpCadastrarLayout.createSequentialGroup()
                        .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCep)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnpCadastrarLayout.createSequentialGroup()
                                .addComponent(lblCidade)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairro)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtEndereco)
                    .addGroup(pnpCadastrarLayout.createSequentialGroup()
                        .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblNome)
                            .addComponent(lblEndereco))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnpCadastrarLayout.setVerticalGroup(
            pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnpCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbFisica)
                        .addComponent(rbJuridica))
                    .addComponent(btnNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(lblCidade)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnpCadastrarLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnpCadastrarLayout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnpBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTablePessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTablePessoaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTablePessoaFocusLost(evt);
            }
        });
        jTablePessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePessoa);

        jLabel1.setText("Nome / Razão Social");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnpBuscarLayout = new javax.swing.GroupLayout(pnpBuscar);
        pnpBuscar.setLayout(pnpBuscarLayout);
        pnpBuscarLayout.setHorizontalGroup(
            pnpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnpBuscarLayout.createSequentialGroup()
                        .addComponent(txtBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(pnpBuscarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnpBuscarLayout.setVerticalGroup(
            pnpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnpBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPnPessoaFisica.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Pessoa Fisica"));

        lblCpf2.setText("CPF");

        try {
            txtCPFPessoaFisica.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFPessoaFisica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFPessoaFisicaFocusLost(evt);
            }
        });

        lblRg1.setText("RG");

        lblLimiteCredito2.setText("Limite Crédito");

        jLabel6.setText("ID");

        txtIdPessoaFisica.setEnabled(false);

        jLabel9.setText("R$");

        javax.swing.GroupLayout jPnPessoaFisicaLayout = new javax.swing.GroupLayout(jPnPessoaFisica);
        jPnPessoaFisica.setLayout(jPnPessoaFisicaLayout);
        jPnPessoaFisicaLayout.setHorizontalGroup(
            jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnPessoaFisicaLayout.createSequentialGroup()
                .addGroup(jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRg1)
                    .addGroup(jPnPessoaFisicaLayout.createSequentialGroup()
                        .addComponent(txtRgPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnPessoaFisicaLayout.createSequentialGroup()
                        .addComponent(lblLimiteCredito2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPnPessoaFisicaLayout.createSequentialGroup()
                        .addComponent(txtCreditoPessoaFisica)
                        .addContainerGap())))
            .addGroup(jPnPessoaFisicaLayout.createSequentialGroup()
                .addGroup(jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtIdPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnPessoaFisicaLayout.createSequentialGroup()
                        .addComponent(lblCpf2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCPFPessoaFisica))
                .addContainerGap())
        );
        jPnPessoaFisicaLayout.setVerticalGroup(
            jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnPessoaFisicaLayout.createSequentialGroup()
                .addGroup(jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCreditoPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnPessoaFisicaLayout.createSequentialGroup()
                        .addGroup(jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpf2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPFPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRg1)
                            .addComponent(lblLimiteCredito2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRgPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnPessoaJuridica.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Pessoa Juridica"));

        lblCpf.setText("CNPJ");

        try {
            txtCnpjPessoaJuridica.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjPessoaJuridica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCnpjPessoaJuridicaFocusLost(evt);
            }
        });

        lblIncricaoSocial.setText("Inscrição Social");

        lblLimiteCredito.setText("Limite Crédito");

        txtCreditoPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditoPessoaJuridicaActionPerformed(evt);
            }
        });

        txtIdPessoaJuridica.setEnabled(false);

        jLabel2.setText("ID");

        jLabel4.setText("R$");

        javax.swing.GroupLayout jPnPessoaJuridicaLayout = new javax.swing.GroupLayout(jPnPessoaJuridica);
        jPnPessoaJuridica.setLayout(jPnPessoaJuridicaLayout);
        jPnPessoaJuridicaLayout.setHorizontalGroup(
            jPnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnPessoaJuridicaLayout.createSequentialGroup()
                .addGroup(jPnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIncricaoSocial)
                    .addGroup(jPnPessoaJuridicaLayout.createSequentialGroup()
                        .addComponent(txtInscricaoSocialPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnPessoaJuridicaLayout.createSequentialGroup()
                        .addComponent(lblLimiteCredito)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCreditoPessoaJuridica))
                .addContainerGap())
            .addGroup(jPnPessoaJuridicaLayout.createSequentialGroup()
                .addGroup(jPnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnPessoaJuridicaLayout.createSequentialGroup()
                        .addComponent(lblCpf)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPnPessoaJuridicaLayout.createSequentialGroup()
                        .addComponent(txtCnpjPessoaJuridica)
                        .addContainerGap())))
        );
        jPnPessoaJuridicaLayout.setVerticalGroup(
            jPnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnPessoaJuridicaLayout.createSequentialGroup()
                .addGroup(jPnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnPessoaJuridicaLayout.createSequentialGroup()
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCnpjPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnPessoaJuridicaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnPessoaJuridicaLayout.createSequentialGroup()
                        .addGroup(jPnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncricaoSocial)
                            .addComponent(lblLimiteCredito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInscricaoSocialPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCreditoPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTpPrincipalLayout = new javax.swing.GroupLayout(jTpPrincipal);
        jTpPrincipal.setLayout(jTpPrincipalLayout);
        jTpPrincipalLayout.setHorizontalGroup(
            jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jTpPrincipalLayout.createSequentialGroup()
                        .addComponent(pnpCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTpPrincipalLayout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar))
                            .addComponent(jPnPessoaJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPnPessoaFisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnpBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jTpPrincipalLayout.setVerticalGroup(
            jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTpPrincipalLayout.createSequentialGroup()
                        .addComponent(jPnPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPnPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jTpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnpCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnpBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        guiGeral.addTab("Pessoa", jTpPrincipal);

        jPnFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Fornecedor"));

        txtIdFornecedor.setEnabled(false);

        jLabel3.setText("ID");

        try {
            txtCnpjFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCnpjFornecedorFocusLost(evt);
            }
        });

        lblCpf3.setText("CNPJ");

        lblIncricaoSocial1.setText("Inscrição Social");

        jLabel10.setText("Ramo de Atividade");

        javax.swing.GroupLayout jPnFornecedorLayout = new javax.swing.GroupLayout(jPnFornecedor);
        jPnFornecedor.setLayout(jPnFornecedorLayout);
        jPnFornecedorLayout.setHorizontalGroup(
            jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFornecedorLayout.createSequentialGroup()
                .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnFornecedorLayout.createSequentialGroup()
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnFornecedorLayout.createSequentialGroup()
                                .addComponent(lblCpf3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCnpjFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
                    .addComponent(txtInscricaoSocialFornecedor)
                    .addGroup(jPnFornecedorLayout.createSequentialGroup()
                        .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIncricaoSocial1)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtRamoAtividadeFornecedor))
                .addContainerGap())
        );
        jPnFornecedorLayout.setVerticalGroup(
            jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFornecedorLayout.createSequentialGroup()
                .addGroup(jPnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnFornecedorLayout.createSequentialGroup()
                        .addComponent(lblCpf3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCnpjFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnFornecedorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIncricaoSocial1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInscricaoSocialFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRamoAtividadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnpCadastrar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNome1.setText("Nome Completo / Razão Social");

        lblEndereco1.setText("Endereço");

        txtEndereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndereco1ActionPerformed(evt);
            }
        });

        lblTelefone1.setText("Telefone");

        try {
            txtTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefone1FocusLost(evt);
            }
        });

        lblEmail1.setText("E-mail");

        lblCelular1.setText("Celular");

        try {
            txtCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelular1FocusLost(evt);
            }
        });

        lblCep1.setText("CEP");

        lblCidade1.setText("Cidade");

        lblBairro1.setText("Bairro");

        try {
            txtCep1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCep1FocusLost(evt);
            }
        });

        btnNovo1.setText("Novo");
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnpCadastrar1Layout = new javax.swing.GroupLayout(pnpCadastrar1);
        pnpCadastrar1.setLayout(pnpCadastrar1Layout);
        pnpCadastrar1Layout.setHorizontalGroup(
            pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpCadastrar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnpCadastrar1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnpCadastrar1Layout.createSequentialGroup()
                        .addGroup(pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCelular1)
                            .addComponent(txtCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addGroup(pnpCadastrar1Layout.createSequentialGroup()
                                .addComponent(lblTelefone1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(txtEmail1)
                    .addComponent(txtRazaoSocial1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnpCadastrar1Layout.createSequentialGroup()
                        .addGroup(pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCep1)
                            .addComponent(txtCep1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnpCadastrar1Layout.createSequentialGroup()
                                .addComponent(lblCidade1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCidade1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairro1)
                            .addComponent(txtBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtEndereco1)
                    .addGroup(pnpCadastrar1Layout.createSequentialGroup()
                        .addGroup(pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail1)
                            .addComponent(lblNome1)
                            .addComponent(lblEndereco1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnpCadastrar1Layout.setVerticalGroup(
            pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnpCadastrar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazaoSocial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEndereco1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep1)
                    .addComponent(lblCidade1)
                    .addComponent(lblBairro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnpCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnpCadastrar1Layout.createSequentialGroup()
                        .addComponent(lblEmail1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCelular1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnpCadastrar1Layout.createSequentialGroup()
                        .addComponent(lblTelefone1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnpCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnpCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(271, Short.MAX_VALUE))
        );

        guiGeral.addTab("Fornecedor", jPanel11);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione Categoria"));

        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });

        txtFkCategoria.setEnabled(false);

        jButton1.setText("+");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFkCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFkCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione Marca"));

        cbMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMarcaItemStateChanged(evt);
            }
        });

        txtFkMarca.setEnabled(false);

        jButton2.setText("+");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFkMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFkMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Produto"));

        jLabel12.setText("Código de Barras");

        jLabel13.setText("Descricao");

        jLabel14.setText("Unidade");

        txtUnidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeProdutoActionPerformed(evt);
            }
        });

        jLabel15.setText("Preço de Custo");

        txtPrecoCustoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoCustoProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoCustoProdutoFocusLost(evt);
            }
        });

        jLabel16.setText("Preço de Venda");

        txtPrecoVendaProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoVendaProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoVendaProdutoFocusLost(evt);
            }
        });

        jLabel17.setText("Qtde");

        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnLimparProduto.setText("Limpar");
        btnLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdutoActionPerformed(evt);
            }
        });

        btnEditarProduto.setText("Editar");

        jLabel18.setText("R$");

        jLabel19.setText("R$");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Margem de Lucro (%)"));

        lblValorMargem.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblValorMargem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorMargem.setText("0.0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblValorMargem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblValorMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
        );

        jLabel21.setText("UN");

        btnNovoCadastroProduto.setText("Novo");
        btnNovoCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCadastroProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvarProduto))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricaoProduto)
                            .addComponent(txtCodigoBarrasProduto)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(btnNovoCadastroProduto))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(txtUnidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQtdeProduto))
                                    .addComponent(jLabel17))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPrecoVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPrecoCustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel15)
                                .addComponent(jLabel16))
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecoCustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecoVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnNovoCadastroProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoBarrasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUnidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtQtdeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarProduto)
                    .addComponent(btnLimparProduto)
                    .addComponent(btnEditarProduto))
                .addGap(2, 2, 2))
        );

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jTableProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableProdutoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProduto);

        jLabel20.setText("Consulta");

        btnBuscarProduto.setText("Buscar");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluirProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarProduto))
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscarProduto)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(btnBuscarProduto)
                    .addComponent(btnExcluirProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        guiGeral.addTab("Produto", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guiGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guiGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void guiGeralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guiGeralKeyPressed

    }//GEN-LAST:event_guiGeralKeyPressed

    private void guiGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guiGeralMouseClicked

    }//GEN-LAST:event_guiGeralMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (rbFisica.isSelected()) {
            editarPessoaFisica();
        } else if (rbJuridica.isSelected()) {
            editarPessoaJuridica();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparTextFields();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (rbFisica.isSelected()) {
            salvarPessoaFisica();
        } else if (rbJuridica.isSelected()) {
            salvarPessoaJuridica();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCnpjFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCnpjFornecedorFocusLost

    }//GEN-LAST:event_txtCnpjFornecedorFocusLost

    private void txtCreditoPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditoPessoaJuridicaActionPerformed

    }//GEN-LAST:event_txtCreditoPessoaJuridicaActionPerformed

    private void txtCnpjPessoaJuridicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCnpjPessoaJuridicaFocusLost
        txtCnpjPessoaJuridica.setFocusLostBehavior(JFormattedTextField.COMMIT);
        String cnpjDB;
        cnpjDB = cadDAO.verificarCNPJClientePJ(txtCnpjPessoaJuridica.getText());
        if (txtCnpjPessoaJuridica.getText().equals(cnpjDB)) {
            JOptionPane.showMessageDialog(null, "Cadastro Existente");
            txtCnpjPessoaJuridica.requestFocus();
        }
    }//GEN-LAST:event_txtCnpjPessoaJuridicaFocusLost

    private void txtCPFPessoaFisicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFPessoaFisicaFocusLost
        txtCPFPessoaFisica.setFocusLostBehavior(JFormattedTextField.COMMIT);
        String cpfDB;
        cpfDB = cadDAO.verificarCPFClientePF(txtCPFPessoaFisica.getText());
        if (txtCPFPessoaFisica.getText().equals(cpfDB)) {
            JOptionPane.showMessageDialog(null, "Cadastro Existente");
            txtCPFPessoaFisica.requestFocus();
        }
    }//GEN-LAST:event_txtCPFPessoaFisicaFocusLost

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (rbFisica.isSelected()) {
            excluirPessoaFisica();
        } else if (rbJuridica.isSelected()) {
            excluirPessoaJuridica();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (rbFisica.isSelected()) {
            tabelaPF.limpaTabela();
            pesquisarTabelaPessoaFisica(txtBuscar.getText());
            btnExcluir.setEnabled(true);

        } else if (rbJuridica.isSelected()) {
            tabelaPJ.limpaTabela();
            pesquisarTabelaPessoaJuridica(txtBuscar.getText());
            btnExcluir.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jTablePessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePessoaMouseClicked
        limparTextFields();
        if (rbFisica.isSelected()) {
            exibirPessoaFisica();

        } else if (rbJuridica.isSelected()) {
            exibirPessoaJuridica();

        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnLimpar.setEnabled(false);
        btnSalvar.setEnabled(false);
    }//GEN-LAST:event_jTablePessoaMouseClicked

    private void jTablePessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTablePessoaFocusLost

    }//GEN-LAST:event_jTablePessoaFocusLost

    private void jTablePessoaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTablePessoaFocusGained

    }//GEN-LAST:event_jTablePessoaFocusGained

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        if (rbFisica.isSelected()) {
            tabelaPF.limpaTabela();
        } else if (rbJuridica.isSelected()) {
            tabelaPJ.limpaTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
        limparTextFields();
        iniciarCadastro();
        txtCnpjPessoaJuridica.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void rbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFisicaActionPerformed
        verificarTipoCadastro();
    }//GEN-LAST:event_rbFisicaActionPerformed

    private void rbJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuridicaActionPerformed
        verificarTipoCadastro();
    }//GEN-LAST:event_rbJuridicaActionPerformed

    private void txtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusLost
        txtCep.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_txtCepFocusLost

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        txtCelular.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_txtCelularFocusLost

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        txtTelefone.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (rbFisica.isSelected()) {
            tabelaPF.limpaTabela();
        } else if (rbJuridica.isSelected()) {
            tabelaPJ.limpaTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de Pessoa selecionada");
        }
        DesativarCampos();
        limparTextFields();
        btnNovo.setEnabled(true);
        rbFisica.setEnabled(true);
        rbJuridica.setEnabled(true);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        tabelaPRD.limpaTabela();
        pesquisarTabelaProduto(txtBuscarProduto.getText());
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged
        eventoCBCategoria(evt);
    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void cbMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMarcaItemStateChanged
        eventoCBMarca(evt);
    }//GEN-LAST:event_cbMarcaItemStateChanged

    private void jTableProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProdutoKeyPressed

    }//GEN-LAST:event_jTableProdutoKeyPressed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked
        limparCamposProduto();
        if (jTableProduto.getSelectedRow() != -1) {

            Produto prd = new Produto();
            prd.setIdProduto((int) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 0));
            prd.setDescricao((String) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 1));
            prd.setPrecoVenda((Float) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 2));
            prd.setQtde((Float) (jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 3)));
            prd.setUnidade((String) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 4));

            txtDescricaoProduto.setText(prd.getDescricao());
            txtPrecoVendaProduto.setText(Float.toString(prd.getPrecoVenda()));
            txtQtdeProduto.setText(Float.toString(prd.getQtde()));
            txtUnidadeProduto.setText(prd.getUnidade());

            for (Produto prd2 : prdDAO.pesquisarProduto2(Integer.toString(prd.getIdProduto()))) {
                txtCodigoBarrasProduto.setText(Integer.toString(prd2.getCodBarras()));
                txtPrecoCustoProduto.setText(Float.toString(prd2.getPrecoCusto()));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        }
        iniciarCadastroProduto();
        btnExcluirProduto.setEnabled(true);
        btnEditarProduto.setEnabled(true);
    }//GEN-LAST:event_jTableProdutoMouseClicked

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        excluirProduto();
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void txtEndereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndereco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndereco1ActionPerformed

    private void txtTelefone1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefone1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone1FocusLost

    private void txtCelular1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelular1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelular1FocusLost

    private void txtCep1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCep1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCep1FocusLost

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void btnNovoCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCadastroProdutoActionPerformed
        iniciarCadastroProduto();
    }//GEN-LAST:event_btnNovoCadastroProdutoActionPerformed

    private void btnLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdutoActionPerformed
        limparCamposProduto();
    }//GEN-LAST:event_btnLimparProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        if (txtDescricaoProduto.getText().isEmpty() || txtCodigoBarrasProduto.getText().isEmpty() || txtUnidadeProduto.getText().isEmpty() || txtPrecoCustoProduto.getText().isEmpty() || txtPrecoVendaProduto.getText().isEmpty() || txtQtdeProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            Produto prd = new Produto();
            prd.setCodBarras(Integer.parseInt(txtCodigoBarrasProduto.getText()));
            prd.setDescricao(txtDescricaoProduto.getText());
            prd.setUnidade(txtUnidadeProduto.getText());
            prd.setPrecoCusto(Float.parseFloat(txtPrecoCustoProduto.getText()));
            prd.setPrecoVenda(Float.parseFloat(txtPrecoVendaProduto.getText()));
            prd.setQtde(Integer.parseInt(txtQtdeProduto.getText()));
            prd.setFkCategoria(Integer.parseInt(txtFkCategoria.getText()));
            prd.setFkMarca(Integer.parseInt(txtFkMarca.getText()));
            try {
                prdDAO.salvarProduto(prd);
                limparCamposProduto();
                iniciarProduto();
                btnNovoCadastroProduto.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar produto\n" + ex);
            }
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void txtPrecoVendaProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaProdutoFocusLost
        calcularMargem();
    }//GEN-LAST:event_txtPrecoVendaProdutoFocusLost

    private void txtPrecoVendaProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaProdutoFocusGained
        calcularMargem();
    }//GEN-LAST:event_txtPrecoVendaProdutoFocusGained

    private void txtPrecoCustoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCustoProdutoFocusLost
        calcularMargem();
    }//GEN-LAST:event_txtPrecoCustoProdutoFocusLost

    private void txtPrecoCustoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCustoProdutoFocusGained
        calcularMargem();
    }//GEN-LAST:event_txtPrecoCustoProdutoFocusGained

    private void txtUnidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeProdutoActionPerformed

    }//GEN-LAST:event_txtUnidadeProdutoActionPerformed

    private void iniciador() {
        DesativarCampos();
        verificarTipoCadastro();
        preencherComboBoxMarca();
        preencherComboBoxCategoria();
        iniciarProduto();
    }

    private void excluirProduto() {
        Produto prd = new Produto();
        if (jTableProduto.getSelectedRow() != -1) {
            prd.setIdProduto((int) jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 0));
            try {
                prdDAO.excluirProduto(prd);
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaPRD.removeRow(jTableProduto.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void iniciarCadastroProduto() {
        txtDescricaoProduto.setEnabled(true);
        txtCodigoBarrasProduto.setEnabled(true);
        txtUnidadeProduto.setEnabled(true);
        txtPrecoCustoProduto.setEnabled(true);
        txtPrecoVendaProduto.setEnabled(true);
        txtQtdeProduto.setEnabled(true);
        btnSalvarProduto.setEnabled(true);
        btnEditarProduto.setEnabled(false);
        btnExcluirProduto.setEnabled(false);
        btnLimparProduto.setEnabled(true);
        btnNovoCadastroProduto.setEnabled(false);
        cbCategoria.setEnabled(true);
        cbMarca.setEnabled(true);
    }

    private void iniciarProduto() {
        txtDescricaoProduto.setEnabled(false);
        txtCodigoBarrasProduto.setEnabled(false);
        txtUnidadeProduto.setEnabled(false);
        txtPrecoCustoProduto.setEnabled(false);
        txtPrecoVendaProduto.setEnabled(false);
        txtQtdeProduto.setEnabled(false);
        btnSalvarProduto.setEnabled(false);
        btnEditarProduto.setEnabled(false);
        btnExcluirProduto.setEnabled(false);
        btnLimparProduto.setEnabled(false);
        cbCategoria.setEnabled(false);
        cbMarca.setEnabled(false);
    }

    private void limparCamposProduto() {
        txtCodigoBarrasProduto.setText("");
        txtDescricaoProduto.setText("");
        txtUnidadeProduto.setText("");
        txtPrecoCustoProduto.setText("");
        txtPrecoVendaProduto.setText("");
        txtQtdeProduto.setText("");
    }

    private void eventoCBCategoria(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String item = (String) cbCategoria.getSelectedItem();
            for (Categoria cat : cadDAO.eventoCBCategoria(item)) {
                txtFkCategoria.setText(Integer.toString(cat.getFkProduto()));
            }
        }
    }

    private void eventoCBMarca(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String item = (String) cbMarca.getSelectedItem();
            for (Marca mrc : cadDAO.eventoCBMarca(item)) {
                txtFkMarca.setText(Integer.toString(mrc.getFkProduto()));
            }
        }
    }

    private void calcularMargem() {
        String padrao = "##.##";
        DecimalFormat df = new DecimalFormat(padrao);
        float custo = Float.parseFloat(txtPrecoCustoProduto.getText());
        float venda = Float.parseFloat(txtPrecoVendaProduto.getText());
        //float lucro = venda - custo;
        float margem = 100 - ((custo / venda) * 100);
        String res = String.valueOf(df.format(margem));
        lblValorMargem.setText(res+"%");
    }

    private void exibirFornecedor() {
        if (jTablePessoa.getSelectedRow() != -1) {
            txtRazaoSocial.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 0));
            txtCnpjFornecedor.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 1));
            txtRamoAtividadeFornecedor.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 2));
            for (Fornecedor frn : cadDAO.pesquisarTabelaFRN(txtRazaoSocial.getText())) {
                txtIdFornecedor.setText(Integer.toString(frn.getFkPessoa()));
                txtEndereco.setText(frn.getEndereco());
                txtCidade.setText(frn.getCidade());
                txtInscricaoSocialFornecedor.setText(frn.getInscricaoSocial());
                txtCep.setText(frn.getCep());
                txtTelefone.setText(frn.getTelefone());
                txtCelular.setText(frn.getCelular());
                txtEmail.setText(frn.getEmail());
                txtBairro.setText(frn.getBairro());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        }
        iniciarCadastro();
        txtCnpjPessoaJuridica.setEnabled(false);
        txtRazaoSocial.requestFocus();
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(false);
    }

    private void pesquisarTabelaFornecedor(String desc) {
        for (Fornecedor frn : cadDAO.pesquisarTabelaFRN(desc)) {
            tabelaFRN.addRow(frn);
        }
    }

    private void excluirFornecedor() {
        Fornecedor frn = new Fornecedor();
        Pessoa pes = new Pessoa();
        if (jTablePessoa.getSelectedRow() != -1) {
            frn.setFkPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));
            pes.setIdPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));
            try {
                cadDAO.excluirPessoa(pes);
                cadDAO.excluirFornecedor(frn);
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaPJ.removeRow(jTablePessoa.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
            DesativarCampos();
            limparTextFields();
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void editarFornecedor() {
        if (txtCnpjFornecedor.getText().isEmpty() || txtInscricaoSocialFornecedor.getText().isEmpty() || txtRamoAtividadeFornecedor.getText().isEmpty() || txtRazaoSocial.getText().isEmpty() || txtEndereco.getText().isEmpty()
                || txtCep.getText().isEmpty() || txtCidade.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtBairro.getText().isEmpty() || txtCelular.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelular.getText().equals("(  )      -    ") && txtTelefone.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {
                Fornecedor frn = new Fornecedor();
                frn.setCnpj(txtCnpjFornecedor.getText());
                frn.setInscricaoSocial(txtInscricaoSocialFornecedor.getText());
                frn.setRamoAtividade(txtRamoAtividadeFornecedor.getText());
                frn.setFkPessoa(Integer.parseInt(txtIdFornecedor.getText()));

                Pessoa pes = new Pessoa();
                pes.setIdPessoa(Integer.parseInt(txtIdFornecedor.getText()));
                pes.setNome(txtRazaoSocial.getText());
                pes.setEndereco(txtEndereco.getText());
                pes.setCep(txtCep.getText());
                pes.setCidade(txtCidade.getText());
                pes.setTelefone(txtTelefone.getText());
                pes.setBairro(txtBairro.getText());
                pes.setCelular(txtCelular.getText());
                pes.setEmail(txtEmail.getText());
                try {
                    cadDAO.alterarPessoa(pes);
                    cadDAO.alterarFornecedor(frn);
                    DesativarCampos();
                    limparTextFields();
                    JOptionPane.showMessageDialog(null, "Cadastro Editado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PJ\n" + ex);
                }
            }
        }
    }

    private void salvarFornecedor() {
        if (txtCnpjFornecedor.getText().isEmpty() || txtInscricaoSocialFornecedor.getText().isEmpty() || txtRamoAtividadeFornecedor.getText().isEmpty() || txtRazaoSocial.getText().isEmpty()
                || txtEndereco.getText().isEmpty() || txtCep.getText().isEmpty() || txtCidade.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtBairro.getText().isEmpty() || txtCelular.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelular.getText().equals("(  )      -    ") && txtTelefone.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {
                Fornecedor frn = new Fornecedor();
                frn.setCnpj(txtCnpjFornecedor.getText());
                frn.setInscricaoSocial(txtInscricaoSocialFornecedor.getText());
                frn.setRamoAtividade(txtRamoAtividadeFornecedor.getText());
                Pessoa pes = new Pessoa();
                pes.setNome(txtRazaoSocial.getText());
                pes.setEndereco(txtEndereco.getText());
                pes.setCep(txtCep.getText());
                pes.setCidade(txtCidade.getText());
                pes.setTelefone(txtTelefone.getText());
                pes.setBairro(txtBairro.getText());
                pes.setCelular(txtCelular.getText());
                pes.setEmail(txtEmail.getText());
                try {
                    cadDAO.salvarPessoa(pes);
                    cadDAO.salvarForn(frn);
                    DesativarCampos();
                    limparTextFields();
                    btnNovo.setEnabled(true);
                    rbFisica.setEnabled(true);
                    rbJuridica.setEnabled(true);

                    btnLimpar.setEnabled(false);
                    btnSalvar.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PJ\n" + ex);
                }
            }
        }
    }

    private void exibirPessoaJuridica() {
        if (jTablePessoa.getSelectedRow() != -1) {
            txtRazaoSocial.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 0));
            txtCnpjPessoaJuridica.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 1));
            txtCreditoPessoaJuridica.setText(String.valueOf(jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 2)));
            for (PessoaJuridica pj : cadDAO.pesquisarTabelaPJ(txtRazaoSocial.getText())) {
                txtIdPessoaJuridica.setText(Integer.toString(pj.getFkPessoa()));
                txtEndereco.setText(pj.getEndereco());
                txtCidade.setText(pj.getCidade());
                txtInscricaoSocialPessoaJuridica.setText(pj.getInscricaoSocial());
                txtCep.setText(pj.getCep());
                txtTelefone.setText(pj.getTelefone());
                txtCelular.setText(pj.getCelular());
                txtEmail.setText(pj.getEmail());
                txtBairro.setText(pj.getBairro());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        }
        iniciarCadastro();
        txtCnpjPessoaJuridica.setEnabled(false);
        txtRazaoSocial.requestFocus();
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(false);
    }

    private void exibirPessoaFisica() {
        if (jTablePessoa.getSelectedRow() != -1) {
            txtRazaoSocial.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 0));
            txtCPFPessoaFisica.setText((String) jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 1));
            txtCreditoPessoaFisica.setText(String.valueOf(jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 2)));
            for (PessoaFisica pf : cadDAO.pesquisarTabelaPF(txtRazaoSocial.getText())) {
                txtIdPessoaFisica.setText(Integer.toString(pf.getFkPessoa()));
                txtRgPessoaFisica.setText(pf.getRg());
                txtEndereco.setText(pf.getEndereco());
                txtCidade.setText(pf.getCidade());
                txtCep.setText(pf.getCep());
                txtTelefone.setText(pf.getTelefone());
                txtCelular.setText(pf.getCelular());
                txtEmail.setText(pf.getEmail());
                txtBairro.setText(pf.getBairro());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        }
        iniciarCadastro();
        txtCPFPessoaFisica.setEnabled(false);
        txtRazaoSocial.requestFocus();
    }

    private void excluirPessoaJuridica() {
        PessoaJuridica pj = new PessoaJuridica();
        Pessoa pes = new Pessoa();
        if (jTablePessoa.getSelectedRow() != -1) {
            pj.setFkPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));
            pes.setIdPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));
            try {
                cadDAO.excluirPessoa(pes);
                cadDAO.excluirPessoaJuridica(pj);
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaPJ.removeRow(jTablePessoa.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
            DesativarCampos();
            limparTextFields();
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void excluirPessoaFisica() {
        PessoaFisica pf = new PessoaFisica();
        Pessoa pes = new Pessoa();
        if (jTablePessoa.getSelectedRow() != -1) {
            pf.setFkPessoa(Integer.parseInt(txtIdPessoaFisica.getText()));
            pes.setIdPessoa(Integer.parseInt(txtIdPessoaFisica.getText()));
            try {
                cadDAO.excluirPessoa(pes);
                cadDAO.excluirPessoaFisica(pf);
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                tabelaPF.removeRow(jTablePessoa.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
            DesativarCampos();
            limparTextFields();
        } else {
            JOptionPane.showMessageDialog(null, "Erro Cliente não selecionado");
        }
    }

    private void editarPessoaJuridica() {
        if (txtCnpjPessoaJuridica.getText().isEmpty() || txtInscricaoSocialPessoaJuridica.getText().isEmpty() || txtCreditoPessoaJuridica.getText().isEmpty() || txtRazaoSocial.getText().isEmpty() || txtEndereco.getText().isEmpty()
                || txtCep.getText().isEmpty() || txtCidade.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtBairro.getText().isEmpty() || txtCelular.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelular.getText().equals("(  )      -    ") && txtTelefone.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {
                PessoaJuridica pj = new PessoaJuridica();
                pj.setCnpj(txtCnpjPessoaJuridica.getText());
                pj.setInscricaoSocial(txtInscricaoSocialPessoaJuridica.getText());
                pj.setCredito(Float.parseFloat(txtCreditoPessoaJuridica.getText()));
                pj.setFkPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));

                Pessoa pes = new Pessoa();
                pes.setIdPessoa(Integer.parseInt(txtIdPessoaJuridica.getText()));
                pes.setNome(txtRazaoSocial.getText());
                pes.setEndereco(txtEndereco.getText());
                pes.setCep(txtCep.getText());
                pes.setCidade(txtCidade.getText());
                pes.setTelefone(txtTelefone.getText());
                pes.setBairro(txtBairro.getText());
                pes.setCelular(txtCelular.getText());
                pes.setEmail(txtEmail.getText());
                try {
                    cadDAO.alterarPessoa(pes);
                    cadDAO.alterarPessoaJuridica(pj);
                    DesativarCampos();
                    limparTextFields();
                    JOptionPane.showMessageDialog(null, "Cadastro Editado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PJ\n" + ex);
                }
            }
        }
    }

    private void editarPessoaFisica() {
        if (txtBairro.getText().isEmpty() || txtCPFPessoaFisica.getText().isEmpty() || txtCep.getText().isEmpty() || txtCidade.getText().isEmpty() || txtEmail.getText().isEmpty() || txtEndereco.getText().isEmpty() || txtRazaoSocial.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelular.getText().equals("(  )      -    ") && txtTelefone.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {
                PessoaFisica pf = new PessoaFisica();
                pf.setCpf(txtCPFPessoaFisica.getText());
                pf.setRg(txtRgPessoaFisica.getText());
                pf.setCredito(Float.parseFloat(txtCreditoPessoaFisica.getText()));
                pf.setFkPessoa(Integer.parseInt(txtIdPessoaFisica.getText()));

                Pessoa pes = new Pessoa();
                pes.setIdPessoa(Integer.parseInt(txtIdPessoaFisica.getText()));
                pes.setNome(txtRazaoSocial.getText());
                pes.setEndereco(txtEndereco.getText());
                pes.setCep(txtCep.getText());
                pes.setCidade(txtCidade.getText());
                pes.setTelefone(txtTelefone.getText());
                pes.setBairro(txtBairro.getText());
                pes.setCelular(txtCelular.getText());
                pes.setEmail(txtEmail.getText());
                try {
                    cadDAO.alterarPessoa(pes);
                    cadDAO.alterarPessoaFisica(pf);
                    DesativarCampos();
                    limparTextFields();
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PF\n" + ex);
                }
            }
        }
    }

    private void salvarPessoaJuridica() {
        if (txtCnpjPessoaJuridica.getText().isEmpty() || txtInscricaoSocialPessoaJuridica.getText().isEmpty() || txtCreditoPessoaJuridica.getText().isEmpty() || txtRazaoSocial.getText().isEmpty() || txtEndereco.getText().isEmpty()
                || txtCep.getText().isEmpty() || txtCidade.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtBairro.getText().isEmpty() || txtCelular.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelular.getText().equals("(  )      -    ") && txtTelefone.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {
                PessoaJuridica pj = new PessoaJuridica();
                pj.setCnpj(txtCnpjPessoaJuridica.getText());
                pj.setInscricaoSocial(txtInscricaoSocialPessoaJuridica.getText());
                pj.setCredito(Float.parseFloat(txtCreditoPessoaJuridica.getText()));
                Pessoa pes = new Pessoa();
                pes.setNome(txtRazaoSocial.getText());
                pes.setEndereco(txtEndereco.getText());
                pes.setCep(txtCep.getText());
                pes.setCidade(txtCidade.getText());
                pes.setTelefone(txtTelefone.getText());
                pes.setBairro(txtBairro.getText());
                pes.setCelular(txtCelular.getText());
                pes.setEmail(txtEmail.getText());
                try {
                    cadDAO.salvarPessoa(pes);
                    cadDAO.salvarPJ(pj);
                    DesativarCampos();
                    limparTextFields();
                    btnNovo.setEnabled(true);
                    rbFisica.setEnabled(true);
                    rbJuridica.setEnabled(true);

                    btnLimpar.setEnabled(false);
                    btnSalvar.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PJ\n" + ex);
                }
            }
        }
    }

    private void salvarPessoaFisica() {
        if (txtCPFPessoaFisica.getText().isEmpty() || txtRgPessoaFisica.getText().isEmpty() || txtCreditoPessoaFisica.getText().isEmpty() || txtRazaoSocial.getText().isEmpty() || txtEndereco.getText().isEmpty()
                || txtCep.getText().isEmpty() || txtCidade.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtBairro.getText().isEmpty() || txtCelular.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        } else {
            if (txtCelular.getText().equals("(  )      -    ") && txtTelefone.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha pelo menos um Telefone ou Celular");
            } else {

                PessoaFisica pf = new PessoaFisica();
                pf.setCpf(txtCPFPessoaFisica.getText());
                pf.setRg(txtRgPessoaFisica.getText());
                pf.setCredito(Float.parseFloat(txtCreditoPessoaFisica.getText()));

                Pessoa pes = new Pessoa();
                pes.setNome(txtRazaoSocial.getText());
                pes.setEndereco(txtEndereco.getText());
                pes.setCep(txtCep.getText());
                pes.setCidade(txtCidade.getText());
                pes.setTelefone(txtTelefone.getText());
                pes.setBairro(txtBairro.getText());
                pes.setCelular(txtCelular.getText());
                pes.setEmail(txtEmail.getText());

                try {
                    cadDAO.salvarPessoa(pes);
                    cadDAO.salvarPF(pf);
                    DesativarCampos();
                    limparTextFields();
                    btnNovo.setEnabled(true);
                    rbFisica.setEnabled(true);
                    rbJuridica.setEnabled(true);

                    btnLimpar.setEnabled(false);
                    btnSalvar.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no banco PF\n" + ex);
                }
            }
        }
    }

    private void verificarTipoCadastro() {
        if (rbFisica.isSelected()) {
            jTablePessoa.setModel(tabelaPF);
            bloquearFornecedor();
            bloquearJuridica();
            desbloquearFisica();
        } else if (rbJuridica.isSelected()) {
            jTablePessoa.setModel(tabelaPJ);
            bloquearFisica();
            bloquearFornecedor();
            desbloquearJuridica();
        } else {
            jTablePessoa.setModel(tabelaFRN);
            bloquearJuridica();
            bloquearFisica();
            desbloquearFornecedor();
        }
    }

    private void bloquearFisica() {
        for (Component a : jPnPessoaFisica.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void bloquearJuridica() {
        for (Component a : jPnPessoaJuridica.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void bloquearFornecedor() {
        for (Component a : jPnFornecedor.getComponents()) {
            a.setEnabled(false);
        }
    }

    private void desbloquearFisica() {
        for (Component a : jPnPessoaFisica.getComponents()) {
            a.setEnabled(true);
        }
        txtIdPessoaFisica.setEnabled(false);
    }

    private void desbloquearJuridica() {
        for (Component a : jPnPessoaJuridica.getComponents()) {
            a.setEnabled(true);
        }
        txtIdPessoaJuridica.setEnabled(false);
    }

    private void desbloquearFornecedor() {
        for (Component a : jPnFornecedor.getComponents()) {
            a.setEnabled(true);
        }
        txtIdFornecedor.setEnabled(false);
    }

    private void limparTabelaPrincipal() {
        if (jTablePessoa.getRowCount() > 0) {
            for (int i = 0; i <= jTablePessoa.getRowCount(); i++) {
                tabelaPF.limpaTabela();
            }
        }
    }

    private void pesquisarTabelaPessoaJuridica(String desc) {
        for (PessoaJuridica pj : cadDAO.pesquisarTabelaPJ(desc)) {
            tabelaPJ.addRow(pj);
        }
    }

    private void pesquisarTabelaPessoaFisica(String desc) {
        for (PessoaFisica pf : cadDAO.pesquisarTabelaPF(desc)) {
            tabelaPF.addRow(pf);
        }
    }

    private void preencherComboBoxMarca() {
        for (Marca mrc : prdDAO.preenchendoCBMarca()) {
            cbMarca.addItem(mrc.getNome());
            txtFkMarca.setText(Integer.toString(mrc.getFkProduto()));
        }
    }

    private void preencherComboBoxCategoria() {
        for (Categoria cat : prdDAO.preenchendoCBCategoria()) {
            cbCategoria.addItem(cat.getNome());
            txtFkCategoria.setText(Integer.toString(cat.getFkProduto()));
        }
    }

    private void pesquisarTabelaProduto(String desc) {
        Produto prd2 = new Produto();
        for (Produto prd : prdDAO.pesquisarProduto(desc)) {
            tabelaPRD.addRow(prd);
            prd2.setFkCategoria(prd.getFkCategoria());
            prd2.setFkFornecedor(prd.getFkFornecedor());
            prd2.setFkMarca(prd.getFkMarca());
        }
    }

    private void limparTextFields() {
        txtRazaoSocial.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        txtBairro.setText("");
        txtCPFPessoaFisica.setText("");
        txtRgPessoaFisica.setText("");
        txtCreditoPessoaFisica.setText("0.0");
        txtCnpjPessoaJuridica.setText("");
        txtInscricaoSocialPessoaJuridica.setText("");
        txtCreditoPessoaJuridica.setText("0.0");
        txtCnpjFornecedor.setText("");
        txtInscricaoSocialFornecedor.setText("");
        txtRamoAtividadeFornecedor.setText("");
    }

    private void AtivarCampos() {
        txtRazaoSocial.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtCidade.setEnabled(true);
        txtCep.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtCelular.setEnabled(true);
        txtEmail.setEnabled(true);
        txtBairro.setEnabled(true);
    }

    private void DesativarCampos() {
        txtRazaoSocial.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        txtCep.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);
        txtBairro.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnLimpar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    private void iniciarCadastro() {
        AtivarCampos();
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnLimpar.setEnabled(true);
        btnNovo.setEnabled(false);
        rbFisica.setEnabled(false);
        rbJuridica.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TipoCadastro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimparProduto;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnNovoCadastroProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JComboBox<Object> cbCategoria;
    private javax.swing.JComboBox<Object> cbMarca;
    private javax.swing.JTabbedPane guiGeral;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPnFornecedor;
    private javax.swing.JPanel jPnPessoaFisica;
    private javax.swing.JPanel jPnPessoaJuridica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePessoa;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JPanel jTpPrincipal;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairro1;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCelular1;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCep1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidade1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpf2;
    private javax.swing.JLabel lblCpf3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblIncricaoSocial;
    private javax.swing.JLabel lblIncricaoSocial1;
    private javax.swing.JLabel lblLimiteCredito;
    private javax.swing.JLabel lblLimiteCredito2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblRg1;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblValorMargem;
    private javax.swing.JPanel pnpBuscar;
    private javax.swing.JPanel pnpCadastrar;
    private javax.swing.JPanel pnpCadastrar1;
    private javax.swing.JRadioButton rbFisica;
    private javax.swing.JRadioButton rbJuridica;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairro1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarProduto;
    private javax.swing.JFormattedTextField txtCPFPessoaFisica;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCelular1;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JFormattedTextField txtCep1;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCidade1;
    private javax.swing.JFormattedTextField txtCnpjFornecedor;
    private javax.swing.JFormattedTextField txtCnpjPessoaJuridica;
    private javax.swing.JTextField txtCodigoBarrasProduto;
    private javax.swing.JTextField txtCreditoPessoaFisica;
    private javax.swing.JTextField txtCreditoPessoaJuridica;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JTextField txtFkCategoria;
    private javax.swing.JTextField txtFkMarca;
    private javax.swing.JTextField txtIdFornecedor;
    private javax.swing.JTextField txtIdPessoaFisica;
    private javax.swing.JTextField txtIdPessoaJuridica;
    private javax.swing.JTextField txtInscricaoSocialFornecedor;
    private javax.swing.JTextField txtInscricaoSocialPessoaJuridica;
    private javax.swing.JTextField txtPrecoCustoProduto;
    private javax.swing.JTextField txtPrecoVendaProduto;
    private javax.swing.JTextField txtQtdeProduto;
    private javax.swing.JTextField txtRamoAtividadeFornecedor;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtRazaoSocial1;
    private javax.swing.JTextField txtRgPessoaFisica;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtTelefone1;
    private javax.swing.JTextField txtUnidadeProduto;
    // End of variables declaration//GEN-END:variables

}
