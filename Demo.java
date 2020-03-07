import java.util.Scanner;

public class Demo {
    
  
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a Decimal Number: ");
     int input = in.nextInt();
     System.out.println("Hexa is :" + Integer.toHexString(input));
     
    }
   
    
}
