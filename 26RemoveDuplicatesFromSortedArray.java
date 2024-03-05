//26-Remove Duplicated from Sorted Array - Leetcode
class Solution {
    public int removeDuplicates(int[] nums) {
        int[] copyNums = new int[nums.length];
        int removedElements = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] == nums[i]) {
                nums[i-1] = -101;
                removedElements++;
            }
        }

        int realPos = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != -101) {
                copyNums[realPos] = nums[i]; 
                realPos++;
            } else {
                copyNums[i] = -101;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = copyNums[i];
        }

        return nums.length - removedElements;
    }
}
