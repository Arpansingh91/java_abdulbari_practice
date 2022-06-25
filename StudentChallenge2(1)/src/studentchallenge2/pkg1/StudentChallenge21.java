/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentchallenge2.pkg1;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class StudentChallenge21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //find a given year is a leap year or not
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year: ");
int y=sc.nextInt();
if(y%4==0)
{
    if(y%100==0)
    {
        if(y%400==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
    else
    {
        System.out.println("Not a leap year");
    }
}
else
{
    System.out.println("Not a leap year");
}
        
        
        
        
        
        
        
        
        
    }
    
}
