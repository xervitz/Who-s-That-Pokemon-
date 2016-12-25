/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whosthatpokemon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JLabel;

/**
 *
 * @author milesnecker
 */
public class GuessingGUI extends javax.swing.JFrame {

    private pokedex[] pokedex = new pokedex[7];
    private int[] win = new int[7];
    private JLabel[] labels = new JLabel[160];
    private int reg = 0;
    private Color green = new Color(0,255,0);
    private Rectangle rect = new Rectangle(1000,750);
    /**
     * Creates new form GussingGUI
     */
    public GuessingGUI() {
        pokedex[0] = new kantoDex();
        pokedex[1] = new jhotoDex();
        pokedex[2] = new hoennDex();
        pokedex[3] = new sinnohDex();
        pokedex[4] = new unovaDex();
        pokedex[5] = new kalosDex();
        pokedex[6] = new alolaDex();
        
        for(int i = 0; i < win.length; i++) {
            win[i] = 0;
        }
        
        int w = 120;
        int h = 15;
        int x = 15, y = 100;
        initComponents();
        this.setVisible(true);
        this.setTitle("Who's That Pokemon?");
        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel();
            this.add(labels[i]);
            labels[i].setVisible(false);
            labels[i].setBounds(x, y, w, h);
            if ((i + 1) % 20 == 0) {
                x += 120;
                y = 100;
            } else {
                y += 30;
            }
        }
        
        
        this.setBounds(rect);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
        buildLabels(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kanto = new javax.swing.JButton();
        jhoto = new javax.swing.JButton();
        hoenn = new javax.swing.JButton();
        guessing = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        correct = new javax.swing.JLabel();
        sinnoh = new javax.swing.JButton();
        unova = new javax.swing.JButton();
        Kalos = new javax.swing.JButton();
        alola = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 1000, 700));
        setPreferredSize(new java.awt.Dimension(890, 900));

        kanto.setText("Kanto");
        kanto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kantoActionPerformed(evt);
            }
        });

        jhoto.setText("Jhoto");
        jhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhotoActionPerformed(evt);
            }
        });

        hoenn.setText("Hoenn");
        hoenn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoennActionPerformed(evt);
            }
        });

        guessing.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessingKeyPressed(evt);
            }
        });

        jLabel1.setText("Press Enter to Guess");

        sinnoh.setText("Sinnoh");
        sinnoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinnohActionPerformed(evt);
            }
        });

        unova.setText("Unova");
        unova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unovaActionPerformed(evt);
            }
        });

        Kalos.setText("Kalos");
        Kalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KalosActionPerformed(evt);
            }
        });

        alola.setText("Alola");
        alola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alolaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kanto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unova, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kalos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(hoenn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sinnoh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alola, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guessing, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(correct, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guessing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kanto)
                            .addComponent(jhoto)
                            .addComponent(hoenn)
                            .addComponent(sinnoh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Kalos)
                            .addComponent(unova)
                            .addComponent(alola))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kantoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kantoActionPerformed
        buildLabels(0);
    }//GEN-LAST:event_kantoActionPerformed

    private void jhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhotoActionPerformed
        buildLabels(1);
    }//GEN-LAST:event_jhotoActionPerformed

    private void hoennActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoennActionPerformed
        buildLabels(2);
    }//GEN-LAST:event_hoennActionPerformed

    private void guessingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guessingKeyPressed
        if (evt.getKeyCode() == 10) {
            checkGuess(guessing.getText());
            guessing.setText("");
            checkWinner();
        }
    }//GEN-LAST:event_guessingKeyPressed

    private void sinnohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinnohActionPerformed
        buildLabels(3);
    }//GEN-LAST:event_sinnohActionPerformed

    private void unovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unovaActionPerformed
        buildLabels(4);
    }//GEN-LAST:event_unovaActionPerformed

    private void KalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KalosActionPerformed
        buildLabels(5);
    }//GEN-LAST:event_KalosActionPerformed

    private void alolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alolaActionPerformed
        buildLabels(6);
    }//GEN-LAST:event_alolaActionPerformed

    private void buildLabels (int r) {
        reg = r;
        int i = 0;
        while (i < pokedex[reg].getSize()) {
            labels[i].setVisible(true);
            i++;
        }
        while (i < labels.length) {
            labels[i].setVisible(false);
            i++;
        }
        refresh();
    }
    
    private void checkGuess(String pok) {
        pokemon[] dex = pokedex[reg].getDex();

        if (pok.toLowerCase().equals("nidoran") && reg == 0) {
            pokedex[reg].setCorrect(28);
            pokedex[reg].setCorrect(31);
            correct.setText("CORRECT!");
        } else {
            int x = -1;
            for (int i = 0; i < dex.length; i++) {
                if (pok.toLowerCase().equals(dex[i].getName().toLowerCase()) == true) {
                    x = i;
                }
            }
            if(x != -1) {
                pokedex[reg].setCorrect(x);
                correct.setText("CORRECT!");
            }
            else {
                correct.setText("Incorrect");
            }
        }
        refresh();
    }

    private void refresh() {
        for (int i = 0; i < pokedex[reg].getSize(); i++) {
            if(pokedex[reg].getCorrect(i) == 1) {
                labels[i].setText((i + pokedex[reg].getStart()) + ": " + pokedex[reg].getPoke(i));
            }
            else {
                labels[i].setText((i + pokedex[reg].getStart()) + ": ");
            }
        }
    }

    private String checkWinner() {
        for(int i = 0; i < pokedex[reg].getSize(); i++) {
            if(pokedex[reg].getCorrect(i) == 0) {
                return "No";
            }
        }
        win[reg] = 1;
        if(win[reg] == 1) {
            switch (reg) {
                case 0:
                    kanto.setForeground(green);
                    break;
                case 1:
                    jhoto.setForeground(green);
                    break;
                case 2:
                    hoenn.setForeground(green);
                    break;
                case 3:
                    sinnoh.setForeground(green);
                    break;
                default:
                    System.out.println("Error, unknown pokedex entry exiting");
                    System.exit(97);
                    break;
            }
        }
        return "Yes";
    }

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
            java.util.logging.Logger.getLogger(GuessingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kalos;
    private javax.swing.JButton alola;
    private javax.swing.JLabel correct;
    private javax.swing.JTextField guessing;
    private javax.swing.JButton hoenn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jhoto;
    private javax.swing.JButton kanto;
    private javax.swing.JButton sinnoh;
    private javax.swing.JButton unova;
    // End of variables declaration//GEN-END:variables
}
