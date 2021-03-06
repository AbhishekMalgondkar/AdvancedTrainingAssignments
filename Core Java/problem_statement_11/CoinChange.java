package problem_statement_11;

import java.util.*;

public class CoinChange {
  public static void main(String[] args) {

    int V = 2045;
    ArrayList < Integer > ans = new ArrayList < > ();
    int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
    int n = coins.length;
    for (int i = n - 1; i >= 0; i--) {
      while (V >= coins[i]) {
        V -= coins[i];
        ans.add(coins[i]);
      }
    }
    System.out.println("The minimum number of coins is "+ans.size());
    System.out.println("The coins are ");
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(" " + ans.get(i));
    }

  }
}