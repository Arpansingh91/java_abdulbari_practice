/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaofatriangle;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Areaofatriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float s=(a+b+c)/2;
        float r,l,t;
        
       double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("The Arae of the Triangle is: "+area);
    
    
    
    }
    
    
}
