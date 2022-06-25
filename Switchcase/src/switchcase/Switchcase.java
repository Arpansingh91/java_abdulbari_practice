
package switchcase;

import java.util.Scanner;

public class Switchcase {

    
    public static void main(String[] args) {
        // switch case
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int d=sc.nextInt();
        switch(d)
        {
            case 1: System.out.println("ONE");
                    break;
            case 2: System.out.println("TWO");
                    break;
            case 3: System.out.println("THREE");
                    break;
           default: System.out.println("Invalid");
        }
    }
    
}
