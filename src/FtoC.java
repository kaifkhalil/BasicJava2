
import java.util.Scanner;
/**
 *
 * @author kaif
 */
public class FtoC {
    public static void main(String[] args){
    
    
  Scanner i = new Scanner(System.in);
  double C,F;
  System.out.println("Enter Fahrenheit : ");
  F = i.nextDouble();
  C = (F-32)*5/9;
  System.out.println("Celcius is : "+C);
  
} 
    
}
