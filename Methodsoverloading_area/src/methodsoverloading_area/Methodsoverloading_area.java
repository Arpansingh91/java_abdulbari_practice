/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsoverloading_area;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Methodsoverloading_area {

    static double area(double l,double b)
    {
        double A=l*b;
        return A;
    }
    static double area(double radius)
    {
        double a=Math.PI*radius*radius;
        return a;
    }
    static double area(double s,double l,double h)
    {
        double Aa=((s+l)/2)*h;
        return Aa;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions :");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        System.out.println(area(x,y,z));
        
        
        
    }
    
}
