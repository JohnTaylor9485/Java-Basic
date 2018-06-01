package code;

import java.io.Console;

public class inputpassword {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  Console cons=System.console();
  //String usrname=cons.readLine();
  char[] pswd=cons.readPassword("password:");
  //System.out.println(pswd.toString());
  }

}
