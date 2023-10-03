package binarysearch;

import java.util.Arrays;
//The time complexity to perform this operation is O[log n] ie logarithmic because of Binary Search
public class KthSmallestItemSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{30,50,70,45,20,18,73};
        int numberToFind = 20;
        int index = findKthSmallestItemInArray(arr,numberToFind);
        if (index >= 0)
            System.out.format("Element %d is found at index: %d ",numberToFind,index);
        else
            System.out.format("Element %d is not found ",numberToFind);
    }

    public static int findKthSmallestItemInArray(int arr[], int num) {
        //As per precondition for Binary Search, We need to sort the array in Ascending Order
        Arrays.sort(arr);
        //Now create three pointers to have startIndex,endIndex and midIndex
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            if (arr[midIndex] == num) return midIndex;
            else if (arr[midIndex] < num) startIndex = midIndex;
            else endIndex = midIndex;
        }
        return -1;
    }
}
