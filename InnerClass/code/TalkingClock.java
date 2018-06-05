package code;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {
  private int interval;
  private boolean beep;

//  public TalkingClock(int interval, boolean beep) {
//    this.interval = interval;
//    this.beep = beep;
//  }

//  public void start() {
//    ActionListener listener = new TimerPrinter();
//    Timer t = new Timer(interval, listener);
//    t.start();
//  }
//
//  public class TimePrinter implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//      // TODO Auto-generated method stub
//      System.out.println("At the tone, the time is " + new Date());
//      if (beep)
//        Toolkit.getDefaultToolkit().beep();
//    }
//  }
  
  public void start(int intevl,boolean beep) {
    ActionListener listener=new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("at tone the time is : "+ new Date());
        if(beep)
          Toolkit.getDefaultToolkit().beep();
      }
    };
  }
  
  
  
}