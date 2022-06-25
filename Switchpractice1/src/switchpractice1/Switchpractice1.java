/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchpractice1;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Switchpractice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // display name of a month based on number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month no: ");
        int m=sc.nextInt();
        switch(m)
        {
            case 1: System.out.println("JANUARY");
            break;
            case 2: System.out.println("FEBRUARY");
            break;
            case 3: System.out.println("MARCH");
            break;
            case 4: System.out.println("APRIL");
            break;
            case 5: System.out.println("MAY");
            break;
            case 6: System.out.println("JUNE");
            break;
            case 7: System.out.println("JULY");
            break;
            case 8: System.out.println("AUGUST");
            break;
            case 9: System.out.println("SEPTEMBER");
            break;
            case 10: System.out.println("OCTOBER");
            break;
            case 11: System.out.println("NOVEMBER");
            break;
            case 12: System.out.println("DECEMBER");
            break;
            default: System.out.println("INVALID MONTH");
        }
        
        
        
        
        
        
        
    }
    
}
