package Dsa_Arrays;

class Solution {
    public static int maximumDifference(int[] nums) {
        int max = -1;
//        for(int i=0; i<nums.length-1; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i] < nums[j]){
//                    int temp = nums[j] - nums[i];
//                    max = Math.max(temp, max);
//                }
//            }
//        }
//        return max;
        
//       TC = O(n) 
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            int val = nums[i];
            if(min < val){
                max = Math.max(max, val-min);
            }
            min = Math.min(min, val);
        }
        return max;
    }
}


public class MaxDifference {
	public static void main(String[] args) {
		int arr[] = {7,1,5,4};
		System.out.println(Solution.maximumDifference(arr));
	}
}