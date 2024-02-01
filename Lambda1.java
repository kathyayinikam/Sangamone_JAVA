/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In.sode.test;

import java.io.File;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Lambda1 {
  

	public static void main(String[]ags) throws FileNotFoundException{
		File f1= new File("words");
		ArrayList<String>list1=new ArrayList<>();
		ArrayList<String>list2=new ArrayList<>();
		Scanner sc= new Scanner(f1);
		while(sc.hasNext()) {
			list1.add(sc.nextLine());
		}
		System.out.println(list1);
		list2=(ArrayList<String>) list1.stream().filter(w -> w.startsWith("C")).collect(Collectors.toList());
		System.out.println(list2);
	}
}


