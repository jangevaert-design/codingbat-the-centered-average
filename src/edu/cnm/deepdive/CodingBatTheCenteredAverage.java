package edu.cnm.deepdive;

/*

Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array.
If there are multiple copies of the smallest value, ignore just one copy,
and likewise for the largest value.
Use int division to produce the final average. You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */

public class CodingBatTheCenteredAverage {


  static int[] one = {1, 2, 3, 4, 100};
  static int[] two = {1, 1, 5, 5, 10, 8, 7};
  static int[] three = {-10, -4, -2, -4, -2, 0};

  public static void main(String[] args) {
    System.out.println("with the array [1, 2, 3, 4, 100], the outcome is " + centeredAverage(one));
    System.out.println("with the array [1, 1, 5, 5, 10, 8, 7], the outcome is " + centeredAverage(two));
    System.out.println("with the array [-10, -4, -2, -4, -2, 0], the outcome is " + centeredAverage(three));
  }

  public static int centeredAverage(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      max = Math.max(max, nums[i]);
      min = Math.min(min, nums[i]);
      sum += nums[i];
    }
    return (sum - max - min) / (nums.length - 2);
  }

}
