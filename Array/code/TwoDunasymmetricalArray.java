package code;

public class TwoDunasymmetricalArray {
  public static void main(String[] args) {
    final int NMAX = 10;
    int[][] odds = new int[NMAX + 1][];
    for (int i = 0; i <= NMAX; i++) {
      odds[i] = new int[i + 1];
    }
    for (int n = 0; n < odds.length; n++) {
      for (int m = 0; m < odds[n].length; m++) {
        int lodds = 1;
        for (int p = 1; p <= m; p++) {
          lodds = lodds * (n - p + 1) / p;
        }
        odds[n][m] = lodds;
      }
    }
    for (int[] rows : odds) {
      for (int i : rows) {
        System.out.printf("%4d", i);
      }
      System.out.println();
    }
  }
}
