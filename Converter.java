
package in.sode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io. FileNotFoundException;
public class Converter {
    private static String convertToWord(int num) throws FileNotFoundException {
        ArrayList<String>list1= new ArrayList<>();
        File f1=new File("words6.txt");
        Scanner sc=new Scanner(f1);
        while(sc.hasNextLine()){
            String s1=sc.nextLine();
                list1.add(s1);
            }
        String result=list1.get(num-1);
           System.out.println(result);
        return result;
        } 
    public static void main(String[] args)  throws FileNotFoundException{
        System.out.println("This program works only up to 109");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        if (num1 <= 20) {
            String result = convertToWord(num1);
            System.out.println(result);
        } else if (20 < num1 && num1 < 30) {
            int units = num1 % 10;
            int tens = num1 / 10;
            String word1 = convertToWord(tens * 10);
            String word2 = convertToWord(units);
            System.out.print(word1 + " " + word2 + " ");
        } else if (30 <= num1 && num1 < 110) {
            int units = num1 % 10;
            int tens = num1 / 10;
            if (units == 0) {
                String word1 = convertToWord(20 + (tens - 2));
                System.out.println(word1);
            } else {
                String word1 = convertToWord(20 + (tens - 2));
                String word2 = convertToWord(units);
                System.out.print(word1 + " " + word2 + " ");
            }
        } else if (num1 >= 110) {
            int lastTwoDigits = num1 % 100;
            int hundreds = num1 / 100;
            String word1 = convertToWord(20 + ((hundreds * 10) - 2));
            String word2 = convertToWord(lastTwoDigits);
            System.out.print(word1 + " " + word2);
        }
    }  
    }


		