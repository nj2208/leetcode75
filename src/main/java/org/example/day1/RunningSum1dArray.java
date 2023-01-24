package org.example.day1;

public class RunningSum1dArray {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        if(nums.length >= 1 && nums.length <= 1000 ) {
            runningSum[0] = nums[0];
            for(int index = 1 ; index < nums.length ; index++) {
                runningSum[index] = runningSum[index-1]  + nums[index];
            }
        }
        return runningSum;
    }
}
