package code;

import java.util.Arrays;

public class AEmployeeTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  AEmployee[] staff=new AEmployee[3];
  staff[0]=new AEmployee("john", 1000);
  staff[1]=new AEmployee("taylor", 12000);
  staff[2]=new AEmployee("jack", 3000);
  Arrays.sort(staff);
  for(AEmployee e:staff) {
    System.out.println(e.getName());
  }
  
  }

}
