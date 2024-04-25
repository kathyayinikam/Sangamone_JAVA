package Functions;
import java.util.Scanner;
import java.util.*;
public class Numbers {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	int ch=1;
	ArrayList<Integer>list1=new ArrayList<>();
	int pos=0,neg=0,ze=0;
		do {
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		list1.add(num);
		System.out.println("Enter your choice ");
		ch=sc.nextInt();
	}while(ch==1);
		System.out.println(list1);
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)>0) {
				pos++;
			}
			else if(list1.get(i)==0) {
				ze++;
			}
			else {
				neg++;
			}
		}
		System.out.println("The number of positive numbers="+pos+"The number of negetive="+neg+"The number of zeros="+ze);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(Math.pow(a,b));
	}
}
