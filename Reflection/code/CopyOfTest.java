package code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfTest {
  public static Object goodCopyOf(Object a, int newl) {
    Class cl = a.getClass();
    if (!cl.isArray())
      return null;
    Class componentType = cl.getComponentType();
    int length = Array.getLength(a);
    Object newArray = Array.newInstance(componentType, newl);
    System.arraycopy(a, 0, newArray, 0, Math.min(length, newl));
    return newArray;
  }

  public static Object badCopyOf(Object[] a, int newl) {
    Object newArray = new Object[newl];
    System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newl));
    return newArray;
    
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] a = { 1, 2, 3, 4 };
    a = (int[]) goodCopyOf(a, 10);
    System.out.println(Arrays.toString(a));

    String[] b = { "Tom", "Dick", "Harry" };
    b = (String[]) goodCopyOf(b, 10);
    System.out.println(Arrays.toString(b));
  }

}
