/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopspalindromenumber;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class LoopsPalindromeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //to reverse a number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;       
        }
        System.out.println("The reverse of the number is :" +rev);
        
        
        
    }
    
}
