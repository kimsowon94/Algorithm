package LeetCode.Two_sum;

public class Two_sum {
    public int[] twoSum(int[] nums, int target) {

         int index = nums.length;
         int num;
         int [] result = new int[2];

         for (int i = 0; i < index ; i++) {
             num = nums[i];

             for (int j = 0; j < index ; j++) {
                 if (i != j) {
                     if (num + nums[j] == target) {
                         result[0] = i;
                         result[1] = j;
                     }
                 }
             }
         }
         return result;
     }
}
