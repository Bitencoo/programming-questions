//169-Majority Element - Leetcode
class Solution {
    public int majorityElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int keyToReturn = 0;
        HashMap<Integer, Integer> valuesMap = new HashMap();

        for(int num : nums) {
            if(!valuesMap.containsKey(num)) {
                valuesMap.put(num, 1);
            } else {
                valuesMap.put(num, valuesMap.get(num) + 1);
            }
        }

        System.out.println(valuesMap);
        for(Integer key : valuesMap.keySet()) {
            if(max < valuesMap.get(key)) {
                max = valuesMap.get(key);
                keyToReturn = key;
            }
        }

        return keyToReturn;
    }
}
