package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Day 1 - Problem 1
        RunningSumof1dArray array = new RunningSumof1dArray();
        int[] arr = new int[10];
        for(int i = 0; i < 10 ; i++) {
            arr[i] = i;
        }
        int[] retVal = array.runningSum(arr);
        for(int index = 0 ;index < retVal.length ; index++) {
            System.out.println(retVal[index]);
        }

    }
}