package Interface;

import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author Gabriel de Souza
 */
public class Calculadora extends javax.swing.JFrame {
    
    public Calculadora() {
        initComponents();
        setExtendedState(NORMAL);
        setTitle("Calculadora");
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JPanel();
        lbTela = new javax.swing.JLabel();
        btDivisao = new javax.swing.JButton();
        btMultiplicacao = new javax.swing.JButton();
        btSubtracao = new javax.swing.JButton();
        btSoma = new javax.swing.JButton();
        btNum9 = new javax.swing.JButton();
        btNum8 = new javax.swing.JButton();
        btNum7 = new javax.swing.JButton();
        btNum4 = new javax.swing.JButton();
        btNum6 = new javax.swing.JButton();
        btNum5 = new javax.swing.JButton();
        btDivisao2 = new javax.swing.JButton();
        btNum1 = new javax.swing.JButton();
        btNum3 = new javax.swing.JButton();
        btNum2 = new javax.swing.JButton();
        btNum0 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        Calculadora = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setMaximumSize(new java.awt.Dimension(512, 828));
        setMinimumSize(new java.awt.Dimension(256, 414));
        setName("Calculadora"); // NOI18N

        lbTela.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbTela.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        btDivisao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btDivisao.setText("/");

        btMultiplicacao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMultiplicacao.setText("*");

        btSubtracao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSubtracao.setText("-");

        btSoma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSoma.setText("+");

        btNum9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum9.setText("9");

        btNum8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum8.setText("8");

        btNum7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum7.setText("7");

        btNum4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum4.setText("4");

        btNum6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum6.setText("6");

        btNum5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum5.setText("5");

        btDivisao2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btDivisao2.setText("E");

        btNum1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum1.setText("1");

        btNum3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum3.setText("3");

        btNum2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum2.setText("2");

        btNum0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btNum0.setText("0");

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addGap(58, 58, 58)
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
                                            .addComponent(btDivisao2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(telaLayout.createSequentialGroup()
                                            .addComponent(btNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(btNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(btNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDivisao2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton btDivisao2;
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
    private javax.swing.JLabel lbTela;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel tela;
    // End of variables declaration//GEN-END:variables
}
