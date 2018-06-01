package code;

import java.util.Date;

public class outputtest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   
   String message=String.format("Hello!,%s. You are %d years old", "John",13);
   System.out.println(message);
   System.out.printf("%1$s,%2$tB,%2$te,%2$tY","the date is: ",new Date());
  }

}
