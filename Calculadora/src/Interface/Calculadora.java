package Interface;

import Funções.Operações;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Souza
 */
public class Calculadora extends javax.swing.JFrame {
    
    private double numAnterior = 0;
    private String numResult = "Sem Valor";
    
    private Font fontPequena = new Font("Segoe UI", 0, 16);
    private Font fontNormal = new Font("Segoe UI", 0, 36);
    
    private Funções.Operações o = new Operações();
    
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
        lbErro = new javax.swing.JLabel();
        btVirgula = new javax.swing.JButton();
        btExpo = new javax.swing.JButton();
        btLimpa = new javax.swing.JButton();
        lbOperacao = new javax.swing.JLabel();
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

        lbErro.setForeground(new java.awt.Color(255, 102, 102));

        btVirgula.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btVirgula.setText(",");
        btVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVirgulaActionPerformed(evt);
            }
        });

        btExpo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btExpo.setText("^");
        btExpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExpoActionPerformed(evt);
            }
        });

        btLimpa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btLimpa.setText("L");
        btLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpaActionPerformed(evt);
            }
        });

        lbOperacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOperacao.setBorder(lbTela.getBorder());

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTela)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaLayout.createSequentialGroup()
                                .addComponent(btNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(telaLayout.createSequentialGroup()
                                    .addComponent(btNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(telaLayout.createSequentialGroup()
                                    .addComponent(btNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                                    .addComponent(btNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEnter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btExpo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(telaLayout.createSequentialGroup()
                            .addComponent(btDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(telaLayout.createSequentialGroup()
                            .addComponent(lbCalcAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCalcAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lbOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(btNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addComponent(btExpo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErro, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos() {
        lbTela.setText("");
        lbCalcAnterior.setText("");
        lbOperacao.setText("");
        lbTela.setFont(fontNormal);
        enableNumeros();
    }
    
    private void escreveTela(int numero) {
        String numStr = String.valueOf(numero);
        lbTela.setText(lbTela.getText() + numStr);
        if (lbTela.getText().length() >= 8) {
            lbTela.setFont(fontPequena);
        }
    }
    
    private boolean testaTamanho() {
        if (lbTela.getText().length() >= 25) {
            lbErro.setText("* Número atingiu o limite na tela! ");
            return true;
        }
        return false;
    }
    
    private void disableNumeros() {
        btNum0.setEnabled(false);
        btNum1.setEnabled(false);
        btNum2.setEnabled(false);
        btNum3.setEnabled(false);
        btNum4.setEnabled(false);
        btNum5.setEnabled(false);
        btNum6.setEnabled(false);
        btNum7.setEnabled(false);
        btNum8.setEnabled(false);
        btNum9.setEnabled(false);
        btVirgula.setEnabled(false);
    }
    
    private void enableNumeros() {
        btNum0.setEnabled(true);
        btNum1.setEnabled(true);
        btNum2.setEnabled(true);
        btNum3.setEnabled(true);
        btNum4.setEnabled(true);
        btNum5.setEnabled(true);
        btNum6.setEnabled(true);
        btNum7.setEnabled(true);
        btNum8.setEnabled(true);
        btNum9.setEnabled(true);
        btVirgula.setEnabled(true);
    }
    
    private void btNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum1ActionPerformed
        try {
            escreveTela(1);
            if (testaTamanho() == true) {
                disableNumeros();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btNum1, "Algo deu Errado! ", "Erro Desconhecido! ", 0);
            limparCampos();
        }
    }//GEN-LAST:event_btNum1ActionPerformed

    private void btNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum2ActionPerformed
        try {
            escreveTela(2);
            if (testaTamanho() == true) {
                disableNumeros();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btNum1, "Algo deu Errado! ", "Erro Desconhecido! ", 0);
            limparCampos();
        }
    }//GEN-LAST:event_btNum2ActionPerformed

    private void btNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum3ActionPerformed
        try {
            escreveTela(3);
            if (testaTamanho() == true) {
                disableNumeros();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btNum1, "Algo deu Errado! ", "Erro Desconhecido! ", 0);
            limparCampos();
        }
    }//GEN-LAST:event_btNum3ActionPerformed

    private void btNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum4ActionPerformed
        try {
            escreveTela(4);
            if (testaTamanho() == true) {
                disableNumeros();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btNum1, "Algo deu Errado! ", "Erro Desconhecido! ", 0);
            limparCampos();
        }
    }//GEN-LAST:event_btNum4ActionPerformed

    private void btNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum5ActionPerformed
        try {
            escreveTela(5);
            if (testaTamanho() == true) {
                disableNumeros();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btNum1, "Algo deu Errado! ", "Erro Desconhecido! ", 0);
            limparCampos();
        }
    }//GEN-LAST:event_btNum5ActionPerformed

    private void btNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum6ActionPerformed
        try {
            escreveTela(6);
            if (testaTamanho() == true) {
                disableNumeros();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btNum1, "Algo deu Errado! ", "Erro Desconhecido! ", 0);
            limparCampos();
        }
    }//GEN-LAST:event_btNum6ActionPerformed

    private void btNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum7ActionPerformed
        try {
            escreveTela(7);
            if (testaTamanho() == true) {
                disableNumeros();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btNum1, "Algo deu Errado! ", "Erro Desconhecido! ", 0);
            limparCampos();
        }
    }//GEN-LAST:event_btNum7ActionPerformed

    private void btNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum8ActionPerformed
        try {
            escreveTela(8);
            if (testaTamanho() == true) {
                disableNumeros();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btNum1, "Algo deu Errado! ", "Erro Desconhecido! ", 0);
            limparCampos();
        }
    }//GEN-LAST:event_btNum8ActionPerformed

    private void btNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum9ActionPerformed
        try {
            escreveTela(9);
            if (testaTamanho() == true) {
                disableNumeros();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btNum1, "Algo deu Errado! ", "Erro Desconhecido! ", 0);
            limparCampos();
        }
    }//GEN-LAST:event_btNum9ActionPerformed

    private void btNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum0ActionPerformed
        try {
            escreveTela(0);
            if (testaTamanho() == true) {
                disableNumeros();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btNum1, "Algo deu Errado! ", "Erro Desconhecido! ", 0);
            limparCampos();
        }
    }//GEN-LAST:event_btNum0ActionPerformed
    
    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
        String numTelaString = lbTela.getText();
        String replaceNumTela = numTelaString.replace(",", ".");
        double numTela = Double.parseDouble(replaceNumTela);
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
        String replaceNumTela = numTela.replace(",", ".");
        numAnterior = Double.parseDouble(replaceNumTela);
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
        String replaceNumTela = numTela.replace(",", ".");
        numAnterior = Double.parseDouble(replaceNumTela);
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
        String replaceNumTela = numTela.replace(",", ".");
        numAnterior = Double.parseDouble(replaceNumTela);
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

    private void btVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVirgulaActionPerformed
        try {
            if (lbTela.getText().isBlank()) {
                lbTela.setText("0,");
            } else {
                lbTela.setText(lbTela.getText() + ",");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btVirgulaActionPerformed

    private void btExpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExpoActionPerformed
        String numTela = lbTela.getText();
        String replaceNumTela = numTela.replace(",", ".");
        numAnterior = Double.parseDouble(replaceNumTela);
        try {
            if (lbCalcAnterior.getText().contains(" ** ")) {
                System.out.println("já prescionado!");
            } else {
                double resultado = numAnterior * numAnterior;
                String resultTela = String.valueOf(resultado);
                lbTela.setText(resultTela);
                if (lbTela.getText().length() >= 8) {
                    lbTela.setFont(new Font("Segoe UI", 0, 16));
                numResult = resultTela;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btExpoActionPerformed

    private void btLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimpaActionPerformed

    private void btSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomaActionPerformed
        String numTela = lbTela.getText();
        String replaceNumTela = numTela.replace(",", ".");
        numAnterior = Double.parseDouble(replaceNumTela);
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
    private javax.swing.JButton btDivisao;
    private javax.swing.JButton btEnter;
    private javax.swing.JButton btExpo;
    private javax.swing.JButton btLimpa;
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
    private javax.swing.JButton btSoma;
    private javax.swing.JButton btSubtracao;
    private javax.swing.JButton btVirgula;
    private javax.swing.JLabel lbCalcAnterior;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbOperacao;
    private javax.swing.JFormattedTextField lbTela;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel tela;
    // End of variables declaration//GEN-END:variables
}