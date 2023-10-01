class Solution {
    public int reverse(int x) {
        int auxNumber = x;
        long finalNumber = 0;
        while(x != 0) {
            auxNumber = x % 10;
            if((finalNumber * 10) + auxNumber > Integer.MAX_VALUE || (finalNumber * 10) + auxNumber < Integer.MIN_VALUE){
            return 0;
        }
            finalNumber = (finalNumber * 10) + auxNumber;
            x = x / 10;
        }

        return (int) finalNumber;
    }
}