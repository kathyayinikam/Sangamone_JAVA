
package triad;
import java.util.*;
import java.util.ArrayList;
public class Triad {
    public static List<Integer> triad(){  
     ArrayList<Integer>list1=new ArrayList<Integer>();
     ArrayList<Integer>list2=new ArrayList<Integer>();
     ArrayList<Integer>list3=new ArrayList<Integer>();
     for(int j=3;j<17;j++){
         list1.add(j);
     }
     int count=0;
     for(int l=3;l<50;l++){
         list2.add(l);
     }
     for(int k=0;k<list1.size();k++){
     for(int i=0;i<list2.size(); i++){
         int a=list1.get(k);
         int b=list2.get(i);
         double d=Math.sqrt((a*a)+(b*b));
          if(d==(int)d){
               list3.add(a);
               list3.add(b);
               list3.add((int)d);
                   count++; 
           } 
     }
        }
      return list3;
    }
    public static void main(String[] args) {
       int size=(triad().size());
       for(int n=0;n<size;n++){
            System.out.println("Square of("+triad().get(n)+")+Square of("+triad().get(n+1)+")=Square("+triad().get(n+2)+")-  So("+triad().get(n)+","+triad().get(n+1)+","+triad().get(n+2)+")is a triad");
            n=n+2;
            System.out.println("");
       }
    }
    
}
