package code;

public class Transform implements Robot{

  @Override
  public String fire(String gun) {
    // TODO Auto-generated method stub
    return gun + " is on fire!";  }

  @Override
  public String move(String des) {
    // TODO Auto-generated method stub
    return "reach to" + des;
  }

}
