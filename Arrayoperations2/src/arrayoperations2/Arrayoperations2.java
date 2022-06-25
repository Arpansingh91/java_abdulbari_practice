/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayoperations2;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Arrayoperations2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //rotation of an array
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int t=A[0];
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[(A.length)-1]=t;
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+", ");
        }
        //inserting an element in an array
        int B[]=new int[10];
        B[0]=5;
        B[1]=9;
        B[2]=6;
        B[3]=10;
        B[4]=12;
        B[5]=7;
        for(int i=5;i>1;i--)
        {
            B[i+1]=B[i];
        }
        B[2]=15;
        System.out.println("   ");
        for(int x:B)
        {
            System.out.print(x+", ");
        }
        
        
    }
    
}
