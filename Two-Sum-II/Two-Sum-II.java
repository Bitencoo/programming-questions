class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(right > left){
            if(numbers[left] + numbers[right] == target) {
                int[] res = {left + 1, right + 1};
                return res;
            }  

            if(numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }     
        }

        return new int[]{};
    }
}