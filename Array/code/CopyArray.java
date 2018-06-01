package code;

import java.util.Arrays;

public class CopyArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] a = new int[100];
    for (int i=0;i<100;i++) {
      a[i] = 1;
    }
    int[] b = Arrays.copyOf(a, 150);
    //不足的位置将自动补零，超过将只拷贝范围内
    for (int x : b) {
      System.out.println(x);
    }
  }

}
