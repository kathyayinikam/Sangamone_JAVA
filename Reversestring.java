
package reversestring;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Reversestring {

    public static String rev(String st1){
		String s1=st1;
		String s2=" ";
		List<String> sa1=new ArrayList<String>();
		List<String>revlist=new ArrayList<String>();
		int len=s1.length();
		for(int i=0;i<len;i++) {
			sa1.add(s1.substring(i,i+1));
		}
		for(int j=len-1;j>=0;j--) {
			revlist.add(sa1.get(j));
		}
		for(int k=0;k<len;k++) {
			s2=s2+revlist.get(k);	
		}
		return s2;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		System.out.println("The reversed string is"+rev(s1));
      
    }
    
}

