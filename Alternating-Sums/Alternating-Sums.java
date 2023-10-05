int[] solution(int[] a) {
    int[] sol = new int[2];
    int pos = 0;
    for(Integer i: a){
        if(pos % 2 == 0){
            sol[0] = sol[0] + i;
        } else {
            sol[1] = sol[1] + i;
        }
        pos++;
    }
    
    return sol;
}
