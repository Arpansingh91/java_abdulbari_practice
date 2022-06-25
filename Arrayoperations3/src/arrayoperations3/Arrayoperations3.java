/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayoperations3;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Arrayoperations3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //copying an array
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int B[]=new int[10];
        
        //reverse copying an array
        for(int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }
        for(int x:B)
        {
            System.out.print(x+" ,");
        }
        
    }
    
}
