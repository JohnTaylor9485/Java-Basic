package code;

import java.util.Scanner;

public class LotteryOdds {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("input the times you have to choose");
    int count = sc.nextInt();
    System.out.println("input the max number you can choose");
    int max = sc.nextInt();
    int chance = 1;
    for (int i = 1; i <= count; i++) {
      chance = chance * (max - i + 1) / i;
    }
    System.out.println("you are the 1 from "+ chance);
  }

}
