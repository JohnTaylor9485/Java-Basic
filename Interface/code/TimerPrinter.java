package code;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerPrinter implements ActionListener{

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    JOptionPane.showMessageDialog(null,"at the ring, the time is :"+new Date());
    Toolkit.getDefaultToolkit().beep();
    
  }

}
