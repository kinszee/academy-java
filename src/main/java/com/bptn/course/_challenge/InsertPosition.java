package com.bptn.course._challenge;

//FREEZE CODE BEGIN
class InsertPosition {
 public static int searchInsert(int[] nums, int target) {
//FREEZE CODE END

     // Add the content of your method starting here
     int n = nums.length;
     for (int i = 0; i < n; i++){
         if (nums[i] >= target){
             return i;
         }
     }
     return n;

//FREEZE CODE BEGIN
 }

 public static void main(String args[]){
     int nums[] = {1, 3, 5, 7, 9} , target = 9;
     int nums1[] = {1, 3, 5, 6} , target1 = 3;
     int nums2[] = {1, 3, 5, 6, 7} , target2 = 7;

     System.out.println(searchInsert(nums, target));
     System.out.println(searchInsert(nums1, target1));
     System.out.println(searchInsert(nums2, target2));
 }
 
 
}