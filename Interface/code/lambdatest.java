package code;

import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class lambdatest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] planets=new String[] {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
    System.out.println(Arrays.toString(planets));
    Arrays.sort(planets);
    System.out.println(Arrays.toString(planets));
    Arrays.sort(planets,(a,b) -> a.length()-b.length());
    System.out.println(Arrays.toString(planets));
    Timer t=new Timer(1000,event ->System.out.println("the time is : "+ new Date()));
    t.start();
    JOptionPane.showMessageDialog(null, "quit?");
    System.exit(0);
  }

}
