package Practiceprojects;
import java.util.ArrayList;
import java.util.*;
public class Perm {
	public static ArrayList perm2(String s) {
		ArrayList<String> list1=new ArrayList<>();
		String s1=s.substring(0,1);
		String s2=s.substring(1,2);
		list1.add(s1+s2);
	    list1.add(s2+s1);
		return list1;
	}
	public static ArrayList perm3(String s) {
		ArrayList<String> list1=new ArrayList<>();
		String s1=s.substring(0,1);
		String s2=s.substring(1,2);
		String s3=s.substring(2,3);
		for(int i=0;i<perm2(s2+s3).size();i++) {
		list1.add(s1+perm2(s2+s3).get(i));
		list1.add(s2+perm2(s1+s3).get(i));
		list1.add(s3+perm2(s2+s1).get(i));
		}
		
		return list1;
		
	}
	public static ArrayList perm4(String s) {
		ArrayList<String> list1=new ArrayList<>();
		String s1=s.substring(0,1);
		String s2=s.substring(1,2);
		String s3=s.substring(2,3);
		String s4=s.substring(3,4);
		for(int i=0;i<perm3(s2+s3+s4).size();i++) {
			list1.add(s1+perm3(s2+s3+s4).get(i));
			list1.add(s2+perm3(s1+s3+s4).get(i));
			list1.add(s3+perm3(s2+s1+s4).get(i));
			list1.add(s4+perm3(s2+s3+s1).get(i));
		}
		
		return list1;
	}
	public static ArrayList perm5(String s) {
		ArrayList<String> list1=new ArrayList<>();
		String s1=s.substring(0,1);
		String s2=s.substring(1,2);
		String s3=s.substring(2,3);
		String s4=s.substring(3,4);
		String s5=s.substring(4,5);
		for(int i=0;i<perm4(s2+s3+s4+s5).size();i++) {
			list1.add(s1+perm4(s2+s3+s4+s5).get(i));
			list1.add(s2+perm4(s1+s3+s4+s5).get(i));
			list1.add(s3+perm4(s2+s1+s4+s5).get(i));
			list1.add(s4+perm4(s2+s3+s1+s5).get(i));
			list1.add(s5+perm4(s2+s3+s1+s4).get(i));
		}
		
		return list1;
	}
	public static ArrayList perm6(String s) {
		ArrayList<String> list1=new ArrayList<>();
		String s1=s.substring(0,1);
		String s2=s.substring(1,2);
		String s3=s.substring(2,3);
		String s4=s.substring(3,4);
		String s5=s.substring(4,5);
		String s6=s.substring(5,6);
		for(int i=0;i<perm5(s2+s3+s4+s5+s6).size();i++) {
			list1.add(s1+perm5(s2+s3+s4+s5+s6).get(i));
			list1.add(s2+perm5(s1+s3+s4+s5+s6).get(i));
			list1.add(s3+perm5(s2+s1+s4+s5+s6).get(i));
			list1.add(s4+perm5(s2+s3+s1+s5+s6).get(i));
			list1.add(s5+perm5(s2+s3+s1+s4+s6).get(i));
			list1.add(s6+perm5(s2+s3+s1+s4+s5).get(i));
		}
		return list1;
	}
	public static void main(String[]args) {
		
		System.out.println("Enter a word");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		if(s.length()==1) {
			System.out.println(s);
		}
		else if(s.length()==2) {
			System.out.println(perm2(s));
			System.out.println(perm2(s).size());
		}
		else if(s.length()==3) {
			System.out.println(perm3(s));
			System.out.println(perm3(s).size());
		}
		else if(s.length()==4) {
			System.out.println(perm4(s));
			System.out.println(perm4(s).size());
		}
		else if(s.length()==4) {
			System.out.println(perm4(s));
			System.out.println(perm4(s).size());
		}
		else if(s.length()==5) {
			System.out.println(perm5(s));
			System.out.println(perm5(s).size());
		}
		else if(s.length()==6) {
			System.out.println(perm6(s));
			System.out.println(perm6(s).size());
		}
		else {
			System.out.println("Enter a word having only 6 letters or less");
		}
		
		
	}

}
