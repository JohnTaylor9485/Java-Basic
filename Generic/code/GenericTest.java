package code;

import java.time.LocalDate;

public class GenericTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    LocalDate[] birthdays = { LocalDate.of(1969, 12, 29), LocalDate.of(1966, 2, 20), LocalDate.of(1995, 3, 22),
        LocalDate.of(1906, 12, 14) };
    Pair<LocalDate> mm = Arrayalg.minmax(birthdays);
    System.out.println("min =" + mm.getFirst());
    System.out.println("max =" + mm.getSecnd());
  }

  static class Arrayalg {
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
      if (a == null || a.length == 0)
        return null;
      T min = a[0];
      T max = a[0];
      for (int i = 1; i < a.length; i++) {
        if (min.compareTo(a[i]) > 0)
          min = a[i];
        if (max.compareTo(a[i]) < 0)
          max = a[i];
      }
      return new Pair<>(min, max);
    }
  }

  public static class Pair<T> {
    private T first;
    private T second;

    public Pair(T f, T s) {
      first = f;
      second = s;
    }

    public T getFirst() {
      return first;
    }

    public T getSecnd() {
      return second;
    }

  }

}
