class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> test =new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(test.containsKey(nums[i])){
                return true;
            }else{
                test.put(nums[i],nums[i]);
            }
        }
        return false;
        // return Arrays.stream(nums)
        //              .distinct()
        //              .count() < nums.length;
    }
}