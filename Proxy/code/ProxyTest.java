package code;

public class ProxyTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   TransformerProxy john = new TransformerProxy();
   Robot r = john.getProxy();
   System.out.println(r.fire("AK47"));
  }

}
