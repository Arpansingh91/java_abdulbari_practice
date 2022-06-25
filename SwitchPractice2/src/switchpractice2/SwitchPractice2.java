/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchpractice2;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class SwitchPractice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //display type of website
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any domain");
        String domain=sc.nextLine();
        String ext=domain.substring(domain.indexOf(".")+1);
        
        switch(ext)
        {
            case "com":System.out.println("Commercial Website");
                       break;
            case "org":System.out.println("Organisational Website");
                       break;
            case "net":System.out.println("Networking Website");
                       break;
            case "gov":System.out.println("Government Website");
                       break;
            default:System.out.println("Invalid Website");
        }
        
        
        
    }
    
}
