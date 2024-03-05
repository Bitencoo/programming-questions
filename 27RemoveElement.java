//27-Remove Element LeetCode
class Solution {
    public int removeElement(int[] nums, int val) {
        int removedElements = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                nums[i] = -1;
                removedElements++;
            }
        }

        int left = 0;
        int right = nums.length - 1;
        while(left != right) {
            if(nums[left] == -1) {
                if(nums[right] != -1) {
                    nums[left] = nums[right];
                    nums[right] = -1;
                    right--;
                    left++;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return nums.length - removedElements;
    }
}
