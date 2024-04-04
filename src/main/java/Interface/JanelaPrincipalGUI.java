package Interface;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import Manage.ACMEApostas;
import Manage.Utils;
import Objetos.Aposta;
import Objetos.Apostador;


public class JanelaPrincipalGUI extends JFrame {

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

        cardJPanel = new JPanel();
        FaseAposta = new JPanel();
        jbtIniciar = new JButton();
        lbMegaSena = new JLabel();
        jScrollPane1 = new JScrollPane();
        jtaMensagensTelaInicial = new JTextArea();
        jbtApostar = new JButton();
        jcbSurpresa = new JCheckBox();
        jbtSortear = new JButton();
        jLabel1 = new JLabel();
        jtfNome = new JTextField();
        jLabel2 = new JLabel();
        jtfCPF = new JTextField();
        jLabel3 = new JLabel();
        jbtLimpar = new JButton();
        jbtListar = new JButton();
        jtfNumero1 = new JTextField();
        jtfNumero2 = new JTextField();
        jtfNumero3 = new JTextField();
        jtfNumero4 = new JTextField();
        jtfNumero5 = new JTextField();
        FaseSorteioApuracao = new JPanel();
        jPanel2 = new JPanel();
        jlbSorteio = new JLabel();
        jbtAvancarFasePremiacao = new JButton();
        jLabel5 = new JLabel();
        jScrollPane4 = new JScrollPane();
        jTableNumeroRodadas = new JTable();
        jScrollPane5 = new JScrollPane();
        jTableApostasVencedoras = new JTable();
        jLabel6 = new JLabel();
        JLableQtdRodadas = new JLabel();
        jScrollPane6 = new JScrollPane();
        jTableNumerosFrequencia = new JTable();
        jLabel7 = new JLabel();
        JLableQtdVencedores = new JLabel();
        jbtListarApostasApuracao = new JButton();
        jbtSortearSorteio = new JButton();
        FasePremiacao = new JPanel();
        jPanel1 = new JPanel();
        jlbPremiacao = new JLabel();
        jLabel8 = new JLabel();
        jLabel4 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jScrollPane7 = new JScrollPane();
        jTabelaVencedores = new JTable();
        jLabel11 = new JLabel();
        jbtBotaoFim = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(600, 490));

        cardJPanel.setMaximumSize(new Dimension(600, 490));
        cardJPanel.setMinimumSize(new Dimension(600, 490));
        cardJPanel.setPreferredSize(new Dimension(600, 490));
        cardJPanel.setLayout(new CardLayout());

        FaseAposta.setMaximumSize(new Dimension(40, 15));
        FaseAposta.setMinimumSize(new Dimension(40, 15));
        FaseAposta.setName(""); 
        FaseAposta.setPreferredSize(new Dimension(600, 490));

        jbtIniciar.setText("Iniciar");
        jbtIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jbtIniciarActionPerformed(evt);
            }
        });

        lbMegaSena.setFont(new Font("Segoe UI Symbol", 1, 36)); 
        lbMegaSena.setText("MegaSena");

        jtaMensagensTelaInicial.setEditable(false);
        jtaMensagensTelaInicial.setColumns(20);
        jtaMensagensTelaInicial.setRows(5);
        jtaMensagensTelaInicial.setEnabled(false);
        jtaMensagensTelaInicial.setMaximumSize(new Dimension(220, 80));
        jtaMensagensTelaInicial.setMinimumSize(new Dimension(220, 80));
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
        jtfNome.setMaximumSize(new Dimension(15, 24));

        jLabel2.setText("CPF:");

        jtfCPF.setEditable(false);
        jtfCPF.setEnabled(false);
        jtfCPF.setMaximumSize(new Dimension(15, 24));

        jLabel3.setText("Numeros:");

        jbtLimpar.setText("Limpar");
        jbtLimpar.setEnabled(false);
        jbtLimpar.addActionListener(evt -> jbtLimparActionPerformed(evt));

        jbtListar.setText("Listar");
        jbtListar.setEnabled(false);
        jbtListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jbtListarActionPerformed(evt);
            }
        });

        jtfNumero1.setEditable(false);
        jtfNumero1.setEnabled(false);
        jtfNumero1.setMaximumSize(new Dimension(40, 25));
        jtfNumero1.setMinimumSize(new Dimension(40, 25));
        jtfNumero1.setName(""); 
        jtfNumero1.setPreferredSize(new Dimension(40, 25));

        jtfNumero2.setEditable(false);
        jtfNumero2.setEnabled(false);
        jtfNumero2.setMaximumSize(new Dimension(40, 25));
        jtfNumero2.setMinimumSize(new Dimension(40, 25));
        jtfNumero2.setName(""); 
        jtfNumero2.setPreferredSize(new Dimension(40, 25));

        jtfNumero3.setEditable(false);
        jtfNumero3.setEnabled(false);
        jtfNumero3.setMaximumSize(new Dimension(40, 25));
        jtfNumero3.setMinimumSize(new Dimension(40, 25));
        jtfNumero3.setName(""); 
        jtfNumero3.setPreferredSize(new Dimension(40, 25));

        jtfNumero4.setEditable(false);
        jtfNumero4.setEnabled(false);
        jtfNumero4.setMaximumSize(new Dimension(40, 25));
        jtfNumero4.setMinimumSize(new Dimension(40, 25));
        jtfNumero4.setName(""); 
        jtfNumero4.setPreferredSize(new Dimension(40, 25));

        jtfNumero5.setEditable(false);
        jtfNumero5.setEnabled(false);
        jtfNumero5.setMaximumSize(new Dimension(40, 25));
        jtfNumero5.setMinimumSize(new Dimension(40, 25));
        jtfNumero5.setName(""); 
        jtfNumero5.setPreferredSize(new Dimension(40, 25));

        GroupLayout FaseApostaLayout = new GroupLayout(FaseAposta);
        FaseAposta.setLayout(FaseApostaLayout);
        FaseApostaLayout.setHorizontalGroup(
            FaseApostaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, FaseApostaLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(FaseApostaLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)
                    .addGroup(FaseApostaLayout.createSequentialGroup()
                        .addComponent(jbtLimpar, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jbtListar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtSortear, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.LEADING, FaseApostaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCPF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FaseApostaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addComponent(jtfNumero1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNumero2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNumero3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNumero4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNumero5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FaseApostaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jcbSurpresa)
                            .addComponent(jbtApostar, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
            .addGroup(FaseApostaLayout.createSequentialGroup()
                .addGroup(FaseApostaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(FaseApostaLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lbMegaSena))
                    .addGroup(FaseApostaLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jbtIniciar, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FaseApostaLayout.setVerticalGroup(
            FaseApostaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(FaseApostaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbMegaSena)
                .addGap(4, 4, 4)
                .addComponent(jbtIniciar)
                .addGap(18, 18, 18)
                .addGroup(FaseApostaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FaseApostaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumero2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtApostar)
                    .addComponent(jLabel3)
                    .addComponent(jtfNumero1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumero3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumero5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumero4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbSurpresa)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FaseApostaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSortear)
                    .addComponent(jbtLimpar)
                    .addComponent(jbtListar))
                .addGap(50, 50, 50))
        );

        cardJPanel.add(FaseAposta, "card2");

        FaseSorteioApuracao.setMaximumSize(new Dimension(600, 490));
        FaseSorteioApuracao.setMinimumSize(new Dimension(600, 490));

        jlbSorteio.setFont(new Font("Segoe UI Symbol", 1, 36)); 
        jlbSorteio.setText("Sorteio");

        jbtAvancarFasePremiacao.setText("Premiação");
        jbtAvancarFasePremiacao.setEnabled(false);
        jbtAvancarFasePremiacao.setMaximumSize(new Dimension(70, 25));
        jbtAvancarFasePremiacao.setMinimumSize(new Dimension(70, 25));
        jbtAvancarFasePremiacao.setPreferredSize(new Dimension(70, 25));
        jbtAvancarFasePremiacao.addActionListener(e -> jbtAvancarFasePremiacaoActionPerformed(e));

        jLabel5.setText("Sorteados:");

        jTableNumeroRodadas.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Rodada"
            }
        ) {
            @SuppressWarnings({ "rawtypes"})
            Class[] types = new Class [] {
                Integer.class, Integer.class
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

        jTableApostasVencedoras.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aposta", "Numeros", "Nome", "CPF"
            }
        ) {
            @SuppressWarnings({ "rawtypes"})
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class
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

        jTableNumerosFrequencia.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Frequência"
            }
        ) {
            @SuppressWarnings({ "rawtypes"})
            Class[] types = new Class [] {
                Integer.class, Integer.class
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
        jbtListarApostasApuracao.setMaximumSize(new Dimension(70, 24));
        jbtListarApostasApuracao.setMinimumSize(new Dimension(70, 24));
        jbtListarApostasApuracao.setPreferredSize(new Dimension(70, 24));
        jbtListarApostasApuracao.addActionListener(evt -> jbtListarApostasApuracaoActionPerformed(evt));

        jbtSortearSorteio.setText("Sortear");
        jbtSortearSorteio.addActionListener(evt -> jbtSortearSorteioActionPerformed(evt));

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(32, 32, 32)
                                        .addComponent(JLableQtdVencedores, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(66, 66, 66)
                                        .addComponent(JLableQtdRodadas, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jbtListarApostasApuracao, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtAvancarFasePremiacao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jlbSorteio)
                .addGap(81, 81, 81)
                .addComponent(jbtSortearSorteio, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSorteio)
                    .addComponent(jbtSortearSorteio))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JLableQtdVencedores))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(JLableQtdRodadas))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAvancarFasePremiacao, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtListarApostasApuracao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        GroupLayout FaseSorteioApuracaoLayout = new GroupLayout(FaseSorteioApuracao);
        FaseSorteioApuracao.setLayout(FaseSorteioApuracaoLayout);
        FaseSorteioApuracaoLayout.setHorizontalGroup(
            FaseSorteioApuracaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(FaseSorteioApuracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FaseSorteioApuracaoLayout.setVerticalGroup(
            FaseSorteioApuracaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(FaseSorteioApuracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardJPanel.add(FaseSorteioApuracao, "card3");

        jlbPremiacao.setFont(new Font("Segoe UI Symbol", 1, 40)); 
        jlbPremiacao.setText("Prêmio:");

        jLabel8.setIcon(new ImageIcon(getClass().getResource("/Images/dell.png"))); 
        jLabel8.setText("jLabel8");
        jLabel8.setMaximumSize(new Dimension(50, 50));
        jLabel8.setMinimumSize(new Dimension(50, 50));
        jLabel8.setPreferredSize(new Dimension(50, 50));

        jLabel4.setText("Nicolas Fonseca Docolas");

        jLabel9.setText("  Processo seletivo Dell Academy");

        jLabel10.setText("PUCRS - 2024");

        jTabelaVencedores.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vencedor", "Premio"
            }
        ) {
            @SuppressWarnings("rawtypes")
            Class[] types = new Class [] {
                String.class, String.class
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

        jLabel11.setFont(new Font("Dialog", 0, 14)); 
        jLabel11.setText("R$100.000.000,00");

        jbtBotaoFim.setText("Finalizar");
        jbtBotaoFim.addActionListener(evt -> jbtBotaoFimActionPerformed(evt));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(231, 231, 231))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtBotaoFim, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbPremiacao)
                        .addGap(218, 218, 218))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlbPremiacao, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbtBotaoFim)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        GroupLayout FasePremiacaoLayout = new GroupLayout(FasePremiacao);
        FasePremiacao.setLayout(FasePremiacaoLayout);
        FasePremiacaoLayout.setHorizontalGroup(
            FasePremiacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, FasePremiacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FasePremiacaoLayout.setVerticalGroup(
            FasePremiacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(FasePremiacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardJPanel.add(FasePremiacao, "card4");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(cardJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(cardJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    //Botao que inicia o programa
    private void jbtIniciarActionPerformed(ActionEvent evt) {
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
    private void jbtListarActionPerformed(ActionEvent evt) {
            if(acme.getListaAposta().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhuma aposta registrada!");
                return;
            }
            new TabelaApostasGUI(acme, jbtListar);
            jbtListar.setEnabled(false);
    }

    //Limpar a saida de texto
    private void jbtLimparActionPerformed(ActionEvent evt) {
               jtaMensagensTelaInicial.setText("");
    }

    //Metodo que organiza quando o botao "aposta surpresa" é ligado para que os demais fiquem desabilitados
    private void jcbSurpresaActionPerformed(ActionEvent evt) {

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
    private void jbtApostarActionPerformed(ActionEvent evt) {
        if(jtfNome.getText().trim().isEmpty() || jtfCPF.getText().trim().isEmpty()) {
        jtaMensagensTelaInicial.append("Voce precisa inserir um nome e um cpf!\n");
        return;
        }

        if(!jtfNome.getText().trim().matches("[a-zA-ZÀ-ú ]+") || 
        !jtfCPF.getText().trim().matches("[0-9]+")) {
            jtaMensagensTelaInicial.append("Padrão inválido! O nome deve ser apenas texto e o CPF apenas números.\n");
            return;
        }

    Apostador apostador = acme.pesquisaApostador(jtfNome.getText().trim(), jtfCPF.getText().trim());

    //Fazer aposta surpresa
    if(jcbSurpresa.isSelected()) {
        Aposta a = new Aposta(apostador.getNome(), apostador.getCpf());
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

        Aposta aposta = new Aposta(apostador.getNome(), apostador.getCpf(), vetor);

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
    private void jbtSortearActionPerformed(ActionEvent evt) {
        if(JOptionPane.showConfirmDialog(null, "Voce deseja iniciar a fase de sorteio?", "Confirmacao", JOptionPane.YES_NO_OPTION)
         == JOptionPane.YES_OPTION) avancarFaseApostaParaSorteio();
    }
  
    //Mostrar lista de apostas na tela de apuracao
    private void jbtListarApostasApuracaoActionPerformed(ActionEvent evt) {
        if(acme.getListaAposta().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma aposta registrada!");
            return;
        }
        new TabelaApostasGUI(acme, jbtListarApostasApuracao);
        jbtListarApostasApuracao.setEnabled(false);
    }

    //Botao que inicia o sorteio, chama os metodos e roda o metodo apuracao
    private void jbtSortearSorteioActionPerformed(ActionEvent evt) {
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
    private void jbtAvancarFasePremiacaoActionPerformed(ActionEvent evt) {
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
    private void jbtBotaoFimActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Muito obrigado por participar da minha Mega-Sena.\nEspero que tenha gostado!");
        System.exit(0);
    }     

    private JPanel FaseAposta;
    private JPanel FasePremiacao;
    private JPanel FaseSorteioApuracao;
    private JLabel JLableQtdRodadas;
    private JLabel JLableQtdVencedores;
    private JPanel cardJPanel;
    private JButton jbtBotaoFim;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JScrollPane jScrollPane7;
    private JTable jTabelaVencedores;
    private JTable jTableApostasVencedoras;
    private JTable jTableNumeroRodadas;
    private JTable jTableNumerosFrequencia;
    private JButton jbtApostar;
    private JButton jbtAvancarFasePremiacao;
    private JButton jbtIniciar;
    private JButton jbtLimpar;
    private JButton jbtListar;
    private JButton jbtListarApostasApuracao;
    private JButton jbtSortear;
    private JButton jbtSortearSorteio;
    private JCheckBox jcbSurpresa;
    private JLabel jlbPremiacao;
    private JLabel jlbSorteio;
    private JTextArea jtaMensagensTelaInicial;
    private JTextField jtfCPF;
    private JTextField jtfNome;
    private JTextField jtfNumero1;
    private JTextField jtfNumero2;
    private JTextField jtfNumero3;
    private JTextField jtfNumero4;
    private JTextField jtfNumero5;
    private JLabel lbMegaSena;
}
