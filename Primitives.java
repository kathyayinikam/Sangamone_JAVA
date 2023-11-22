
package in.sode;
import java.math.BigInteger;
import java.math.BigDecimal; 

public class Primitives {
    public static void main(String[] args) {
        byte b1=4,b2=1;
        System.out.println("Byte");
        for(int i=0;i<10;i++){
            b2=(byte)(b2*b1);
            System.out.println(b2); 
        }
        System.out.println("");
        short s1=4,s2=1;
        System.out.println("Short");
        for(int i=0;i<10;i++){
            s2=(short)(s2*s1);
            System.out.println(s2);
        }
         System.out.println("");
        int i1=4,i2=1;
        System.out.println("Int");
        for(int i=0;i<20;i++){
            i2=i2*i1;
            System.out.println(i2);
        }
         System.out.println("");
        long l1=4,l2=1;
        for(int i=0;i<40;i++){
            l2=l2*l1;
            System.out.println(l2);
        }
         System.out.println("");
        int bb1=4,bb2=1;
        System.out.println("Big Integer");
        BigInteger A=BigInteger.valueOf(bb1);
        BigInteger B=BigInteger.valueOf(bb2);
        for(int i=0;i<400;i++){
            B=B.multiply(A);
            System.out.println(B);
        }
         System.out.println("");
        int bd1=4,bd2=1;
        System.out.println("BigDecimal");
        BigDecimal BD1=new BigDecimal(bd1);
        BigDecimal BD2=new BigDecimal(bd2);
        for(int i=0;i<900;i++){
            BD2=BD2.multiply(BD1);
            System.out.println(BD2);
        }
         System.out.println("");
    }  
}
