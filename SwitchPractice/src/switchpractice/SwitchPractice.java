/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchpractice;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class SwitchPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //diaplay name of a day baesd on number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day no");
        int d=sc.nextInt();
        switch(d)
        {
            case 1: System.out.println("MONDAY");
            break;
            case 2: System.out.println("TUESDAY");
            break;
            case 3: System.out.println("WEDNESDAY");
            break;
            case 4: System.out.println("THURSDAY");
            break;
            case 5: System.out.println("FRIDAY");
            break;
            case 6: System.out.println("SATURDAY");
            break;
            case 7: System.out.println("SUNDAY");
            break;
            default: System.out.println("Invalid day");
            
        }
        
        
        
        
        
    }
    
}
