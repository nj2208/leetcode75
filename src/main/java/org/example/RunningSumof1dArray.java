package org.example;

/*
* Given an array nums. We define a running sum of an array as
* runningSum[i] = sum(nums[0]…nums[i]).
* Return the running sum of nums.
* Example 1:
* Input: nums = [1,2,3,4]
* Output: [1,3,6,10]
* Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
* Constraints:
1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
*/
public class RunningSumof1dArray {
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
