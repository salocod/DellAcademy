/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.util.NoSuchElementException;
import java.util.Scanner;

import Manage.ACMEApostas;
import Manage.Aposta;
import Manage.Apostador;


public class JanelaPrincipalGUI extends javax.swing.JFrame {

    private ACMEApostas acme;
    private Aposta apostaPremiada;
    
    public JanelaPrincipalGUI() {
        super();
        acme = new ACMEApostas();
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(3);
        setTitle("Fase 1: Apostas");
        setLocationRelativeTo(null);  
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardJPanel = new javax.swing.JPanel();
        FaseAposta = new javax.swing.JPanel();
        jtfNumerosApostas = new javax.swing.JTextField();
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
        FaseSorteio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jbtSorteioSortear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaListaNumerosSorteados = new javax.swing.JTextArea();
        jbtApurar = new javax.swing.JButton();
        FaseApuracao = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 490));
        setMinimumSize(new java.awt.Dimension(600, 490));

        cardJPanel.setMaximumSize(new java.awt.Dimension(600, 490));
        cardJPanel.setMinimumSize(new java.awt.Dimension(600, 490));
        cardJPanel.setPreferredSize(new java.awt.Dimension(600, 490));
        cardJPanel.setLayout(new java.awt.CardLayout());

        FaseAposta.setMaximumSize(new java.awt.Dimension(600, 490));
        FaseAposta.setMinimumSize(new java.awt.Dimension(600, 490));
        FaseAposta.setPreferredSize(new java.awt.Dimension(600, 490));

        jtfNumerosApostas.setEditable(false);
        jtfNumerosApostas.setEnabled(false);
        jtfNumerosApostas.setMaximumSize(new java.awt.Dimension(15, 24));
        jtfNumerosApostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumerosApostasActionPerformed(evt);
            }
        });

        jbtIniciar.setText("Iniciar");
        jbtIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIniciarActionPerformed(evt);
            }
        });

        lbMegaSena.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
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
        jbtApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtApostarActionPerformed(evt);
            }
        });

        jcbSurpresa.setText("Surpresa");
        jcbSurpresa.setEnabled(false);
        jcbSurpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSurpresaActionPerformed(evt);
            }
        });

        jbtSortear.setText("Sortear");
        jbtSortear.setEnabled(false);
        jbtSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSortearActionPerformed(evt);
            }
        });

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
        jbtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLimparActionPerformed(evt);
            }
        });

        jbtListar.setText("Listar");
        jbtListar.setEnabled(false);
        jbtListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtListarActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumerosApostas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(FaseApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumerosApostas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtApostar)
                    .addComponent(jLabel3))
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

        FaseSorteio.setMaximumSize(new java.awt.Dimension(600, 490));
        FaseSorteio.setMinimumSize(new java.awt.Dimension(600, 490));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel4.setText("Sorteio");

        jbtSorteioSortear.setText("Sortear");
        jbtSorteioSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSorteioSortearActionPerformed(evt);
            }
        });

        jLabel5.setText("Numeros Sorteados");

        jtaListaNumerosSorteados.setEditable(false);
        jtaListaNumerosSorteados.setColumns(20);
        jtaListaNumerosSorteados.setRows(5);
        jtaListaNumerosSorteados.setEnabled(false);
        jScrollPane2.setViewportView(jtaListaNumerosSorteados);

        jbtApurar.setText("Apurar");
        jbtApurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtApurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FaseSorteioLayout = new javax.swing.GroupLayout(FaseSorteio);
        FaseSorteio.setLayout(FaseSorteioLayout);
        FaseSorteioLayout.setHorizontalGroup(
            FaseSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FaseSorteioLayout.createSequentialGroup()
                .addGroup(FaseSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FaseSorteioLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel4))
                    .addGroup(FaseSorteioLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FaseSorteioLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(FaseSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FaseSorteioLayout.createSequentialGroup()
                        .addComponent(jbtSorteioSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FaseSorteioLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FaseSorteioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtApurar)
                .addGap(256, 256, 256))
        );
        FaseSorteioLayout.setVerticalGroup(
            FaseSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FaseSorteioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtSorteioSortear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtApurar)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        cardJPanel.add(FaseSorteio, "card3");

        javax.swing.GroupLayout FaseApuracaoLayout = new javax.swing.GroupLayout(FaseApuracao);
        FaseApuracao.setLayout(FaseApuracaoLayout);
        FaseApuracaoLayout.setHorizontalGroup(
            FaseApuracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        FaseApuracaoLayout.setVerticalGroup(
            FaseApuracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        cardJPanel.add(FaseApuracao, "card4");

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
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNumerosApostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumerosApostasActionPerformed

    }//GEN-LAST:event_jtfNumerosApostasActionPerformed

    private void jbtIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIniciarActionPerformed
        jtfNumerosApostas.setEditable(true);
        jtfNumerosApostas.setEnabled(true);
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
    }//GEN-LAST:event_jbtIniciarActionPerformed

    private void jbtApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtApostarActionPerformed
        if(jtfNome.getText().isEmpty() || jtfCPF.getText().isEmpty()) {
            jtaMensagensTelaInicial.append("Voce precisa inserir um nome e um cpf!\n");
            return;
        }

        Apostador apostador = acme.pesquisaApostador(jtfNome.getText().trim(), jtfCPF.getText().trim());

        if(jcbSurpresa.isSelected()) {
            Aposta a = new Aposta(jtfNome.getText(), jtfCPF.getText());
            acme.addAposta(a);
            apostador.adicionarAposta(a);
            jtaMensagensTelaInicial.append("Aposta surpresa!\n" +
                                           "Numeros: " + a.printarAposta() + "\n");

            jcbSurpresa.setSelected(false);
            jtfNome.setText("");
            jtfCPF.setText("");
            jtfNumerosApostas.setEnabled(true);
            jtfNumerosApostas.setEditable(true);
            jbtSortear.setEnabled(true);
            return;
        }

        try (Scanner sc = new Scanner(jtfNumerosApostas.getText().trim())) {
            if(jtfNumerosApostas.getText().length() < 9) throw new NoSuchElementException();
            int[] aposta = new int[5];
            for (int i = 0; i < 5; i++) {
                aposta[i] = sc.nextInt();
                if(aposta[i] < 1 || aposta[i] > 50) throw new NoSuchElementException();
            }
            if(sc.hasNextInt()) throw new NoSuchElementException();

      
        Aposta a = new Aposta(apostador.getNome(), apostador.getCpf(), aposta);
      
        if(acme.addAposta(a)) {
                    apostador.adicionarAposta(a);
                    jtaMensagensTelaInicial.append("Aposta registrada.\n");
                    jbtSortear.setEnabled(true);
        } else {
                    jtaMensagensTelaInicial.append("Falha ao adicionar a aposta!\n");
        }

        } catch (NoSuchElementException e) {
            jtaMensagensTelaInicial.append("Falha! (Insira 5 numeros naturais menores que 50)\n");
            jtfNumerosApostas.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }

        jtfNome.setText("");
        jtfCPF.setText("");
        jtfNumerosApostas.setEnabled(true);
        jtfNumerosApostas.setEditable(true);
        jtfNumerosApostas.setText("");
        jcbSurpresa.setSelected(false);
        
    }//GEN-LAST:event_jbtApostarActionPerformed

    private void jbtSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSortearActionPerformed
        new ConfirmacaoFImApostaGUI(this);
    }//GEN-LAST:event_jbtSortearActionPerformed

    private void jcbSurpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSurpresaActionPerformed
        if(!jtfNumerosApostas.getText().isEmpty()) {
            jtaMensagensTelaInicial.append("Voce ja esta fazendo uma aposta!\n");
            jcbSurpresa.setSelected(false);
            return;
        }
        

        if(jtfNumerosApostas.isEnabled()) {
        jtfNumerosApostas.setEnabled(false);
        jtfNumerosApostas.setEditable(false);
        } else {
        jtfNumerosApostas.setEnabled(true);
        jtfNumerosApostas.setEditable(true);
        }
    }//GEN-LAST:event_jcbSurpresaActionPerformed

    private void jbtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLimparActionPerformed
        jtaMensagensTelaInicial.setText("");
    }//GEN-LAST:event_jbtLimparActionPerformed

    private void jbtListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtListarActionPerformed
        jtaMensagensTelaInicial.setText(acme.listarApostas());
    }//GEN-LAST:event_jbtListarActionPerformed

    private void jbtSorteioSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSorteioSortearActionPerformed
        apostaPremiada = new Aposta();
        apostaPremiada.iniciarNumerosSorteados();
        acme.setApostaPremiada(apostaPremiada);
        jtaListaNumerosSorteados.setText(apostaPremiada.iniciarNumerosSorteados());
        jbtSorteioSortear.setEnabled(false);
    }//GEN-LAST:event_jbtSorteioSortearActionPerformed

    private void jbtApurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtApurarActionPerformed
        acme.apuracao(jtaListaNumerosSorteados);
    }//GEN-LAST:event_jbtApurarActionPerformed

    public void avancarFase() {
        FaseAposta.setVisible(false);
        FaseSorteio.setVisible(true);
        setTitle("Fase 2: Sorteio");
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FaseAposta;
    private javax.swing.JPanel FaseApuracao;
    private javax.swing.JPanel FaseSorteio;
    private javax.swing.JPanel cardJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtApostar;
    private javax.swing.JButton jbtApurar;
    private javax.swing.JButton jbtIniciar;
    private javax.swing.JButton jbtLimpar;
    private javax.swing.JButton jbtListar;
    private javax.swing.JButton jbtSortear;
    private javax.swing.JButton jbtSorteioSortear;
    private javax.swing.JCheckBox jcbSurpresa;
    private javax.swing.JTextArea jtaListaNumerosSorteados;
    private javax.swing.JTextArea jtaMensagensTelaInicial;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumerosApostas;
    private javax.swing.JLabel lbMegaSena;
    // End of variables declaration//GEN-END:variables
}
