package pattern;

import java.util.Scanner;

public class Numberpattern {
	public static void main(String[]args) {
		System.out.println("Enter the number of rows");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		
		System.out.println("Right number pyramid");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" " );
			}
			System.out.println(" ");
		}
System.out.println();
		
		System.out.println("Number pyramid");
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" " );
			}
			System.out.println(" ");
		}
		System.out.println();
		
		System.out.println("Palindromic number pyramid");
		//palindromic pyramid
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//first half
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
