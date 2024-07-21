
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
   public  static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                // Return the result as soon as the pair is found
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // Return an empty array if no pair is found
        return new int[0];
    }
   public  static void main(String[]args){
       int num[]={2,5,3,4,1};
       twoSum(num,9);
   }
}
