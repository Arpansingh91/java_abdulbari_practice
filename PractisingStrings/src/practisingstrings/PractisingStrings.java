/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practisingstrings;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class PractisingStrings {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        String str1="  Welcome  ";
        String str4="WELCOME";
        String str2="WELCOME";
        String str3=new String("www.codeacademy.com");
        System.out.println(str1.length());
        System.out.println(str1.substring(4));
        System.out.println(str1.substring(5,7));
        System.out.println(str1.trim());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.replace('e', 'i'));
        System.out.println(str1.indexOf("el"));
        System.out.println(str2.charAt(4));
        System.out.println(str3.startsWith("www."));
        System.out.println(str1.endsWith(".co"));
        System.out.println(str3.indexOf(".", 4));
        System.out.println(str3.lastIndexOf("."));
        System.out.println(str3.lastIndexOf(".", 14));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str4==str2);
        System.out.println(str4.equals(str2));
        
        
        
        
        
        
        
    }
    
}
