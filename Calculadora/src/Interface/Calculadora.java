package Interface;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Font;

/**
 *
 * @author Gabriel de Souza
 */
public class Calculadora extends javax.swing.JFrame {
    
    private double numAnterior = 0;
    private String numResult = "Sem Valor";
    
    public Calculadora() {
        initComponents();
        setExtendedState(NORMAL);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JPanel();
        lbCalcAnterior = new javax.swing.JLabel();
        lbTela = new javax.swing.JFormattedTextField();
        btDivisao = new javax.swing.JButton();
        btMultiplicacao = new javax.swing.JButton();
        btSubtracao = new javax.swing.JButton();
        btSoma = new javax.swing.JButton();
        btNum9 = new javax.swing.JButton();
        btNum8 = new javax.swing.JButton();
        btNum7 = new javax.swing.JButton();
        btNum6 = new javax.swing.JButton();
        btNum5 = new javax.swing.JButton();
        btNum4 = new javax.swing.JButton();
        btNum3 = new javax.swing.JButton();
        btNum2 = new javax.swing.JButton();
        btNum1 = new javax.swing.JButton();
        btNum0 = new javax.swing.JButton();
        btEnter = new javax.swing.JButton();
        btRaiz = new javax.swing.JButton();
        btPotencia = new javax.swing.JButton();
        btVirgula = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        lbErro = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        Calculadora = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(512, 828));
        setMinimumSize(new java.awt.Dimension(256, 414));
        setName(""); // NOI18N

        lbCalcAnterior.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbCalcAnterior.setBorder(lbTela.getBorder());
        lbCalcAnterior.setEnabled(false);

