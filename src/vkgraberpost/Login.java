package vkgraberpost;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private String sqlQuery = "";
    private MainGUI gui = null;

    //Конструктор
    public Login(String title) {
        initComponents();
        this.setTitle(title);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPass = new javax.swing.JLabel();
        jLogin = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        jButtonOK = new javax.swing.JButton();
        jRegistation = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Войти", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPass.setText("Пароль:");

        jLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLogin.setText("Логин:");

        jButtonOK.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jRegistation.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRegistation.setForeground(new java.awt.Color(102, 153, 255));
        jRegistation.setText("Регистрация");
        jRegistation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRegistation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegistationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jRegistationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jRegistationMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vkgraberpost/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPass)
                            .addComponent(jLogin))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonOK)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jRegistation))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRegistation, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPass))
                .addGap(18, 18, 18)
                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRegistationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegistationMouseExited
        jRegistation.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRegistation.setForeground(new java.awt.Color(0, 51, 255));
    }//GEN-LAST:event_jRegistationMouseExited

    private void jRegistationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegistationMouseEntered
        jRegistation.setFont(new java.awt.Font("Tahoma", 1, 10));
        jRegistation.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jRegistationMouseEntered

    private void jRegistationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegistationMouseClicked
        new Registration();
        this.setVisible(false);
    }//GEN-LAST:event_jRegistationMouseClicked

    //Обработчик входа в программу
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        try {
            sqlQuery = "SELECT * FROM users WHERE login=? and pass=?";
            con = ConnectDB.connect();
            pst = con.prepareStatement(sqlQuery);
            pst.setString(1, txtLogin.getText());
            pst.setString(2, txtPass.getText());
            rs = pst.executeQuery();
            if(rs.next()) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Приветствую вас, " + txtLogin.getText());
                gui =  new MainGUI("VK Graber Posts");
                gui.setLocationRelativeTo(null);
                gui.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "Ввели не правельно логин или пароль" );
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                ConnectDB.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ошибка закрытия соединения с DB" );
            }
        }

    }//GEN-LAST:event_jButtonOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLogin;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jPass;
    private javax.swing.JLabel jRegistation;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
