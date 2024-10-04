//https://leetcode.com/problems/3sum/description/
//Time - O(nlogn)+O(n^2))=O(n^2)

//Space - O(n) (for input)+O(n) (for output)+O(1)=O(n)
//O(n) (for output) as all elements of array can be part of triplets matching

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums); // Sort the array first -- O(n log n)

        for (int i = 0; i < nums.length - 2; i++) {
            // IMPORTANT - to avoid duplicate -- attention
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicate elements for left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // We need a larger sum
                } else {
                    right--; // We need a smaller sum
                }
            }
        }

        return triplets;
    }
