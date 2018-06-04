package code;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   ActionListener listener=new TimerPrinter();
   Timer t=new Timer(5000,listener);
   t.start();
   JOptionPane.showMessageDialog(null, "quit?");
   System.exit(0);
  
  }

}
