package code;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="hello";
   String ss=s.substring(0,2);
   String band=String.join("/", s,ss,"test");//用第一个参数作为连接符连接后面的参数
   System.out.println(band);
   
   String a="";
   String b=null;
   System.out.println(a.equals(""));
   //System.out.println(b.equals(""));
   //当字符串为null时这种写法会报空指针
   System.out.println("".equals(a));
   //这种写法是对的
   System.out.println(a!=null&&a.length()!=0);
   //判断一个字符串是否为空，一定要先判断是否为null
   System.out.println(s.charAt(0));//获取某一位的char值
   System.out.println(s.codePointAt(0));//获取某一点的码点值
   System.out.println(s.compareTo("hel"));
   //返回发生差异位置两个char的差，如果是substring，则返回差异的位数
   System.out.println(s.equalsIgnoreCase("HELLO"));//不区分大小写
   System.out.println(s.startsWith("H"));//返回是否以以参数开头
   System.out.println(s.endsWith("o"));//返回是否已参数结尾
   System.out.println(s.indexOf("h",0));
   //返回字符串中第一个匹配参数的位置，不匹配返回-1,不写第二个参数从首端开始
   System.out.println(s.lastIndexOf("h",0));
   //返回字符串中最后一个匹配参数的位置，不匹配返回-1，不写第二个参数从尾端开始
   //System.out.println(s.replace(oldChar, newChar));
   //将字符串中所有oldchar替换成newchar，oldchar和newchar可以是stringbuffer和stringbuilder的对象
   System.out.println(s.trim());//去掉字符串首位的空格
   
	}

}
