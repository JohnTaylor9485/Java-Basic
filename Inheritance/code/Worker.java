package code;

import java.time.LocalDate;
import java.util.Objects;

public class Worker extends Person {

  public Worker(String name, double salary, int year, int month, int day) {
    super(name);
    this.salary = salary;
    hireDay = LocalDate.of(year, month, day);
    // TODO Auto-generated constructor stub
  }

  private double salary;
  private LocalDate hireDay;

  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return String.format("this employee salary is $%2f", salary);
  }

  public double getSalary() {
    return salary;
  }

  public LocalDate getHiredate() {
    return hireDay;
  }

  public void raisesalary(double percent) {
    double raise = this.salary * percent / 100;
    this.salary += raise;
    
  }
  
  public boolean equals(Object obj) {
    if(this==obj)
      return true;
    if (obj==null)
      return false;
    if(getClass()!=obj.getClass())
      return false;
    Worker other=(Worker)obj;
    return Objects.equals(this.getname(), other.getname())&&this.salary==other.salary&&Objects.equals(hireDay, other.hireDay);
  }
  
  public int hash() {
    return Objects.hash(this.getname(),salary,hireDay);
  }
}
