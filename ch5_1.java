
import java.util.Scanner;
public class ch5_1 {
 public static void main(String[] args) {
  int age;
  Scanner scanner = new Scanner(System.in);
  System.out.println(" Please enter your age");
  age = scanner.nextInt();
  if (age < 18)
    {
      System.out.println(" cannot apply for driving test. " );
    }
  else
   {
      System.out.println(" can apply for driving test ");
   }
 }

}