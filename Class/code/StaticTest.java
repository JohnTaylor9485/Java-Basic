package code;

public class StaticTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Employee[] staff = new Employee[3];
    staff[0] = new Employee("Jack", 2000);
    staff[1] = new Employee("Luke", 4000);
    staff[2] = new Employee("John", 6000);
    for (Employee e : staff) {
      e.setId();
      System.out.println("name:" + e.getName() + " id:" + e.getId() + " salary:" + e.getSalary());
      ;
    }
    int n = Employee.getNextId();
    System.out.println("the next id is:" + n);
  }

}
