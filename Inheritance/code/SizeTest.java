package code;

import java.util.Scanner;

public class SizeTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
 Scanner in=new Scanner(System.in);
 System.out.println("please input a size");
 String input =in.next().toUpperCase();
 Size size =Enum.valueOf(Size.class, input);
 System.out.println("Size: "+ size);
 System.out.println("abs: "+size.getabs());
 if(size==Size.EXTRA_LARGE)
   System.out.println("Matched!");
  }

}
