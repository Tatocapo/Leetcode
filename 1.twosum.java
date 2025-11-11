import java.util.Arrays;

class Solution {
    public int[] twoSum(int nums[], int target) {
        int lenght = nums.length;
        for (int arr1 = 0; arr1 < lenght; arr1++) {
            for (int arr2 = 1; arr2 < lenght; arr2++) {
                if (nums[arr1] + nums[arr2] == target) {
                    return new int[] { arr1, arr2 };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test 1: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Výsledok: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println();

        // Test 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test 2: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Výsledok: [" + result2[0] + ", " + result2[1] + "]");
        System.out.println();

        // Test 3
        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Test 3: nums = " + Arrays.toString(nums3) + ", target = " + target3);
        System.out.println("Výsledok: [" + result3[0] + ", " + result3[1] + "]");
    }
}