int solution(int[] a) {
    HashMap<Integer, Integer> numDuplicates = new HashMap<>();
    
    for(int i = 0; i < a.length; i++){
        if(numDuplicates.containsKey(a[i])){
            return numDuplicates.get(a[i]);
        } else {
            numDuplicates.put(a[i], a[i]);
        }
    }

    return -1;
}
