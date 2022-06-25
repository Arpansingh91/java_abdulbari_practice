/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regularexpressions;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class RegularExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1="4";
        String str4="a7";
        String str2="ABC";
        String str3="q";
        System.out.println(str1.matches("."));
        System.out.println(str1.matches("[abc]"));
        System.out.println(str1.matches("[^abc]"));
        System.out.println(str3.matches("[^abc]"));
        System.out.println(str2.matches("ABC"));
        System.out.println(str4.matches("[a-z][0-9]"));
        System.out.println(str3.matches("[a-z1-7]"));
        System.out.println(str1.matches("\\D"));
        
        
    }
    
}
