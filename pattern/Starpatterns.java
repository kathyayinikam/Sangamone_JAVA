package pattern;
import java.util.Scanner;
public class Starpatterns {
	public static void main(String[]args) {
		System.out.println("Enter the number of rows");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		System.out.println();
		//parallelogram
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println();
		//hollow parallelogram
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
                if(j==1||j==n||i==1||i==n) {
					
					System.out.print("*");
				}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();	
		}
		System.out.println();
		//diamond
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Hollow diamond
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//butterfly
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");	
			}
			for(int j=1;j<=(2*(n-i));j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");	
			}
			for(int j=1;j<=(2*(n-i));j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//hollow butterfly
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
				System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=1;j<=(2*(n-i));j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("*");	
					}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}
		for(int i=n;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("*");	
					}
					else {
						System.out.print(" ");
					}	
			}
			for(int j=1;j<=(2*(n-i));j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("*");	
					}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}
}
