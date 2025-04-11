
package sdet.algorhythms.happynumber;

public class App {
  public Boolean isHappyNumber(int n) {
    n = getNextNumber(n);
    return (n == 1);
  }

  private int getNextNumber(int n) {
    int output = 0;

    while (n > 0) {

      int firstNumber = n % 10;

      output = firstNumber * firstNumber;

      System.out.println(output);

      n = n / 10;
    }

    return output;
  }
}
