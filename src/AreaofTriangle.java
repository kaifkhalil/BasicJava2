
import java.util.Scanner;


/**
 *
 * @author kaif
 */
public class AreaofTriangle {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double base,height,area;
    System.out.println("Enter base : ");
    base = input.nextDouble();
    System.out.println("Enter height : ");
    height = input.nextDouble();
    area = base * height;
    System.out.println("Area of triangle is : "+area);
    
    
}
}
