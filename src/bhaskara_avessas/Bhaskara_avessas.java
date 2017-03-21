
import java.util.Scanner;


public class Bhaskara_avessas {


    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double x1, x2, c,s , p, a, b ;
      
         System.out.print("x1: ");
         x1 = leitor.nextDouble();
         System.out.print("x2: ");
         x2= leitor.nextDouble();
         System.out.print("c: ");
         c = leitor.nextDouble();
         
          s = x1 + x2;
          p = x1 * x2;
          a = c/p;
          b= -(a*s);
          
          System.out.println( a+ "a x² + " + b + " x + " + c + " = 0");
          
          
          
         
         
         
        
        
        
        
        
    
    }
    
}
