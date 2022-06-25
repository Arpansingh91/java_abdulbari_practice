/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops.findingfactorial;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class LoopsFindingFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //find factorial of n numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac=fac*i;
        }
        System.out.println("The factorial of " +n+ " is " +fac);
    }
    
}
