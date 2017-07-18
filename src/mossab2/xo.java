package mossab2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class xo extends javax.swing.JFrame {

    Thread t;
    char c1 = 'n', c2 = 'n', c3 = 'n', c4 = 'n', c5 = 'n', c6 = 'n', c7 = 'n', c8 = 'n', c9 = 'n';

    public xo(String s1, String s2) {
        initComponents();
        this.setLocationRelativeTo(null);
        player1.setText(s1);
        player2.setText(s2);
        player1.setForeground(Color.MAGENTA);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel7 = new JLabel();
        scoreo = new JLabel();
        jLabel8 = new JLabel();
        player1 = new JLabel();
        player2 = new JLabel();
        jLabel4 = new JLabel();
        scorex = new JLabel();
        jLabel6 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel9 = new JLabel();
        jLabel5 = new JLabel();
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(0, 153, 153));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new Color(0, 153, 153));

        jLabel7.setBackground(new Color(153, 0, 0));
        jLabel7.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        scoreo.setFont(new Font("sansserif", 1, 30)); // NOI18N
        scoreo.setHorizontalAlignment(SwingConstants.CENTER);
        scoreo.setText("0");
        scoreo.setBorder(new LineBorder(new Color(0, 102, 0), 3, true));

        jLabel8.setBackground(new Color(153, 0, 0));
        jLabel8.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        player1.setFont(new Font("sansserif", 1, 24)); // NOI18N
        player1.setHorizontalAlignment(SwingConstants.CENTER);
        player1.setBorder(new LineBorder(new Color(0, 0, 255), 3, true));

        player2.setFont(new Font("sansserif", 1, 24)); // NOI18N
        player2.setHorizontalAlignment(SwingConstants.CENTER);
        player2.setBorder(new LineBorder(new Color(0, 102, 0), 3, true));

        jLabel4.setBackground(new Color(153, 0, 0));
        jLabel4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        scorex.setFont(new Font("sansserif", 1, 30)); // NOI18N
        scorex.setHorizontalAlignment(SwingConstants.CENTER);
        scorex.setText("0");
        scorex.setBorder(new LineBorder(new Color(0, 0, 255), 3, true));

        jLabel6.setBackground(new Color(153, 0, 0));
        jLabel6.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new Color(153, 0, 0));
        jLabel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new Color(153, 0, 0));
        jLabel3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new Color(153, 0, 0));
        jLabel9.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel9.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new Color(153, 0, 0));
        jLabel5.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new Color(153, 0, 0));
        jLabel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton1.setFont(new Font("sansserif", 1, 24)); // NOI18N
        jButton1.setText("مرة أخرى");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new Font("sansserif", 1, 24)); // NOI18N
        jButton2.setText("خروج");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(player2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(player1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreo, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(scorex, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(player1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(scorex, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreo, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (c3 == 'n') {
            if (player1.getForeground() == Color.MAGENTA) {
                jLabel3.setIcon(new ImageIcon(getClass().getResource("/mossab2/x.png")));
                player1.setForeground(Color.BLACK);
                player2.setForeground(Color.MAGENTA);
                c3 = 'x';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            } else {
                jLabel3.setIcon(new ImageIcon(getClass().getResource("/mossab2/o.png")));
                player2.setForeground(Color.BLACK);
                player1.setForeground(Color.MAGENTA);
                c3 = 'o';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (c2 == 'n') {
            if (player1.getForeground() == Color.MAGENTA) {
                jLabel2.setIcon(new ImageIcon(getClass().getResource("/mossab2/x.png")));
                player1.setForeground(Color.BLACK);
                player2.setForeground(Color.MAGENTA);
                c2 = 'x';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            } else {
                jLabel2.setIcon(new ImageIcon(getClass().getResource("/mossab2/o.png")));
                player2.setForeground(Color.BLACK);
                player1.setForeground(Color.MAGENTA);
                c2 = 'o';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (c1 == 'n') {
            if (player1.getForeground() == Color.MAGENTA) {
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/mossab2/x.png")));
                player1.setForeground(Color.BLACK);
                player2.setForeground(Color.MAGENTA);
                c1 = 'x';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            } else {
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/mossab2/o.png")));
                player2.setForeground(Color.BLACK);
                player1.setForeground(Color.MAGENTA);
                c1 = 'o';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            }
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (c4 == 'n') {
            if (player1.getForeground() == Color.MAGENTA) {
                jLabel4.setIcon(new ImageIcon(getClass().getResource("/mossab2/x.png")));
                player1.setForeground(Color.BLACK);
                player2.setForeground(Color.MAGENTA);
                c4 = 'x';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            } else {
                jLabel4.setIcon(new ImageIcon(getClass().getResource("/mossab2/o.png")));
                player2.setForeground(Color.BLACK);
                player1.setForeground(Color.MAGENTA);
                c4 = 'o';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            }
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (c5 == 'n') {
            if (player1.getForeground() == Color.MAGENTA) {
                jLabel5.setIcon(new ImageIcon(getClass().getResource("/mossab2/x.png")));
                player1.setForeground(Color.BLACK);
                player2.setForeground(Color.MAGENTA);
                c5 = 'x';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            } else {
                jLabel5.setIcon(new ImageIcon(getClass().getResource("/mossab2/o.png")));
                player2.setForeground(Color.BLACK);
                player1.setForeground(Color.MAGENTA);
                c5 = 'o';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (c6 == 'n') {
            if (player1.getForeground() == Color.MAGENTA) {
                jLabel6.setIcon(new ImageIcon(getClass().getResource("/mossab2/x.png")));
                player1.setForeground(Color.BLACK);
                player2.setForeground(Color.MAGENTA);
                c6 = 'x';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            } else {
                jLabel6.setIcon(new ImageIcon(getClass().getResource("/mossab2/o.png")));
                player2.setForeground(Color.BLACK);
                player1.setForeground(Color.MAGENTA);
                c6 = 'o';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (c7 == 'n') {
            if (player1.getForeground() == Color.MAGENTA) {
                jLabel7.setIcon(new ImageIcon(getClass().getResource("/mossab2/x.png")));
                player1.setForeground(Color.BLACK);
                player2.setForeground(Color.MAGENTA);
                c7 = 'x';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            } else {
                jLabel7.setIcon(new ImageIcon(getClass().getResource("/mossab2/o.png")));
                player2.setForeground(Color.BLACK);
                player1.setForeground(Color.MAGENTA);
                c7 = 'o';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            }
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (c8 == 'n') {
            if (player1.getForeground() == Color.MAGENTA) {
                jLabel8.setIcon(new ImageIcon(getClass().getResource("/mossab2/x.png")));
                player1.setForeground(Color.BLACK);
                player2.setForeground(Color.MAGENTA);
                c8 = 'x';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            } else {
                jLabel8.setIcon(new ImageIcon(getClass().getResource("/mossab2/o.png")));
                player2.setForeground(Color.BLACK);
                player1.setForeground(Color.MAGENTA);
                c8 = 'o';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            }
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if (c9 == 'n') {
            if (player1.getForeground() == Color.MAGENTA) {
                jLabel9.setIcon(new ImageIcon(getClass().getResource("/mossab2/x.png")));
                player1.setForeground(Color.BLACK);
                player2.setForeground(Color.MAGENTA);
                c9 = 'x';
                new Thread(new PlaySon("Powerup.wav")).run();
                t = new Thread(new verify());
                t.start();
            } else {
                jLabel9.setIcon(new ImageIcon(getClass().getResource("/mossab2/o.png")));
                player2.setForeground(Color.BLACK);
                player1.setForeground(Color.MAGENTA);
                c9 = 'o';
                new PlaySon("Powerup.wav").run();
                t = new Thread(new verify());
                t.start();
            }
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        replay();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void replay() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        jLabel1.setIcon(new ImageIcon());
        c1 = 'n';
        jLabel2.setIcon(new ImageIcon());
        c2 = 'n';
        jLabel3.setIcon(new ImageIcon());
        c3 = 'n';
        jLabel4.setIcon(new ImageIcon());
        c4 = 'n';
        jLabel5.setIcon(new ImageIcon());
        c5 = 'n';
        jLabel6.setIcon(new ImageIcon());
        c6 = 'n';
        jLabel7.setIcon(new ImageIcon());
        c7 = 'n';
        jLabel8.setIcon(new ImageIcon());
        c8 = 'n';
        jLabel9.setIcon(new ImageIcon());
        c9 = 'n';
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JLabel player1;
    private JLabel player2;
    private JLabel scoreo;
    private JLabel scorex;
    // End of variables declaration//GEN-END:variables

    public class verify implements Runnable {

        @Override
        public void run() {

            if (((c1 == 'o') && (c2 == 'o') && (c3 == 'o')) || ((c4 == 'o') && (c5 == 'o') && (c6 == 'o')) || ((c7 == 'o') && (c8 == 'o') && (c9 == 'o'))
                    || ((c1 == 'o') && (c4 == 'o') && (c7 == 'o')) || ((c2 == 'o') && (c5 == 'o') && (c8 == 'o')) || ((c3 == 'o') && (c6 == 'o') && (c9 == 'o'))
                    || ((c1 == 'o') && (c5 == 'o') && (c9 == 'o')) || ((c3 == 'o') && (c5 == 'o') && (c7 == 'o'))) {

                int score = Integer.valueOf(scoreo.getText());
                scoreo.setText(String.valueOf(++score));
                new PlaySon("Ta Da.wav").run();
                try {
                    for (int i = 0; i < 5; i++) {
                        player2.setFont(new java.awt.Font("sansserif", 1, 35));
                        Thread.sleep(200);
                        player2.setFont(new java.awt.Font("sansserif", 1, 24));
                        Thread.sleep(200);
                        player2.setFont(new java.awt.Font("sansserif", 1, 35));
                        Thread.sleep(200);
                        player2.setFont(new java.awt.Font("sansserif", 1, 24));

                    }
                } catch (InterruptedException ex) {
                }
                replay();
            }
            if (((c1 == 'x') && (c2 == 'x') && (c3 == 'x')) || ((c4 == 'x') && (c5 == 'x') && (c6 == 'x')) || ((c7 == 'x') && (c8 == 'x') && (c9 == 'x'))
                    || ((c1 == 'x') && (c4 == 'x') && (c7 == 'x')) || ((c2 == 'x') && (c5 == 'x') && (c8 == 'x')) || ((c3 == 'x') && (c6 == 'x') && (c9 == 'x'))
                    || ((c1 == 'x') && (c5 == 'x') && (c9 == 'x')) || ((c3 == 'x') && (c5 == 'x') && (c7 == 'x'))) {
                int score = Integer.valueOf(scorex.getText());
                scorex.setText(String.valueOf(++score));
                new PlaySon("Ta Da.wav").run();
                try {
                    for (int i = 0; i < 5; i++) {
                        player1.setFont(new java.awt.Font("sansserif", 1, 35));
                        Thread.sleep(200);
                        player1.setFont(new java.awt.Font("sansserif", 1, 24));
                        Thread.sleep(200);
                        player1.setFont(new java.awt.Font("sansserif", 1, 35));
                        Thread.sleep(200);
                        player1.setFont(new java.awt.Font("sansserif", 1, 24));
                    }
                } catch (InterruptedException ex) {
                }
                replay();

            }
        }

    }

}
