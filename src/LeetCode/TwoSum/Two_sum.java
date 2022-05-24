package LeetCode.TwoSum;

public class Two_sum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7 , 11, 15};
        int target = 9;

        Two_sum twoSum = new Two_sum();
        twoSum.twoSum(nums, target);
    }

    // 반복문
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
                         break;
                     }
                 }
             }
         }
         return result;
     }

     // 필터

}
