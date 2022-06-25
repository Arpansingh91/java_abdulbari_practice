/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcasepractice1;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Switchcasepractice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //to display number in words
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:System.out.println("ONE");
            break;
            case 2: System.out.println("TWO");
            break;
            case 3: System.out.println("THREE");
            break;
            case 4: System.out.println("FOUR");
            break;
            case 5: System.out.println("FIVE");
            break;
            case 6:System.out.println("SIX");
            break;
            case 7:System.out.println("SEVEN");
            break;
            case 8:System.out.println("EIGHT");
            break;
            case 9:System.out.println("NINE");
            break;
            default:System.out.println("INVALID NO");
                    
        }
      
    }
    
}
