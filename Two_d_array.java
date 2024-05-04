package arrays;
import java.util.Scanner;
public class Two_d_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr1=new int[2][2];
		int[][] arr2=new int[2][2];
		System.out.println("Enter the elements of 1st array");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of 2nd array");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr1[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println();
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
