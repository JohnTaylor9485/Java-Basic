package code;

import java.awt.ActiveEvent;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerClassTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    TalkingClock clock = new TalkingClock();
    clock.start(1000,true);
    JOptionPane.showMessageDialog(null, "quit?");
    System.exit(0);

  }

  
}
