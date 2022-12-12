package com.company;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] output = {-1, -1};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
//        Output should be [0,1]
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));

//        Output should be [1,2]
        nums = new int[]{3, 2, 4};
        target = 6;
        output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));

//        Output should be [0,1]
        nums = new int[]{3, 3};
        target = 6;
        output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }
}
