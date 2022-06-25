/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopsapseries;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class LoopsApseries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //to display A.P. series
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a(first term),d(common difference and n(no of terms)");
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print((a+i*d)+" , ");
        }
        
        
        
    }
    
}
