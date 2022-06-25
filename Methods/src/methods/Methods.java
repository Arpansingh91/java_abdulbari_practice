/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Methods {
 int max(int a,int b)
{
    if(a>b)
        return a;
    else
        return b;
}

    
        public static void main(String[] args) {
        // TODO code application logic here
        
        //practising methods
        int a=15,b=12;
        Methods mp=new Methods();
        
        System.out.println(mp.max(a, b));
       
        
    }
    
}
