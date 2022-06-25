/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodspassingobjects;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Methodspassingobjects {
static void change(int A[],int value,int index)
{
    A[index]=value;
}
static void change2(int x,int value)
{
    x=value;
}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int A[]={1,2,3,4,5,6};
        change(A,20,2);
        for(int x:A)
        {
            System.out.print(x+" ");
            System.out.println("");
        }
        int x=10;
        change2(x,2);
        System.out.println("The value of primitive x" +x);
        
    }
    
}
