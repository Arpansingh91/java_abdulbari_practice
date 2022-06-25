/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraypractice;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Arraypractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //array practice
        int A[]=new int[5];
        int B[]={1,2,3,4,5};
        B[3]=15;
        B[2]=14;
        
        System.out.println("The Array is : ");
        for(int x:B)//for each loop
        {
            System.out.println(x);
        }
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
        System.out.println(B.length);
    }
    
}
