/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayoperations;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Arrayoperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //array operations
        //finding the sum of elements of an array
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
          sum=sum+A[i];  
        }  
        System.out.println("The sum of all the elements of an array is :"+sum);
        //searching an element in an array
        int search=7;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==search)
            {
                System.out.println("element found at"+i);
            }
        }
        //finding maximum element
        int max=A[0],max1,max2;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        System.out.println("The max. element is :" +max);
        //finding the second largest element
        max1=max2=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
           
              
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        System.out.println("The second largest element is :" +max2);
    }
    
    
}
