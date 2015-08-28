package vkgraberpost;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class VKGraberPost {
    
    //===Старт
    public static void main(String[] args) {
        
        //===Создаем новый поток
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
              Login login = new Login("VK GraberPost");
            }
        });
    }
    
}