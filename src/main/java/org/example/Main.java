package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Leet Code 75 Days Plan !");

//        // Day 1 - Problem 1
//        System.out.println("Day 1 Problem 1");
//        RunningSumof1dArray array = new RunningSumof1dArray();
//        int[] arr = new int[10];
//        for(int i = 0; i < 10 ; i++) {
//            arr[i] = i;
//        }
//        int[] retVal = array.runningSum(arr);
//        for(int index = 0 ;index < retVal.length ; index++) {
//            System.out.println(retVal[index]);
//        }

        // Day 1 - Problem 2
        System.out.println("Day 1 Problem 2");
        FindPivotIndex pivotIndx = new FindPivotIndex();
        int[] arr1 = {1,7,3,6,5,6};
        int pivot = pivotIndx.pivotIndex(arr1);
        System.out.println(pivot);

    }
}