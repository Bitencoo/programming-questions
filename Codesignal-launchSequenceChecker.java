boolean solution(String[] systemNames, int[] stepNumbers) {
    Map<String, Integer> valuesMap = new HashMap<>();
    for(int i = 0; i < systemNames.length; i++){
        if(valuesMap.containsKey(systemNames[i])){
            if(valuesMap.get(systemNames[i]) >= stepNumbers[i]){
                return false;
            }
        }
        valuesMap.put(systemNames[i], stepNumbers[i]);
    }
    return true;
}
