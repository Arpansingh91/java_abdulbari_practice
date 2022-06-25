/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentchallenge;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class StudentChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="programmmer@gmail.com";
        System.out.println("The user name is "+str.substring(0, 11));//display user name
        System.out.println("The domain name is "+str.substring(12));//display domain name
        String str2=str.substring(12);
        System.out.println(str2.startsWith("gmail"));
    }
    
}
