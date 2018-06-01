package code;

public class StringBuilderTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   StringBuilder sb=new StringBuilder();
   sb.append("hello");
   String str="world";
   sb.append(str);
   String allstr=sb.toString();
   System.out.println(allstr);
   sb.setCharAt(0,'3');//将第一个参数位置的char变为第二个参数的char
   System.out.println(sb.toString());
   sb.insert(1, "instert");
   System.out.println(sb.toString());//在第一个参数位置插入第二个参数的string或char
   sb.delete(1, 8);
   System.out.println(sb.toString()+"abc");//删除两个参数之间的字符,左闭右开
  }

}
