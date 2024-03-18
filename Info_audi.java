
package In.sode.test;

import java.util.ArrayList;
import java.util.Scanner;
public class Info_audi {
    	public static void main(String[] args) throws Exception{
		ArrayList <Integer>cols=new ArrayList<>();
		ArrayList <String>rows=new ArrayList<>();
		int row1,row2,countR;
		countR=100;
		char c1,c2,c3;
                int count=-1;
		double temp1;
                      Scanner sc=new Scanner(System.in);
	           System.out.println("Enter the number of rows");
                   int row=sc.nextInt();
                      System.out.println("Enter the number of columns");
                   int col=sc.nextInt();
			
		for (int i=1;i<col+1;i++) {
			cols.add(i);
		}
		for(int i=0;i<26;i++) {
                    
                        c1=(char)(65+i);
	rows.add(String.valueOf(c1));
                }
                    for(int j=0;j<(row-26);j++){
                        if(j%26==0){
                            count++;
                              
                        }
                        if(count>=26){
                            count=count%26;
                        }
                      if(j>=26){
                         c2=(char)(65+(j%26));
                                   c3=(char)(65+count);
	rows.add(String.valueOf(c3)+String.valueOf(c2));
                      }
                      else{
                          c2=(char)(65+j);
                                   c3=(char)(65+count);
	rows.add(String.valueOf(c3)+String.valueOf(c2));
                      }  
                    }	
                int len1=cols.size();
                int len2=rows.size();
                System.out.println(cols);
                System.out.println(rows);
                System.out.println("Number of rows="+len2);
                System.out.println("Number of columns"+len1);
                System.out.println("Number of people"+   "  "+len1*len2);
        }
}

	
    

