package code;

public class TwoDArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    final double STARTRATE = 10;
    final int NRATES = 6;
    final int NYEARS = 10;
    double[] interestrates = new double[NRATES];
    for (int j = 0; j < interestrates.length; j++) {
      interestrates[j] = (STARTRATE + j) / 100.0;
    }
    double[][] balance = new double[NYEARS][NRATES];
    for (int i = 0; i < balance[0].length; i++) {
      balance[0][i] = 1000;
    }
    for (int i = 1; i < balance.length; i++) {
      for (int j = 0; j < balance[i].length; j++) {
        double oldbalance = balance[i - 1][j];
        double interest = oldbalance * interestrates[j];
        balance[i][j] = oldbalance + interest;

      }
    }
    for (double[] row : balance) {
      for (double b : row) {
        System.out.printf("%10.2f", b);
      }
      System.out.println();
    }
    
    
    
    
    
    
  }

}
