/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentchallenge2;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class StudentChallenge2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //find radix of a number given in a string
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number of your choice: ");
       String str=sc.nextLine();
        
        if(str.matches("[01]+"))
        {
            System.out.println("Binary radix=2");
        }
        else if(str.matches("[0-7]+"))
        {
            System.out.println("Octal radix=8");
        }
        else if(str.matches("[0-9A-F]+"))
        {
            System.out.println("Hexadecimal radix=16");
        }
        else if(str.matches("[0-9]+"))
        {
            System.out.println("Decimal radix=10");
        }
            else
        {
            System.out.println("Not a number");
        }
            
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
