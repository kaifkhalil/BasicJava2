
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
public class CtoF {
public static void main(String[] args){
    
    
  Scanner i = new Scanner(System.in);
  double C,F;
  System.out.println("Enter Celcius : ");
  C = i.nextDouble();
  F = (C*9/5)+32;
  System.out.println("Fahrenheit is : "+F);
  
}    
}
