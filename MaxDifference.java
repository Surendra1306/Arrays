package Dsa_Arrays;

class Solution {
    public static int maximumDifference(int[] nums) {
        int max = -1;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] < nums[j]){
                    int temp = nums[j] - nums[i];
                    max = Math.max(temp, max);
                }
            }
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