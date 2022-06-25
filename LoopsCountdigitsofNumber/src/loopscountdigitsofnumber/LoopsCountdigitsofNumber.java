/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopscountdigitsofnumber;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class LoopsCountdigitsofNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //program to count the digits of a number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        int count=0;
        while(n>0)
        {
          n=n/10;  
          count++;
        }
        System.out.println("The no of digits are: "+ count);
    }
    
}
