
package In.sode.test;

import java.util.HashMap;
public class Romtoint {
  
    public static int romanToInt(String s1) {
        String s=s1;
        HashMap<Character,Integer> romint=new HashMap<>();
        romint.put('I',1);
        romint.put('V',5);
        romint.put('X',10);
        romint.put('L',50);
        romint.put('C',100);
        romint.put('D',500);
        romint.put('M',1000);
         int total=0;
         int length=s.length();

         for(int i=0;i<length;i++){
            int value=romint.get(s.charAt(i));
            if(i+1<length && romint.get(s.charAt(i))<romint.get(s.charAt(i+1))){
                total-=value;

            }
            else{
                total+=value;
            }
         }
return total;
    }
    public static void main(String[]args){
        romanToInt("IV");
    }
}

