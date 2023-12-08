
package in.sode;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import in.sode.Greet;
public class Test {
       
      public static void main(String[]args) throws IOException{
        File f1=new File("greet2.txt");
        Scanner sc=new Scanner(f1);
         Greet greet=new Greet();
        while(sc.hasNextLine()){
            String s3=sc.nextLine();
                try{
       if (s3.equals("")){
             System.out.println(greet.greet());
       }
       else{
        String s2[]=s3.split(",");
       int len=s2.length;
        String part1=s2[0],part2=s2[1];
         if(s2[1].equals(" ")){
            System.out.println( greet.greet(part1));
        }
        else if(len>1){
            System.out.println(greet.greet(part1,part2));    
        }
        else{
            System.out.println("Invalid");
        }
       }
      } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }    
}
      }
}
