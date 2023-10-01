int solution(int[] statues) {
    int lowest = Integer.MAX_VALUE;
    int highest = Integer.MIN_VALUE;
    for(int i = 0; i < statues.length; i++){
        if(statues[i] < lowest){
            lowest = statues[i];
        }
        
        if(statues[i] > highest){
            highest = statues[i];
        }
    }
    return (highest - lowest + 1) - statues.length;
}
