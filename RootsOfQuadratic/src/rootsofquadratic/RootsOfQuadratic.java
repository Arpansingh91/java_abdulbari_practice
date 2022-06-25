/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package rootsofquadratic;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class RootsOfQuadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coeffiecients a,b and c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double r1=(-b+ Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double r2=(-b- Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("Roots are: "+r1+" "+r2);
        
    }
    
}
