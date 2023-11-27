
package in.sode;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;
public class Credit_card {
    public static void main(String[]args) throws FileNotFoundException, IOException{
        File f1=new File("info.txt");
        File f2=new File("city1.txt");
        FileWriter fw1=new FileWriter(f2);
        File f3=new File("city2.txt");
         FileWriter fw2=new FileWriter(f3);
        Scanner sc=new Scanner(f1);
       String s;
        while(sc.hasNextLine()){
            s=sc.nextLine();
          int  len=s.length();
            for(int i=0;i<len;i++){
                if(i%2==0){
                    fw1.write(s.substring(i,i+1));
                }
                else{
                    fw2.write(s.substring(i,i+1));
                }
            }
             fw1.write("\n");
         fw2.write("\n");
        }
        fw1.close();
                fw2.close();
              
    }
}
