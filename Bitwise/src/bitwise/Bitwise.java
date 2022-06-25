
package bitwise;

public class Bitwise {

   
    public static void main(String[] args) {
        int x=10,y=6,z,a,b,c,d,e;
        z=x&y;//and operator
        a=x|y;//or operator
        b=x<<1;//left shift operator
        c=x>>1;//right shift operator
        d=x>>>1;//unsigned right shift operator
        e=~x;//not operator
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(y)));
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
        System.out.println(String.format("%s",Integer.toBinaryString(a)));
        System.out.println(String.format("%s",Integer.toBinaryString(b)));
        System.out.println(String.format("%s",Integer.toBinaryString(c)));
        System.out.println(String.format("%s",Integer.toBinaryString(d)));
        System.out.println(String.format("%s",Integer.toBinaryString(e)));
        
       




    }
    
}
