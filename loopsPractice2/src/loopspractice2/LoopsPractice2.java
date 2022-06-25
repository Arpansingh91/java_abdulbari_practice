/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopspractice2;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class LoopsPractice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //display digits of a number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        while(n>0)
        {
          
            System.out.println(n%10);
            n=n/10;
            
        }
        
    }
    
}
