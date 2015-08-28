package vkgraberpost;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class Test {

  private JFrame frame = new JFrame();
  private JTabbedPane tabbedPane = new JTabbedPane();
  private JButton addTabButton = new JButton("Add Tab");
  private ImageIcon closeXIcon = new ImageIcon("c:\\Users\\arxipovav\\Desktop\\close.png");
  private Dimension closeButtonSize;
  private int tabCounter = 0;

  public Test() {

    addTabButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        add();
        
      }
      
    });
    closeButtonSize = new Dimension(closeXIcon.getIconWidth() + 3, closeXIcon.getIconHeight() + 3);

    frame.add(tabbedPane, BorderLayout.CENTER);
    frame.add(addTabButton, BorderLayout.SOUTH);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.pack();
    frame.setMinimumSize(new Dimension(500, 500));
    frame.setVisible(true);

  }

  public void add() {
    final JPanel content = new JPanel();
    JPanel tab = new JPanel();
    tab.setOpaque(false);

    JLabel tabLabel = new JLabel("Tab " + (++tabCounter));

    JButton tabCloseButton = new JButton(closeXIcon);
    tabCloseButton.setPreferredSize(closeButtonSize);
    tabCloseButton.setVerticalTextPosition(SwingConstants.TOP);
    tabCloseButton.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        int closeTabNumber = tabbedPane.indexOfComponent(content);
        tabbedPane.removeTabAt(closeTabNumber);
      }
    });

    tab.add(tabLabel, BorderLayout.WEST);
    tab.add(tabCloseButton, BorderLayout.EAST);

    tabbedPane.addTab(null, content);
    tabbedPane.setTabComponentAt(tabbedPane.getTabCount() - 1, tab);
  }

  public static void main(String[] args) {
    Test main = new Test();
  }

}

