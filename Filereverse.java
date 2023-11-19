
package filereverse;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
public class Filereverse {

   
    public static void main(String[] args) throws FileNotFoundException, IOException{
       File f1=new File("names.txt");
       File f2=new File("names_rev.txt");
       FileWriter fw1=new FileWriter(f2);
       ArrayList<String>list1=new ArrayList<>();
       ArrayList<String>list2=new ArrayList<>();
       Scanner sc=new Scanner(f1);
       String s1;
        String s2 =" ";
        String s3=" ";
       while(sc.hasNext()){
           s1=sc.nextLine();
           int len=s1.length();
          for(int i=0;i<len;i++){
              list1.add(s1.substring(i,i+1));
          }
          for(int j=len;j>0;j--){
              list2.add(s1.substring(j-1,j));
          } 
          for(int k=0;k<len;k++){
             
              s2=s2+list1.get(k);
              s3=s3+list2.get(k);
          }
           fw1.write(s3+"\n");
           System.out.println(s2);
           System.out.println(s3);
               
           s2=" ";
           s3=" ";
           list1.clear();
           list2.clear();
           
       }
       fw1.close();
    }
    
}
