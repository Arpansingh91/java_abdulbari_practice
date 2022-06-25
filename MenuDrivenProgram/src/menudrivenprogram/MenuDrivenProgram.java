/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menudrivenprogram;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class MenuDrivenProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Menu driven program
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("Enter two Numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sc.nextLine();//this is important due to keyboard buffer******
        System.out.println("Enter option in words: ");
        String s=sc.nextLine();
        switch(s)
        {
            case "ADD":System.out.println("Sum is: "+(n1+n2));
                       break;
            case "SUB":System.out.println("Difference is: "+(n1-n2));
                       break;
            case "MUL":System.out.println("Multiplication is: "+(n1*n2));
                       break;
            case "DIV":System.out.println("Division is: "+(n1/n2));
                       break;
            default:System.out.println("Invalid Option");
            
        }
        
        
    }
    
}
