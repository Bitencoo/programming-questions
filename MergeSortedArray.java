class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int auxNums1 = m - 1;
        int auxNums2 = n - 1;
        int mergeIndex = m + n - 1;
    
        while(auxNums2 >= 0) {
            if(auxNums1 >= 0) {
                if(nums2[auxNums2] >= nums1[auxNums1]) {
                nums1[mergeIndex] = nums2[auxNums2];
                auxNums2--;
                mergeIndex--;
                } else {
                    nums1[mergeIndex] = nums1[auxNums1];
                    auxNums1--;
                    mergeIndex--;
                }
            } else {
                nums1[auxNums1 + 1] = nums2[auxNums2];
                auxNums1++;
                auxNums2--;
            }
            
        }
    }
}
