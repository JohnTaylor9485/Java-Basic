package code;

import java.util.ArrayList;

public class ObjectAnaylzerTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   ArrayList<Integer> squares = new ArrayList<>();
   for(int i = 1; i <= 5;i++)
     squares.add(i*i);
   Employee e= new Employee("john", 2000);
   System.out.println(new ObjectAnalyzer().toString(e));
  }

}
