package com.bptn.course._challenge;

import java.util.Arrays;

class MergeSort {

    public static void main(String args[]) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.print("Printing original array: ");
        System.out.println(Arrays.toString(arr));

        // sort array
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Printing sorted array: ");
        System.out.println(Arrays.toString(arr));

    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    //static void merge(int arr[], int l, int m, int r) {

         static void merge(int arr[], int start, int mid, int end) {
        // Calculate sizes of two sub-arrays to be merged
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into arr[]
        int i = 0, j = 0;
        int k = start; // Initial index of merged sub-array
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[], if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[], if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        } 

    }
 
    // Main function that sorts arr[l..r] using merge()
    //static void mergeSort(int arr[], int l, int r) {
       // Add code here
        static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            // Find the middle point
            int mid = start + (end - start) / 2;

            // Recursively sort first and second halves
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            // Merge the sorted halves
            merge(arr, start, mid, end);
        }

    }
}

