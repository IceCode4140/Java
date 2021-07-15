
import java.util.Scanner;
public class ch5_16 {
 public static void main(String[] args) {
  int fruit;
  int amount;
  Scanner scanner = new Scanner(System.in);
  System.out.println(" Fruit Sales");
  System.out.println("1.peach (JPY500/pc)  2.melon(JPY1000/pc) 3.strawberry(JPY450/package)  ");
  System.out.println("Please enter the number ");
  fruit = scanner.nextInt();
  System.out.println("Please enter the amount: ");
  amount = scanner.nextInt();

    switch (fruit)
    {
       case 1 :
           System.out.println("Total price: " + (amount * 500));
           break;
       case 2 :
           System.out.println("Total price: " + (amount * 1000));
           break;
       case 3 :
           System.out.println("Total price: " + (amount * 450));
           break;
       default :
           System.out.println(" Error ,please enter the number again." );
    }
 }

}