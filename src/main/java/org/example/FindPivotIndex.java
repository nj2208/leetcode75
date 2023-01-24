package org.example;
/**
 * Given an array of integers nums, calculate the pivot index of this array.
 *
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 *
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 *
 *
 * Return the leftmost pivot index. If no such index exists, return -1.
 *
 * Input: nums = [2,1,-1]
 * Output: 0
 * Explanation:
 * The pivot index is 0.
 * Left sum = 0 (no elements to the left of index 0)
 * Right sum = nums[1] + nums[2] = 1 + -1 = 0
 *
 */

public class FindPivotIndex {
    //{1,7,3,6,5,6};

    //startIndex = 0

    //endIndex = 1;
    public int calculateSum(int[] arr , int startIndex , int endIndex){
        int sum = 0;
        if(startIndex == endIndex)
            sum = arr[startIndex];

        for (int pos = startIndex; pos < endIndex; pos++) {
                sum = sum + arr[pos];
        }

        return sum;
    }

    public int pivotIndex(int[] nums) {
        int pivot = -1; // Assume initialy no pivot exists until proven wrong
        if (nums.length >= 1 && nums.length <= 10000) {
            // Left Edge Case
            if (0 == calculateSum(nums, 1, nums.length)) {
                System.out.println("left edge pivot");
                pivot = 0;
            }
            else {
                //  Middle pivot Case
                //{1,7,3,6,5,6};
                for (int index = 1; index < (nums.length - 1); index++) {
                    System.out.println("pivot index  : " + index);
                    int leftSum = calculateSum(nums, 0, index);
                    System.out.println("leftSum : " + leftSum);
                    int rightSum = calculateSum(nums, index + 1, (nums.length));
                    System.out.println("rightSum : " + rightSum);
                    if (leftSum == rightSum) {
                        System.out.println("middle pivot");
                        pivot = index;
                        break;
                    }
                }
            }
            // Right Edge Case
            if(-1 == pivot) {
                if (0 == calculateSum(nums, 0, nums.length - 1)) {
                    System.out.println("right edge pivot");
                    pivot = nums.length - 1;
                }
            }

        }
        return pivot;
    }
}
