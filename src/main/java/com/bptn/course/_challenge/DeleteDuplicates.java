package com.bptn.course._challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DeleteDuplicates {
    /*
     * This method deletes duplicates from an unsorted ArrayList.
     * @param nums the unsorted ArrayList with duplicates
     * @return a sorted ArrayList without duplicates
     */
    public static List<Integer> deleteDuplicates(List<Integer> nums) {
        // Check if the list is null or empty, and return an empty list if so
        if (nums == null || nums.size() == 0) {
            return new ArrayList<>();
        }

        // Use a TreeSet to remove duplicates and sort the list
        Set<Integer> uniqueNums = new TreeSet<>(nums);

        // Convert the TreeSet back to an ArrayList and return it
        return new ArrayList<>(uniqueNums);
    }

    public static void main(String[] args) {
        // Initialize a sample unsorted ArrayList with duplicate values
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        // Call the deleteDuplicates method with the sample list as argument
        List<Integer> result = deleteDuplicates(nums);

        // Print the result to the console
        System.out.println(result);
    }
}
