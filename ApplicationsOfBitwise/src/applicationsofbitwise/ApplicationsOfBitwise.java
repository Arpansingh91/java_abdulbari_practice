/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package applicationsofbitwise;


/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class ApplicationsOfBitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Masking and Merging
        byte x=9,y=12;
        byte c;
        c=(byte)(c|x);
        c=(byte)(y<<4);
        System.out.println((c&0b00001111)>>4);
        
        
        
        
        
        
        
        
        
    }
    
}
