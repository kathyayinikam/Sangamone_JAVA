
package in.sode.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class K1 {
    public static List<Integer>diff1(String fname1,String fname2) throws FileNotFoundException{
        List<Integer>difflist=new ArrayList<>();
        List<String>list1=new ArrayList<>();
        List<String>list2=new ArrayList<>();
        List<Integer>lines=new ArrayList<>();
        String[]list3;
        String[]list4;
        File f1=new File(fname1);
        File f2=new File(fname2);
        String word1,word2;
        int lineno=0,position=0,count=0,len3=0,lend=0,len4=0,minlen=0;
        Scanner sc1=new Scanner(f1);
        Scanner sc2=new Scanner(f2);
        while(sc1.hasNextLine()){
                String s1= sc1.nextLine();
                String s2=sc2.nextLine();
                if( ! s1.equals(s2)){
                  difflist.add(count);
                  list1.add(s1);
                  list2.add(s2);
                  lines.add(position);
                   count++;
                }
                position++;      
        }
        lend=difflist.size();
     
        for(int j=0;j<lend;j++){
            lineno=difflist.get(j);
        list3=list1.get(j).split(" ");
        list4=list2.get(j).split(" ");
        len3=list3.length;
        len4=list4.length;
        minlen=Math.min(len3,len4);
            System.out.println(minlen);
        for(int i=0;i<minlen;i++){
             word1=list3[i];
        word2=list4[i];
        if(!(word1.equals(word2))){
            System.out.println("Line  "+lines.get(j)+"  Word  "+String.valueOf(i)+"  mismatch  "+word1+" "+word2);
        }   
        }
            
        }
        
         return difflist;
    }
    public static void main(String[] args) throws FileNotFoundException{
            diff1("file1.txt","file2.txt");
        }
    }
    

