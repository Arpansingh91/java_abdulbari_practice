/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenomethod;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Primenomethod {

    static boolean isPrime(int n)
    {
        for(int i=n/2;i>1;i--)
        {
            if(n%i==0)
            {
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        boolean c=isPrime(a);
        System.out.println(c);
       
        
        
    }
    
}
