/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicestrings;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class PracticeStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        String str1="Java";
        String str2="Java";
        String s=new String("Java");
        char c[]={'A','B','C','D'};//array of character
        byte b[]={65,66,67,68};//array of byte
        String str3=new String(c,2,2);
        String str4=new String(b,1,3);
        //c is the name of the variable first 2 is starting index 
        //and second 2 is the no of letters from starting index
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1==str2);//comparing two strings
        System.out.println(str1==s);
    }
    
}
