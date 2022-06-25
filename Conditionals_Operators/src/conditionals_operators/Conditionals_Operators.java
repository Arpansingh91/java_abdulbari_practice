/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditionals_operators;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Conditionals_Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=100,b=200,c=15;
        System.out.println(a>b);/*operators*/
        System.out.println(b>c);
        System.out.println(a>b&&a>c);
        System.out.println(a>b||b>c);
       //program to find whether a no is positive or neagtive
       
       if(a>0)
       {
           System.out.println("Positive");
       }
       else
       {
           System.out.println("Negative");
       }
       //program to find greatest of three numbers
       if(a>b&&a>c)
       {
           System.out.println(a);
       }
       else if(b>c)
               {
                   System.out.println(b);
               }
               else
       {
           System.out.println(c);
       }
               
                    
       
       
       
       
    }
    
}
