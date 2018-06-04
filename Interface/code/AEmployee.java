package code;

public class AEmployee implements Comparable<AEmployee> {
  private String name;
  private double salary;

  public AEmployee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }
  

  @Override
  public int compareTo(AEmployee e) {
    // TODO Auto-generated method stub
    return Double.compare(this.salary,e.salary);
  }


  public String getName() {
    return name;
  }


  public double getSalary() {
    return salary;
  }
  
  public void raisesalsry(double coefficient) {
    double raise=this.salary*coefficient/100;
    this.salary+=raise;
  }
}
