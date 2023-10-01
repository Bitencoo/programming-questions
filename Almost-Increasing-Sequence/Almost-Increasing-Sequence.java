boolean solution(int[] sequence) {
    int last = Integer.MIN_VALUE;
    int beforeLast = Integer.MIN_VALUE;
    int result = 0;
    
    for(int number: sequence) {
        if(number <= last){
            result++;
            if(number > beforeLast){
                last = number;
            }
        } else {
            beforeLast = last;
            last = number;
        }
    }
    return result <= 1;
}
