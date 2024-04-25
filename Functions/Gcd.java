package Functions;
import java.util.Scanner;
public class Gcd {
public static void main(String[]args) {
	System.out.println("Enter two numbers");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int gcd=gcd(a,b);
	System.out.println("The gcd of two numbres is"+gcd);
}

public static int gcd(int a, int b) {
	if(b==0) {
		return a;
	}
	else {
		return(gcd(b,a%b));
	}
	
}
}
