/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopspalindrome;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class LoopsPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //to check a number is a palindrome or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n=sc.nextInt();
        int m=n;
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(m==rev)
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
        
        
        
        
    }
    
}
