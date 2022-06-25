/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops.g.pseries;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class LoopsGPseries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //to display G.P.series
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,r and n");
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        
        for(int i=1;i<=n;i++)
        {
            System.out.print(term+" , ");
            term=term*r;
        }
    }
    
}
