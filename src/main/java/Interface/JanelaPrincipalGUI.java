package Interface;

import javax.swing.JOptionPane;

import Manage.ACMEApostas;
import Manage.Utils;
import Objetos.Aposta;
import Objetos.Apostador;


public class JanelaPrincipalGUI extends javax.swing.JFrame {

    private ACMEApostas acme;
    private Utils utils;
    
    public JanelaPrincipalGUI() {
        super();
        acme = new ACMEApostas();
        utils = new Utils(acme);
        iniciarComponentes();
        setResizable(false);
        setDefaultCloseOperation(3);
        setTitle("Fase 1: Apostas");
        setLocationRelativeTo(null);  
        setVisible(true);
    }

    //Metodo para iniciar todos os atributos do JFrame
    private void iniciarComponentes() {

        cardJPanel = new javax.swing.JPanel();
        FaseAposta = new javax.swing.JPanel();
        jbtIniciar = new javax.swing.JButton();
        lbMegaSena = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMensagensTelaInicial = new javax.swing.JTextArea();
        jbtApostar = new javax.swing.JButton();
        jcbSurpresa = new javax.swing.JCheckBox();
        jbtSortear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbtLimpar = new javax.swing.JButton();
        jbtListar = new javax.swing.JButton();
        jtfNumero1 = new javax.swing.JTextField();
        jtfNumero2 = new javax.swing.JTextField();
        jtfNumero3 = new javax.swing.JTextField();
        jtfNumero4 = new javax.swing.JTextField();
        jtfNumero5 = new javax.swing.JTextField();
        FaseSorteioApuracao = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlbSorteio = new javax.swing.JLabel();
        jbtAvancarFasePremiacao = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableNumeroRodadas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableApostasVencedoras = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        JLableQtdRodadas = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableNumerosFrequencia = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        JLableQtdVencedores = new javax.swing.JLabel();
        jbtListarApostasApuracao = new javax.swing.JButton();
        jbtSortearSorteio = new javax.swing.JButton();
        FasePremiacao = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jlbPremiacao = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTabelaVencedores = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jbtBotaoFim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 490));

        cardJPanel.setMaximumSize(new java.awt.Dimension(600, 490));
        cardJPanel.setMinimumSize(new java.awt.Dimension(600, 490));
        cardJPanel.setPreferredSize(new java.awt.Dimension(600, 490));
        cardJPanel.setLayout(new java.awt.CardLayout());

        FaseAposta.setMaximumSize(new java.awt.Dimension(40, 15));
        FaseAposta.setMinimumSize(new java.awt.Dimension(40, 15));
        FaseAposta.setName(""); 
        FaseAposta.setPreferredSize(new java.awt.Dimension(600, 490));

        jbtIniciar.setText("Iniciar");
        jbtIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIniciarActionPerformed(evt);
            }
        });

        lbMegaSena.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); 
        lbMegaSena.setText("MegaSena");

        jtaMensagensTelaInicial.setEditable(false);
        jtaMensagensTelaInicial.setColumns(20);
        jtaMensagensTelaInicial.setRows(5);
        jtaMensagensTelaInicial.setEnabled(false);
        jtaMensagensTelaInicial.setMaximumSize(new java.awt.Dimension(220, 80));
        jtaMensagensTelaInicial.setMinimumSize(new java.awt.Dimension(220, 80));
        jScrollPane1.setViewportView(jtaMensagensTelaInicial);

        jbtApostar.setText("Apostar");
        jbtApostar.setEnabled(false);
        jbtApostar.addActionListener(evt -> jbtApostarActionPerformed(evt));

        jcbSurpresa.setText("Surpresa");
        jcbSurpresa.setEnabled(false);
        jcbSurpresa.addActionListener(evt -> jcbSurpresaActionPerformed(evt));

        jbtSortear.setText("Sortear");
        jbtSortear.setEnabled(false);
        jbtSortear.addActionListener(evt -> jbtSortearActionPerformed(evt));

        jLabel1.setText("Nome:");

        jtfNome.setEditable(false);
        jtfNome.setEnabled(false);
        jtfNome.setMaximumSize(new java.awt.Dimension(15, 24));

        jLabel2.setText("CPF:");

        jtfCPF.setEditable(false);
        jtfCPF.setEnabled(false);
        jtfCPF.setMaximumSize(new java.awt.Dimension(15, 24));

        jLabel3.setText("Numeros:");

        jbtLimpar.setText("Limpar");
        jbtLimpar.setEnabled(false);
        jbtLimpar.addActionListener(evt -> jbtLimparActionPerformed(evt));

        jbtListar.setText("Listar");
        jbtListar.setEnabled(false);
        jbtListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtListarActionPerformed(evt);
            }
        });

        jtfNumero1.setEditable(false);
        jtfNumero1.setEnabled(false);
        jtfNumero1.setMaximumSize(new java.awt.Dimension(40, 25));
        jtfNumero1.setMinimumSize(new java.awt.Dimension(40, 25));
        jtfNumero1.setName(""); 
        jtfNumero1.setPreferredSize(new java.awt.Dimension(40, 25));

        jtfNumero2.setEditable(false);
        jtfNumero2.setEnabled(false);
        jtfNumero2.setMaximumSize(new java.awt.Dimension(40, 25));
        jtfNumero2.setMinimumSize(new java.awt.Dimension(40, 25));
        jtfNumero2.setName(""); 
        jtfNumero2.setPreferredSize(new java.awt.Dimension(40, 25));

        jtfNumero3.setEditable(false);
        jtfNumero3.setEnabled(false);
        jtfNumero3.setMaximumSize(new java.awt.Dimension(40, 25));
        jtfNumero3.setMinimumSize(new java.awt.Dimension(40, 25));
        jtfNumero3.setName(""); 
        jtfNumero3.setPreferredSize(new java.awt.Dimension(40, 25));

        jtfNumero4.setEditable(false);
        jtfNumero4.setEnabled(false);
        jtfNumero4.setMaximumSize(new java.awt.Dimension(40, 25));
        jtfNumero4.setMinimumSize(new java.awt.Dimension(40, 25));
        jtfNumero4.setName(""); 
        jtfNumero4.setPreferredSize(new java.awt.Dimension(40, 25));

        jtfNumero5.setEditable(false);
        jtfNumero5.setEnabled(false);
        jtfNumero5.setMaximumSize(new java.awt.Dimension(40, 25));
        jtfNumero5.setMinimumSize(new java.awt.Dimension(40, 25));
        jtfNumero5.setName(""); 
        jtfNumero5.setPreferredSize(new java.awt.Dimension(40, 25));

        javax.swing.GroupLayout FaseApostaLayout = new javax.swing.GroupLayout(FaseAposta);
        FaseAposta.setLayout(FaseApostaLayout);
        FaseApostaLayout.setHorizontalGroup(
            FaseApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FaseApostaLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(FaseApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FaseApostaLayout.createSequentialGroup()
                        .addComponent(jbtLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jbtListar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FaseApostaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FaseApostaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addComponent(jtfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FaseApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbSurpresa)
                            .addComponent(jbtApostar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
            .addGroup(FaseApostaLayout.createSequentialGroup()
                .addGroup(FaseApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FaseApostaLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lbMegaSena))
                    .addGroup(FaseApostaLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jbtIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FaseApostaLayout.setVerticalGroup(
            FaseApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FaseApostaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbMegaSena)
                .addGap(4, 4, 4)
                .addComponent(jbtIniciar)
                .addGap(18, 18, 18)
                .addGroup(FaseApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FaseApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtApostar)
                    .addComponent(jLabel3)
                    .addComponent(jtfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbSurpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FaseApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSortear)
                    .addComponent(jbtLimpar)
                    .addComponent(jbtListar))
                .addGap(50, 50, 50))
        );

        cardJPanel.add(FaseAposta, "card2");

        FaseSorteioApuracao.setMaximumSize(new java.awt.Dimension(600, 490));
        FaseSorteioApuracao.setMinimumSize(new java.awt.Dimension(600, 490));

        jlbSorteio.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); 
        jlbSorteio.setText("Sorteio");

        jbtAvancarFasePremiacao.setText("Premiação");
        jbtAvancarFasePremiacao.setEnabled(false);
        jbtAvancarFasePremiacao.setMaximumSize(new java.awt.Dimension(70, 25));
        jbtAvancarFasePremiacao.setMinimumSize(new java.awt.Dimension(70, 25));
        jbtAvancarFasePremiacao.setPreferredSize(new java.awt.Dimension(70, 25));
        jbtAvancarFasePremiacao.addActionListener(e -> jbtAvancarFasePremiacaoActionPerformed(e));

        jLabel5.setText("Sorteados:");

        jTableNumeroRodadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Rodada"
            }
        ) {
            @SuppressWarnings({ "rawtypes"})
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };
            @SuppressWarnings({ "rawtypes", "unchecked" })
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNumeroRodadas.setEnabled(false);
        jTableNumeroRodadas.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTableNumeroRodadas);
        if (jTableNumeroRodadas.getColumnModel().getColumnCount() > 0) {
            jTableNumeroRodadas.getColumnModel().getColumn(0).setResizable(false);
            jTableNumeroRodadas.getColumnModel().getColumn(1).setResizable(false);
        }

        jTableApostasVencedoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aposta", "Numeros", "Nome", "CPF"
            }
        ) {
            @SuppressWarnings({ "rawtypes"})
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };
            @SuppressWarnings({ "rawtypes", "unchecked" })
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableApostasVencedoras.setEnabled(false);
        jTableApostasVencedoras.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTableApostasVencedoras);
        if (jTableApostasVencedoras.getColumnModel().getColumnCount() > 0) {
            jTableApostasVencedoras.getColumnModel().getColumn(0).setResizable(false);
            jTableApostasVencedoras.getColumnModel().getColumn(1).setResizable(false);
            jTableApostasVencedoras.getColumnModel().getColumn(2).setResizable(false);
            jTableApostasVencedoras.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setText("Frequências:");

        JLableQtdRodadas.setText("Rodadas:");

        jTableNumerosFrequencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Frequência"
            }
        ) {
            @SuppressWarnings({ "rawtypes"})
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };
            @SuppressWarnings({ "rawtypes", "unchecked" })
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNumerosFrequencia.setEnabled(false);
        jTableNumerosFrequencia.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTableNumerosFrequencia);
        if (jTableNumerosFrequencia.getColumnModel().getColumnCount() > 0) {
            jTableNumerosFrequencia.getColumnModel().getColumn(0).setResizable(false);
            jTableNumerosFrequencia.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel7.setText("Apostas Vencedoras:");

        JLableQtdVencedores.setText("Quantidade:");

        jbtListarApostasApuracao.setText("Todas Apostas");
        jbtListarApostasApuracao.setEnabled(false);
        jbtListarApostasApuracao.setMaximumSize(new java.awt.Dimension(70, 24));
        jbtListarApostasApuracao.setMinimumSize(new java.awt.Dimension(70, 24));
        jbtListarApostasApuracao.setPreferredSize(new java.awt.Dimension(70, 24));
        jbtListarApostasApuracao.addActionListener(evt -> jbtListarApostasApuracaoActionPerformed(evt));

        jbtSortearSorteio.setText("Sortear");
        jbtSortearSorteio.addActionListener(evt -> jbtSortearSorteioActionPerformed(evt));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(32, 32, 32)
                                        .addComponent(JLableQtdVencedores, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(66, 66, 66)
                                        .addComponent(JLableQtdRodadas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jbtListarApostasApuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtAvancarFasePremiacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jlbSorteio)
                .addGap(81, 81, 81)
                .addComponent(jbtSortearSorteio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSorteio)
                    .addComponent(jbtSortearSorteio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JLableQtdVencedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(JLableQtdRodadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAvancarFasePremiacao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtListarApostasApuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout FaseSorteioApuracaoLayout = new javax.swing.GroupLayout(FaseSorteioApuracao);
        FaseSorteioApuracao.setLayout(FaseSorteioApuracaoLayout);
        FaseSorteioApuracaoLayout.setHorizontalGroup(
            FaseSorteioApuracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FaseSorteioApuracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FaseSorteioApuracaoLayout.setVerticalGroup(
            FaseSorteioApuracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FaseSorteioApuracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardJPanel.add(FaseSorteioApuracao, "card3");

        jlbPremiacao.setFont(new java.awt.Font("Segoe UI Symbol", 1, 40)); 
        jlbPremiacao.setText("Prêmio:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dell.png"))); 
        jLabel8.setText("jLabel8");
        jLabel8.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel8.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel4.setText("Nicolas Fonseca Docolas");

        jLabel9.setText("  Processo seletivo Dell Academy");

        jLabel10.setText("PUCRS - 2024");

        jTabelaVencedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vencedor", "Premio"
            }
        ) {
            @SuppressWarnings("rawtypes")
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            @SuppressWarnings({ "rawtypes", "unchecked" })
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabelaVencedores.setEnabled(false);
        jTabelaVencedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTabelaVencedores);
        if (jTabelaVencedores.getColumnModel().getColumnCount() > 0) {
            jTabelaVencedores.getColumnModel().getColumn(0).setResizable(false);
            jTabelaVencedores.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); 
        jLabel11.setText("R$100.000.000,00");

        jbtBotaoFim.setText("Finalizar");
        jbtBotaoFim.addActionListener(evt -> jbtBotaoFimActionPerformed(evt));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtBotaoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbPremiacao)
                        .addGap(218, 218, 218))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlbPremiacao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbtBotaoFim)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout FasePremiacaoLayout = new javax.swing.GroupLayout(FasePremiacao);
        FasePremiacao.setLayout(FasePremiacaoLayout);
        FasePremiacaoLayout.setHorizontalGroup(
            FasePremiacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FasePremiacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FasePremiacaoLayout.setVerticalGroup(
            FasePremiacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FasePremiacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardJPanel.add(FasePremiacao, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    //Botao que inicia o programa
    private void jbtIniciarActionPerformed(java.awt.event.ActionEvent evt) {
        jtfNumero1.setEnabled(true);
        jtfNumero1.setEditable(true);
        jtfNumero2.setEnabled(true);
        jtfNumero2.setEditable(true);
        jtfNumero3.setEnabled(true);
        jtfNumero3.setEditable(true);
        jtfNumero4.setEnabled(true);
        jtfNumero4.setEditable(true);
        jtfNumero5.setEnabled(true);
        jtfNumero5.setEditable(true);
        jtaMensagensTelaInicial.setEnabled(true);
        jtaMensagensTelaInicial.setEnabled(true);
        jbtApostar.setEnabled(true);
        jcbSurpresa.setEnabled(true);
        jbtIniciar.setEnabled(false);
        jtfNome.setEnabled(true);
        jtfNome.setEditable(true);
        jtfCPF.setEnabled(true);
        jtfCPF.setEditable(true);
        jbtLimpar.setEnabled(true);
        jbtListar.setEnabled(true);
    }    

    //Listar todas apostas na Fase 1
    private void jbtListarActionPerformed(java.awt.event.ActionEvent evt) {
            if(acme.getListaAposta().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhuma aposta registrada!");
                return;
            }
            new TabelaApostasGUI(acme, jbtListar);
            jbtListar.setEnabled(false);
    }

    //Limpar a saida de texto
    private void jbtLimparActionPerformed(java.awt.event.ActionEvent evt) {
               jtaMensagensTelaInicial.setText("");
    }

    //Metodo que organiza quando o botao "aposta surpresa" é ligado para que os demais fiquem desabilitados
    private void jcbSurpresaActionPerformed(java.awt.event.ActionEvent evt) {

        if(!jtfNumero1.getText().isEmpty() ||
            !jtfNumero2.getText().isEmpty() ||
            !jtfNumero3.getText().isEmpty() ||
            !jtfNumero4.getText().isEmpty() ||
            !jtfNumero5.getText().isEmpty()) {
            jtaMensagensTelaInicial.append("Voce ja esta fazendo uma aposta!\n");
            jcbSurpresa.setSelected(false);
            return;
        }
        if(jtfNumero1.isEnabled()) {
            jtfNumero1.setEnabled(false);
            jtfNumero1.setEditable(false);
            jtfNumero2.setEnabled(false);
            jtfNumero2.setEditable(false);
            jtfNumero3.setEnabled(false);
            jtfNumero3.setEditable(false);
            jtfNumero4.setEnabled(false);
            jtfNumero4.setEditable(false);
            jtfNumero5.setEnabled(false);
            jtfNumero5.setEditable(false);
        } else {
            jtfNumero1.setEnabled(true);
            jtfNumero1.setEditable(true);
            jtfNumero2.setEnabled(true);
            jtfNumero2.setEditable(true);
            jtfNumero3.setEnabled(true);
            jtfNumero3.setEditable(true);
            jtfNumero4.setEnabled(true);
            jtfNumero4.setEditable(true);
            jtfNumero5.setEnabled(true);
            jtfNumero5.setEditable(true);
        }
    }

    //Metodo que roda quando o botao "Apostar" na Fase 1 é clicado
    private void jbtApostarActionPerformed(java.awt.event.ActionEvent evt) {
        if(jtfNome.getText().trim().isEmpty() || jtfCPF.getText().trim().isEmpty()) {
        jtaMensagensTelaInicial.append("Voce precisa inserir um nome e um cpf!\n");
        return;
    }

    Apostador apostador = acme.pesquisaApostador(jtfNome.getText().trim(), jtfCPF.getText().trim());

    //Fazer aposta surpresa
    if(jcbSurpresa.isSelected()) {
        Aposta a = new Aposta(jtfNome.getText(), jtfCPF.getText());
        acme.addAposta(a);
        apostador.adicionarAposta(a);
        jtaMensagensTelaInicial.append("Aposta " + a.getRegistro() + ": " + a.getNumeros() + "\n");

        jbtSortear.setEnabled(true);
        return;
    }

    //Verificar caso algum dos campos esteja vazio
    if(jtfNumero1.getText().trim().isEmpty() ||
        jtfNumero2.getText().trim().isEmpty() ||
        jtfNumero3.getText().trim().isEmpty() ||
        jtfNumero4.getText().trim().isEmpty() ||
        jtfNumero5.getText().trim().isEmpty()) {
        jtaMensagensTelaInicial.append("Voce precisa inserir todos os numeros para apostar!\n");
        return;
    }

    String[] lista = {jtfNumero1.getText(),
        jtfNumero2.getText(),
        jtfNumero3.getText(),
        jtfNumero4.getText(),
        jtfNumero5.getText()};

    //Verificador caso os numeros apostados sejam iguais
    if(!utils.conferirStrings(lista))  {
        jtaMensagensTelaInicial.append("Todos os numeros precisam ser diferentes!\n");
        return;
    }

    /*
      Aqui a aposta é criada. Caso os numeros nao sejam entre 1 e 50
      é "lancada" uma exception. Caso tudo esteja seguindo o padrao
      a aposta é criada.
    */
    try {
        int n1 = Integer.parseInt(jtfNumero1.getText());
        int n2 = Integer.parseInt(jtfNumero2.getText());
        int n3 = Integer.parseInt(jtfNumero3.getText());
        int n4 = Integer.parseInt(jtfNumero4.getText());
        int n5 = Integer.parseInt(jtfNumero5.getText());

        if(n1 > 50 || n1 < 1 || n2 > 50 || n2 < 1 ||
            n3 > 50 || n3 < 1 || n4 > 50 || n4 < 1 ||
            n5 > 50 || n5 < 1) throw new NumberFormatException();

        int[] vetor = {n1, n2, n3, n4 , n5};

        Aposta aposta = new Aposta(jtfNome.getText(), jtfCPF.getText(), vetor);

        acme.addAposta(aposta);
        apostador.adicionarAposta(aposta);

        jtaMensagensTelaInicial.append("Aposta " + aposta.getRegistro() + ": " + aposta.getNumeros() + "\n");
        jbtSortear.setEnabled(true);
        jtfNumero1.setText("");
        jtfNumero2.setText("");
        jtfNumero3.setText("");
        jtfNumero4.setText("");
        jtfNumero5.setText("");

    } catch(NumberFormatException e) {
        jtaMensagensTelaInicial.append("Apenas numeros naturais entre 1 e 50!\n");
    } catch(Exception e) {
        e.printStackTrace();
    }

}

    //Lança uma janela para fazer a confirmacao antes de ir para o sorteio
    private void jbtSortearActionPerformed(java.awt.event.ActionEvent evt) {
        int result = JOptionPane.showConfirmDialog(null, "Voce deseja iniciar a fase de sorteio?", "Confirmacao", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) avancarFaseApostaParaSorteio();
        
    }
  
    //Mostrar lista de apostas na tela de apuracao
    private void jbtListarApostasApuracaoActionPerformed(java.awt.event.ActionEvent evt) {
        if(acme.getListaAposta().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma aposta registrada!");
            return;
        }
        new TabelaApostasGUI(acme, jbtListarApostasApuracao);
        jbtListarApostasApuracao.setEnabled(false);
    }

    //Botao que inicia o sorteio, chama os metodos e roda o metodo apuracao
    private void jbtSortearSorteioActionPerformed(java.awt.event.ActionEvent evt) {
            jbtSortearSorteio.setEnabled(false);
            jTableApostasVencedoras.setEnabled(true);
            jTableNumerosFrequencia.setEnabled(true);
            jTableNumeroRodadas.setEnabled(true);
            jbtAvancarFasePremiacao.setEnabled(true);
            jbtListarApostasApuracao.setEnabled(true);
            jlbSorteio.setText("Apuração");
            setTitle("Fase 3: Apuração");
            acme.setApostaPremiada(new Aposta());
            acme.apuracao();
            utils.preencherApostasVencedoras(jTableApostasVencedoras, JLableQtdVencedores);
            utils.preencherNumerosSorteados(jTableNumeroRodadas, JLableQtdRodadas);
            utils.preencherNumerosOrdenadosPorFrequencia(jTableNumerosFrequencia, acme.getListaVetores());
            utils.centralizarConteudoTabela(jTableApostasVencedoras);
            utils.centralizarConteudoTabela(jTableNumeroRodadas);
            utils.centralizarConteudoTabela(jTableNumerosFrequencia);
    }

    //Metodo para avancar para Fase 2
    private void avancarFaseApostaParaSorteio() {
        FaseAposta.setVisible(false);
        FaseSorteioApuracao.setVisible(true);
        setTitle("Fase 2: Sorteio");
    }
    
    //Metodo para avancar para Fase 4
    private void jbtAvancarFasePremiacaoActionPerformed(java.awt.event.ActionEvent evt) {
        FaseSorteioApuracao.setVisible(false);
        FasePremiacao.setVisible(true);
        setTitle("Fase 4: Premiação");
        if(acme.getListaVencedores().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum apostador ganhou a MegaSena!");
            return;
        } 
        if(acme.getListaVencedores().size() > 1) JOptionPane.showMessageDialog(null, "Parabéns aos " + acme.getListaVencedores().size() + " vencedores!");
        else JOptionPane.showMessageDialog(null, "Parabéns ao único vencedor!");
        utils.preencherTabelaVencedores(jTabelaVencedores, acme.getListaVencedores());
        utils.centralizarConteudoTabela(jTabelaVencedores);
     }

    //Fim do Programa
    private void jbtBotaoFimActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Muito obrigado por participar da minha Mega-Sena.\nEspero que tenha gostado!");
        System.exit(0);
    }     

    private javax.swing.JPanel FaseAposta;
    private javax.swing.JPanel FasePremiacao;
    private javax.swing.JPanel FaseSorteioApuracao;
    private javax.swing.JLabel JLableQtdRodadas;
    private javax.swing.JLabel JLableQtdVencedores;
    private javax.swing.JPanel cardJPanel;
    private javax.swing.JButton jbtBotaoFim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTabelaVencedores;
    private javax.swing.JTable jTableApostasVencedoras;
    private javax.swing.JTable jTableNumeroRodadas;
    private javax.swing.JTable jTableNumerosFrequencia;
    private javax.swing.JButton jbtApostar;
    private javax.swing.JButton jbtAvancarFasePremiacao;
    private javax.swing.JButton jbtIniciar;
    private javax.swing.JButton jbtLimpar;
    private javax.swing.JButton jbtListar;
    private javax.swing.JButton jbtListarApostasApuracao;
    private javax.swing.JButton jbtSortear;
    private javax.swing.JButton jbtSortearSorteio;
    private javax.swing.JCheckBox jcbSurpresa;
    private javax.swing.JLabel jlbPremiacao;
    private javax.swing.JLabel jlbSorteio;
    private javax.swing.JTextArea jtaMensagensTelaInicial;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero1;
    private javax.swing.JTextField jtfNumero2;
    private javax.swing.JTextField jtfNumero3;
    private javax.swing.JTextField jtfNumero4;
    private javax.swing.JTextField jtfNumero5;
    private javax.swing.JLabel lbMegaSena;
}
