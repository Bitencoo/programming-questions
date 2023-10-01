int[] solution(int lastBackupTime, int[][] changes) {
    Map<Integer, Integer> needMap = new HashMap<>();
    int pos = 0;
    for(int i = 0; i < changes.length; i++){
        if(changes[i][0] > lastBackupTime){
            needMap.put(changes[i][1], changes[i][1]);
        }
    }
    
    int[] resArray = new int[needMap.size()];
    
    for(Integer i: needMap.keySet()){
        resArray[pos] = i;
        pos++;
    }
    
    Arrays.sort(resArray);
    
    return resArray;
}
