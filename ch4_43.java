
import java.util.Scanner;

public class ch4_43 {
 public static void main(String[] args) {
  int x1, x2;
  Scanner scanner = new Scanner(System.in);

  System.out.println(" Please input two interger : ");
  x1 = scanner.nextInt();
  x2 = scanner.nextInt();

  System.out.println(" the first integer is: " + x1);
  System.out.println(" the first integer is: " + x2);
  System.out.println(" the total is  :" + (x1 + x2));
 }

}