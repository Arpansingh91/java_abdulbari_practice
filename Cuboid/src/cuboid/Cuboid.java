/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuboid;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Cuboid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter length,breadth and height:  ");
       int l=sc.nextInt();
       int b=sc.nextInt();
       int h=sc.nextInt();
       int area=((l*b)+(b*h)+(l*h))*2;
       int volume=l*b*h;
       System.out.println("The total area of a cuboid is: " +area);
        System.out.println("The volume is: "+volume);
    }
    
}
