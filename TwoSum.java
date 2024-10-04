//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//https://leetcode.com/problems/two-sum/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0; i < nums.length; i++) {
            int val = nums[i];
            int diff = target - val;
            if(m.containsKey(diff)) {
                return new int[] {i, m.get(diff)};
            } else {
                m.put(val, i);
            }
        }
        return null;
  }
}
