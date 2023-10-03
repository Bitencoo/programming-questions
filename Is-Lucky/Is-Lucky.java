boolean solution(int n) {
    String number = Integer.toString(n);
    char[] arrayNum = number.toCharArray();
    int numLen = arrayNum.length;
    int leftSum = 0;
    int rightSum = 0;
    
    for(int i = 0; i < (numLen / 2); i++){
        System.out.println(Character.getNumericValue(arrayNum[i]));
        leftSum = leftSum + Character.getNumericValue(arrayNum[i]);
        rightSum = rightSum + Character.getNumericValue(arrayNum[i + (numLen / 2)]);
    }
    return leftSum == rightSum;
}
