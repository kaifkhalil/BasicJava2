
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
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner age = new Scanner(System.in);
        int year;
        System.out.println("Enter a number");
        year = age.nextInt();
        System.out.println("My age is "+year);
       
        String name;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Name ");
        name  = num.nextLine();
      
        System.out.println("My name is "+name);
        
        
    }
    
}
