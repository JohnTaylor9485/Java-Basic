package code;

public class PersonTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
Person[] people=new Person[2];
people[0]=new Worker("John Taylor",10000,1978,06,12);
people[1]=new Student("Alan Walker","Infomation System");
for(Person p:people) {
  System.out.println(p.getDescription());
}
  }

}
