/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formatspecifiers;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Formatspecifiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        int a=-10;
        float b=12.45f;
        String str="Hello";
        
        
        System.out.printf("%2$f %3$s %1$d",a,b,str);
    }
    
}
