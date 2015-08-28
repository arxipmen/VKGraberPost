package vkgraberpost;

import java.awt.*;
import javax.swing.*;

public class MainGUI extends javax.swing.JFrame {
    private int tabCaunter = 0;
    private ImageIcon closeIcon = null;
    private Dimension closeButtonSize = null;

    //Конструктор
    public MainGUI(String title) {
        closeIcon = new ImageIcon("res/close.png");
        initComponents();
        this.setTitle(title);
        this.setMinimumSize(new Dimension(500, 500));
        JTabbedPane jTabsPane = new JTabbedPane(); 
    }
    
    //Функция добавления табов
    public void addTab() {
    JScrollPane jScrollPane = new JScrollPane();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(960, 680));

        jMenu1.setText("File");
        jMenuBar.add(jMenu1);

        jMenu2.setLabel("Статистика");

        jMenuItem1.setLabel("Статистика 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenuItem1.getAccessibleContext().setAccessibleName("jMenuItem");
        jMenuItem1.getAccessibleContext().setAccessibleDescription("");

        jMenuItem2.setText("Статистика 2");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Статистика 3");
        jMenu2.add(jMenuItem3);

        jMenuBar.add(jMenu2);
        jMenu2.getAccessibleContext().setAccessibleName("");

        jMenu3.setText("Сервис");

        jMenuItem5.setText("Параметры");
        jMenu3.add(jMenuItem5);

        jMenuBar.add(jMenu3);

        jMenu4.setText("Справка");

        jMenuItem4.setText("О программе");
        jMenu4.add(jMenuItem4);

        jMenuBar.add(jMenu4);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(698, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        addTab();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
