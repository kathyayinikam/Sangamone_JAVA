
package In.sode.test;


public class palindrome {
    
    public static boolean isPalindrome(int n) {
        // If n is negative, it cannot be a palindrome
        if (n < 0) {
            return false;
        }

        // Convert the integer to a string
        String x = Integer.toString(n);
        int len = x.length();
        
        // Compare characters from the start and end moving towards the center
        for (int i = 0; i < len / 2; i++) {
            if (x.charAt(i) != x.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        boolean a=isPalindrome(1221);
        
    }
}

    

