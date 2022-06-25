/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentchallenge1.pkg2;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class StudentChallenge12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //find a person is young or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of a person: ");
        int a=sc.nextInt();
        
        if(a<=55&&a>=14)
        {
            System.out.println("The person is Young");
        }
        else
        {
            System.out.println("The person is not Young");
        }
        
        
        
    }
    
}
