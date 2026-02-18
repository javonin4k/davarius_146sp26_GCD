
import java.util.Scanner;

/**
 *
 * @author davariusjavon
 */
public class GCDApp {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int b = input.nextInt();
        
        int result = gcd(a, b);
        
        System.out.println("The greatest common divisor is: " + result);
    }
    
    public static int gcd(int a, int b) {
        
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        
        return a;
        
    } // end method main
    
} // end class GCDApp
