/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentchallenge3.pkg1;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class StudentChallenge31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //find the type of website and the protocol used
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any website");
        String str=sc.nextLine();
        
        if((str.startsWith("http")))
        {
           System.out.println("Hyper Text Transfer Protocol");
        }
         else
        {
            System.out.println("File Tranfer Protocol");
        }
        if(str.endsWith("com"))
        {
            System.out.println("This is a commercial website");
        }
        else if(str.endsWith("org"))
        {
            System.out.println("This is a organiastion website");
        }
        else
        {
            System.out.println("This is a networking website");
        }
    }
    
}
