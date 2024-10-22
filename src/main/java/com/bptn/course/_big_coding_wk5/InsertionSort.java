package com.bptn.course._big_coding_wk5;

public class InsertionSort {
    // This method sorts an array in ascending order using insertion sort algorithm
    public static void insertionSort(int[] arr) {
    	
    	// Check if the array is null or has less than 1 element
        if (arr == null || arr.length < 1) {
            // Return if the array is null or has less than 1 element
            return;
        }    
        // Loop through the array starting from index 1 to length of the array
        for (int i=1; i < arr.length; i++) {
            // Store the current element
            int current = arr[i];
            // Initialize j with i - 1
            int j = i-1;
            // Inner loop to compare current element with elements before it in the array
            while (j >= 0 && current < arr[j] ) {
                // Shift the element to the right
                arr[j + 1] = arr[j];
                // Decrement j to compare with next element
                j = j -1;
            }
            // Insert the current element at its correct position
            arr[j+1] = current;
        }
    }
  //Do not modify below code
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {3, 4, 1, -2, 4, 8};
        // Call the sort method to sort the array
        insertionSort(arr);
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
The If block starts with checking that the array is not empty or has more than one element.
Providing both conditions are true, the insert sort algorithim begins to run.

The for loop iterates through the array starting condition at 2nd element and continues iterations as long as 
index is less than the array length. For each iteration it stores the current value at index i in "current" then
checks for value in next element with j = i-1;

Finally, the while loop is nested in the for loop to swap elements where next element j is > 0 AND current element
is <  j. While this is true, arr[j + 1] shifts element to the right and stores the new sort in arr[j].

The while loop ends and for loop inserts all sorted elements into arr[j+1] = current;

Issues Faced:
- I used arr.length() instead of arr.length on lines 6 and 11.
- Wrongfully assigned arr[j] = arr[j + 1]; on line 19

*/