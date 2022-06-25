/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentchallenge1.pkg3;

import java.util.Scanner;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class StudentChallenge13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //find grades for given marks
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks for different subjects m1,m2,and m3");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        float avg=(m1+m2+m3)/3;
        if(avg>=70)
        {
            System.out.println("The grade is A");
        }
      else if(avg>=60&&avg<70)
      {
          System.out.println("The grade is B");
      }
      else if(avg>=50&&avg<60)
      {
          System.out.println("The grade is C");
      }
      else if(avg>=40&&avg<50)
      {
          System.out.println("The grade is D");
      }
      else if (avg<40)
                {
                    System.out.println("Fail");
                }
    
}
}

