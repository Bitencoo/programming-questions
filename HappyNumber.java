//202-Happy Number - Leetcode
class Solution {
    public boolean isHappy(int n) {
        String num = Integer.toString(n);
        int charSum = 0;
        int initValue = -1;
        HashSet<Integer> values = new HashSet();

        while(charSum != 1){
            charSum = 0;
            for(int i = 0; i < num.length(); i++) {
                charSum = charSum + (Character.getNumericValue(num.charAt(i)) * Character.getNumericValue(num.charAt(i)));
            }

            if(values.contains(charSum)){
                return false;
            }

            num = Integer.toString(charSum);
            values.add(charSum);
        }
        return true;
    }
}
