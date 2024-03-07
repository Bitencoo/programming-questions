//217-Contains Duplicate - Leetcode
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> quantityNumMap = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            if(!quantityNumMap.containsKey(nums[i])) {
                quantityNumMap.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
