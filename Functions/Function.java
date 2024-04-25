package Functions;
import java.util.Scanner;
public class Function {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Average\n2.sum of odd numbers\n3.Finding the greater number\n4.Finding the circumference of the circle\n5.Voting eligibility");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter 3 numbers");
			int in1,in2,in3;
			in1=sc.nextInt();
			in2=sc.nextInt();
			in3=sc.nextInt();
		average(in1,in2,in3);
		break;
		case 2:
			System.out.println("Enter the n value");
			int n=sc.nextInt();
			oddsum(n);
		case 3:
			greater();
			break;
		case 4:
			System.out.println("Enter the radius of the circle");
			int r=sc.nextInt();
			circumference(r);
		case 5: voting();
		}
		
			
		
	}
	
	public static void  average(int in1,int in2,int in3) {
		System.out.println ((in1+in2+in3)/3);
	}
	public  static void oddsum(int n) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
	   for(int i=0;i<=n;i++) {
		   if(i%2!=0) {
			   sum=sum+i;
		   }
	   }
	   System.out.println(sum);
		
	}
	public static void greater() {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		int g=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>g) {
				g=a[i];
			}
		}
		System.out.println(g);
	}
	public static void circumference(int r) {
		double circum=2*3.14*r;
		System.out.println(circum);
	}
	public static void voting() {
		System.out.println("Enter the age");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("Sorry you are not eligible to vote");
		}
	}

}
