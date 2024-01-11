
package In.sode.test;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Filter {
    public static void main(String[]args){
        ArrayList<Integer>score=new ArrayList<>();
        for(int i=1;i<50;i++){
            score.add(i);
        }
        List<Integer>list1=score.stream().filter(n -> n%2==0).collect(Collectors.toList());
        List<Integer>list2=score.stream().filter(n -> n%2!=0).collect(Collectors.toList());
        System.out.println("The even numbers from 1 to 50 are");
        System.out.println(list1);
        System.out.println("The odd numbers from 1 to 50 are");
        System.out.println(list2);
    }  
}
