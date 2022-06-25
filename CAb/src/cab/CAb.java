/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cab;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class CAb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of test cases :");
        int n=sc.nextInt();
        int r1,r2;
        System.out.println("Enter the rates of cab");
        for(int i=0;i<=n;i++)
        {
            
            r1=sc.nextInt();
            r2=sc.nextInt();
            
            if(r1>r2)
            {
                System.out.println("FIRST");
            }
            else if(r2>r1)
            {
                System.out.println("SECOND");
            }
            else
            {
                System.out.println("SAME");
            }
        }
        
    }
    
}
