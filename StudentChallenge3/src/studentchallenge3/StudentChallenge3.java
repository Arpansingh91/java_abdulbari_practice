/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentchallenge3;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class StudentChallenge3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //display name of a day based on number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day number: ");
        int day=sc.nextInt();
        if(day==1)
        {
            System.out.println("MONDAY");
        }
        else if(day==2)
        {
            System.out.println("TUESDAY");
        }
        else if(day==3)
        {
            System.out.println("WEDNESDAY");
        }
        else if(day==4)
        {
            System.out.println("THURSDAY");
        }
        else if(day==5)
        {
            System.out.println("FRIDAY");
         
        }
        else if(day==6)
        {
            System.out.println("SATURDAY");
        }
                else
        {
            System.out.println("SUNDAY");
        }
           
    }
    
}