        lbTela.setEditable(false);
        lbTela.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        lbTela.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        lbTela.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        btDivisao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btDivisao.setText("/");
        btDivisao.setPreferredSize(new java.awt.Dimension(52, 52));
        btDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivisaoActionPerformed(evt);
            }
        });

        btMultiplicacao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMultiplicacao.setText("*");
        btMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicacaoActionPerformed(evt);
            }
        });

        btSubtracao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSubtracao.setText("-");
        btSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtracaoActionPerformed(evt);
            }
        });

        btSoma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSoma.setText("+");
        btSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomaActionPerformed(evt);
            }
        });

        btNum9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum9.setText("9");
        btNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum9ActionPerformed(evt);
            }
        });

        btNum8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum8.setText("8");
        btNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum8ActionPerformed(evt);
            }
        });

        btNum7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum7.setText("7");
        btNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum7ActionPerformed(evt);
            }
        });

        btNum6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum6.setText("6");
        btNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum6ActionPerformed(evt);
            }
        });

        btNum5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum5.setText("5");
        btNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum5ActionPerformed(evt);
            }
        });

        btNum4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum4.setText("4");
        btNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum4ActionPerformed(evt);
            }
        });

        btNum3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum3.setText("3");
        btNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum3ActionPerformed(evt);
            }
        });

        btNum2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum2.setText("2");
        btNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum2ActionPerformed(evt);
            }
        });

        btNum1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum1.setText("1");
        btNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum1ActionPerformed(evt);
            }
        });

        btNum0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum0.setText("0");
        btNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum0ActionPerformed(evt);
            }
        });

        btEnter.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btEnter.setText("E");
        btEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnterActionPerformed(evt);
            }
        });

        btRaiz.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btPotencia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btVirgula.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btDeletar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btDeletar.setText("D");
        btDeletar.setToolTipText("");

        lbErro.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTela)
                    .addComponent(lbCalcAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaLayout.createSequentialGroup()
                                .addComponent(btDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaLayout.createSequentialGroup()
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btRaiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(telaLayout.createSequentialGroup()
                                        .addComponent(btNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                                            .addComponent(btNum0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(telaLayout.createSequentialGroup()
                                            .addComponent(btNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(btNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                                        .addComponent(btNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCalcAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addComponent(btRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErro, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        Calculadora.setText("Calculadora");
        menuBar.add(Calculadora);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum1ActionPerformed
        String tam = lbTela.getText();
        try {
            if (numResult.equals(lbTela.getText())) {
                lbTela.setText("");
                lbCalcAnterior.setText("");
            }
            lbTela.setText(lbTela.getText() + "1");
            if (tam.length() >= 8) {
                lbTela.setFont(new Font("Segoe UI", 0, 16));
            } 
            if (tam.length() >= 25) {
                lbErro.setText("* Parte do número não está vísivel!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btNum1ActionPerformed

    private void btNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum2ActionPerformed
        String tam = lbTela.getText();
        try {
            if (numResult.equals(lbTela.getText())) {
                lbTela.setText("");
                lbCalcAnterior.setText("");
            }
            lbTela.setText(lbTela.getText() + "2");
            if (tam.length() >= 8) {
                lbTela.setFont(new Font("Segoe UI", 0, 16));
            } 
            if (tam.length() >= 25) {
                lbErro.setText("* Parte do número não está vísivel!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btNum2ActionPerformed

    private void btNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum3ActionPerformed
        String tam = lbTela.getText();
        try {
            if (numResult.equals(lbTela.getText())) {
                lbTela.setText("");
                lbCalcAnterior.setText("");
            }
            lbTela.setText(lbTela.getText() + "3");
            if (tam.length() >= 8) {
                lbTela.setFont(new Font("Segoe UI", 0, 16));
            } 
            if (tam.length() >= 25) {
                lbErro.setText("* Parte do número não está vísivel!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btNum3ActionPerformed

    private void btNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum4ActionPerformed
        String tam = lbTela.getText();
        try {
            if (numResult.equals(lbTela.getText())) {
                lbTela.setText("");
                lbCalcAnterior.setText("");
            }
            lbTela.setText(lbTela.getText() + "4");
            if (tam.length() >= 8) {
                lbTela.setFont(new Font("Segoe UI", 0, 16));
            } 
            if (tam.length() >= 25) {
                lbErro.setText("* Parte do número não está vísivel!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btNum4ActionPerformed

    private void btNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum5ActionPerformed
        String tam = lbTela.getText();
        try {
            if (numResult.equals(lbTela.getText())) {
                lbTela.setText("");
                lbCalcAnterior.setText("");
            }
            lbTela.setText(lbTela.getText() + "5");
            if (tam.length() >= 8) {
                lbTela.setFont(new Font("Segoe UI", 0, 16));
            } 
            if (tam.length() >= 25) {
                lbErro.setText("* Parte do número não está vísivel!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btNum5ActionPerformed

    private void btNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum6ActionPerformed
        String tam = lbTela.getText();
        try {
            if (numResult.equals(lbTela.getText())) {
                lbTela.setText("");
                lbCalcAnterior.setText("");
            }
            lbTela.setText(lbTela.getText() + "6");
            if (tam.length() >= 8) {
                lbTela.setFont(new Font("Segoe UI", 0, 16));
            } 
            if (tam.length() >= 25) {
                lbErro.setText("* Parte do número não está vísivel!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btNum6ActionPerformed

    private void btNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum7ActionPerformed
        String tam = lbTela.getText();
        try {
            if (numResult.equals(lbTela.getText())) {
                lbTela.setText("");
                lbCalcAnterior.setText("");
            }
            lbTela.setText(lbTela.getText() + "7");
            if (tam.length() >= 8) {
                lbTela.setFont(new Font("Segoe UI", 0, 16));
            } 
            if (tam.length() >= 25) {
                lbErro.setText("* Parte do número não está vísivel!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btNum7ActionPerformed

    private void btNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum8ActionPerformed
        String tam = lbTela.getText();
        try {
            if (numResult.equals(lbTela.getText())) {
                lbTela.setText("");
                lbCalcAnterior.setText("");
            }
            lbTela.setText(lbTela.getText() + "8");
            if (tam.length() >= 8) {
                lbTela.setFont(new Font("Segoe UI", 0, 16));
            } 
            if (tam.length() >= 25) {
                lbErro.setText("* Parte do número não está vísivel!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btNum8ActionPerformed

    private void btNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum9ActionPerformed
        String tam = lbTela.getText();
        try {
            if (numResult.equals(lbTela.getText())) {
                lbTela.setText("");
                lbCalcAnterior.setText("");
            }
            lbTela.setText(lbTela.getText() + "9");
            if (tam.length() >= 8) {
                lbTela.setFont(new Font("Segoe UI", 0, 16));
            } 
            if (tam.length() >= 25) {
                lbErro.setText("* Parte do número não está vísivel!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btNum9ActionPerformed

    private void btNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum0ActionPerformed
        String tam = lbTela.getText();
        try {
            if (numResult.equals(lbTela.getText())) {
                lbTela.setText("");
                lbCalcAnterior.setText("");
            }
            lbTela.setText(lbTela.getText() + "0");
            if (tam.length() >= 8) {
                lbTela.setFont(new Font("Segoe UI", 0, 16));
            } 
            if (tam.length() >= 25) {
                lbErro.setText("* Parte do número não está vísivel!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btNum0ActionPerformed
    
    private void btSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomaActionPerformed
        String numTela = lbTela.getText();
        numAnterior = Double.parseDouble(numTela);
        try {
            if (lbCalcAnterior.getText().contains(" + ")) {
                System.out.println("já prescionado!");
            } else {
                lbCalcAnterior.setText(numTela + " + ");
                lbTela.setText("");
                lbTela.setFont(new Font("Segoe UI", 0, 36));
                lbErro.setText("");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btSomaActionPerformed

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
        String numTelaString = lbTela.getText();
        double numTela = Double.parseDouble(numTelaString);
        try {
            if (lbCalcAnterior.getText().contains(" + ")) {
                double resultado = numAnterior + numTela;
                String resultTela = String.valueOf(resultado);
                lbTela.setText(resultTela);
                if (lbTela.getText().length() >= 8) {
                    lbTela.setFont(new Font("Segoe UI", 0, 16));
                }
                numResult = resultTela;
            } else if (lbCalcAnterior.getText().contains(" - ")) {
                double resultado = numAnterior - numTela;
                String resultTela = String.valueOf(resultado);
                lbTela.setText(resultTela);
                if (lbTela.getText().length() >= 8) {
                    lbTela.setFont(new Font("Segoe UI", 0, 16));
                }
                numResult = resultTela;
            } else if (lbCalcAnterior.getText().contains(" * ")) {
                double resultado = numAnterior * numTela;
                String resultTela = String.valueOf(resultado);
                lbTela.setText(resultTela);
                if (lbTela.getText().length() >= 8) {
                    lbTela.setFont(new Font("Segoe UI", 0, 16));
                }
                numResult = resultTela;
            } else if (lbCalcAnterior.getText().contains(" / ")) {
                double resultado = numAnterior / numTela;
                String resultTela = String.valueOf(resultado);
                lbTela.setText(resultTela);
                if (lbTela.getText().length() >= 8) {
                    lbTela.setFont(new Font("Segoe UI", 0, 16));
                }
                numResult = resultTela;
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btEnterActionPerformed

    private void btSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtracaoActionPerformed
        String numTela = lbTela.getText();
        numAnterior = Double.parseDouble(numTela);
        try {
            if (lbCalcAnterior.getText().contains(" - ")) {
                System.out.println("já prescionado!");
            } else {
                lbCalcAnterior.setText(numTela + " - ");
                lbTela.setText("");
                lbTela.setFont(new Font("Segoe UI", 0, 36));
                lbErro.setText("");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btSubtracaoActionPerformed

    private void btMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicacaoActionPerformed
        String numTela = lbTela.getText();
        numAnterior = Double.parseDouble(numTela);
        try {
            if (lbCalcAnterior.getText().contains(" * ")) {
                System.out.println("já prescionado!");
            } else {
                lbCalcAnterior.setText(numTela + " * ");
                lbTela.setText("");
                lbTela.setFont(new Font("Segoe UI", 0, 36));
                lbErro.setText("");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btMultiplicacaoActionPerformed

    private void btDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivisaoActionPerformed
        String numTela = lbTela.getText();
        numAnterior = Double.parseDouble(numTela);
        try {
            if (lbCalcAnterior.getText().contains(" / ")) {
                System.out.println("já prescionado!");
            } else {
                lbCalcAnterior.setText(numTela + " / ");
                lbTela.setText("");
                lbTela.setFont(new Font("Segoe UI", 0, 36));
                lbErro.setText("");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btDivisaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Calculadora;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btDivisao;
    private javax.swing.JButton btEnter;
    private javax.swing.JButton btMultiplicacao;
    private javax.swing.JButton btNum0;
    private javax.swing.JButton btNum1;
    private javax.swing.JButton btNum2;
    private javax.swing.JButton btNum3;
    private javax.swing.JButton btNum4;
    private javax.swing.JButton btNum5;
    private javax.swing.JButton btNum6;
    private javax.swing.JButton btNum7;
    private javax.swing.JButton btNum8;
    private javax.swing.JButton btNum9;
    private javax.swing.JButton btPotencia;
    private javax.swing.JButton btRaiz;
    private javax.swing.JButton btSoma;
    private javax.swing.JButton btSubtracao;
    private javax.swing.JButton btVirgula;
    private javax.swing.JLabel lbCalcAnterior;
    private javax.swing.JLabel lbErro;
    private javax.swing.JFormattedTextField lbTela;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel tela;
    // End of variables declaration//GEN-END:variables
}
