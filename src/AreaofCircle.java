
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaif
 */
public class AreaofCircle {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double r,a,pi=3.1416;
        System.out.println("Enter Radius : ");
        r = input.nextDouble();
        a = r*r*pi;
        System.out.printf("Area of Circle is : %.2f",a);
    }
    
}
