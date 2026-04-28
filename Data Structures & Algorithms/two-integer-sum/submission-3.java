class Solution {
    public int[] twoSum(int[] nums, int target) {

        // System.out.println(nums.length);
        int[] arr = new int[2];
        for (int i = 0; i <= nums.length / 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
                // System.out.println(
                //         "i -> " + nums[i] + " j -> " + nums[j] + " = " + (nums[i] + nums[j]) + " ? " + target);
            }
        }
        return arr;
    
    }
}
