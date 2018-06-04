package code;

public class Employee {
  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
    this.id = 0;
  }

  private String name;
  private double salary;
  private int id;
  private static int nextid;

  public static int getNextId() {
    return nextid;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public int getId() {
    return id;
  }

  public void setId() {
    this.id = nextid;
    nextid++;
  }

}
