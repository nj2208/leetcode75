package org.example.day1;


public class Day1 {
    public static void day1() {
        int[] arr = {1,-1,0,1};
        // Day 1 - Problem 1
        System.out.println("Day 1 Problem 1");
        RunningSum1dArray array = new RunningSum1dArray();
        int[] retVal = array.runningSum(arr);
        System.out.println("running Array ");
        for(int i = 0; i < retVal.length ; i++) {
            System.out.println(retVal[i]);
        }

        // Day 1 - Problem 2
        System.out.println("Day 1 Problem 2");
        FindPivotIndex pivotIndx = new FindPivotIndex();
        int pivot = pivotIndx.pivotIndex(arr);
        System.out.println("Pivot: " + pivot);
    }

}
