package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int nums[] = new int[s.nextInt()];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        System.out.println(tripletsZero(nums));
    }

    public static List<List<Integer>> tripletsZero(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // sorting array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (left > i + 1 && nums[left] == nums[left - 1]) {
                    left++;
                    continue;
                }
                if (right < nums.length - 1 && nums[right] == nums[right + 1]) {
                    right--;
                    continue;
                }
                int c = nums[left] + nums[right];
                if (c < -nums[i]) {
                    left++;
                }

                if (c > -nums[i]) {
                    right--;
                }
                if (c == -nums[i]) {
                    List<Integer> triplets = new ArrayList<Integer>();
                    triplets.add(nums[i]);
                    triplets.add(nums[left]);
                    triplets.add(nums[right]);
                    result.add(triplets);
                    left++;
                    right--;
                }
            }
        }

        return result;
    }
}
