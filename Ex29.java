import java.util.*;

public class Ex29 {
 public static void main(String args[]) {
  Scanner keyin = new Scanner(System.in);
  int maxNum, val1, val2, val3;

  System.out.printf("請 東方 擲骰子 (按 Enter 鍵) =>");
  keyin.nextLine();
  val1 = game();
  System.out.printf("東方擲的是: %d /n", val1);

  System.out.printf("請 南方 擲骰子 (按 Enter 鍵) =>");
  keyin.nextLine();
  val2 = game();
  System.out.printf("南方擲的是: %d /n", val2);

  System.out.printf("請 西方 擲骰子 (按 Enter 鍵) =>");
  keyin.nextLine();
  val3 = game();
  System.out.printf("西方擲的是: %d /n", val3);

  System.out.printf("請 北方 擲骰子 (按 Enter 鍵) =>");
  keyin.nextLine();
  val4 = game();
  System.out.printf("北方擲的是: %d /n", val4);

  maxNum = max(val1, max(val2, max(val3, val4)));
  System.out.printf("擲出最大的是 = : %d /n", maxNum);

 }

 static int game() {
  Random random = new Random();
  int sum = 0, ran;
  System.out.printf("擲出 =>");
  for (int i = 0; i <= 3; ++i) {
   ran = 1 + random.nextInt(6);
   System.out.printf("%d", ran);
   sum += ran;
  }
  return sum;
 }

 static int max(int a, int b) {
  if (a > b)
   return a;
  else
   return b;
 }
}
