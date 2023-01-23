package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        RunningSumof1dArray array = new RunningSumof1dArray();
        int[] arr = new int[10];
        arr[0] = 2;
        int[] retVal = array.runningSum(arr);
        System.out.println(retVal[0]);

    }
}