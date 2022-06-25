/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package incdec;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class IncDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5,y=2,z=3;
        int a=y*x++  +  y*++z;
        int b=z*x++  +  z*++x;
        float f=12.6f;
        f++;
        char c='A';
        c++;
        byte b1=2;
        b1++;
        
        System.out.println(a+" "+b+ " "+f+ " "+c+ " "+b1);
    }
    
}
