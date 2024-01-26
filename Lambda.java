
package In.sode.test;

import java.util.List;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Lambda {
    public static List<String>load_data(String fname) throws FileNotFoundException{
       ArrayList<String>list1=new ArrayList<>(); 
        File f1=new File(fname);
        Scanner sc=new Scanner(f1);
        while(sc.hasNext()){
            list1.add(sc.nextLine());
          
        }
        return list1.stream().filter(name -> name.startsWith("Indian")).collect(Collectors.toList());
    }
    public static void main(String[]args)throws FileNotFoundException{
        List<String>list2=new ArrayList<>();
       
        list2=load_data("univIndia.txt");
        System.out.println(list2);
        
    }
    
}
