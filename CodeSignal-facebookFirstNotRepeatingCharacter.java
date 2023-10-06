char solution(String s) {
    LinkedHashMap<String, Integer> stringMap = new LinkedHashMap();
    
    for(int i = 0; i < s.length(); i++){
        if(stringMap.containsKey(s.substring(i, i+1))){
            stringMap.put(s.substring(i, i+1), stringMap.get(s.substring(i, i+1)) + 1);
        } else {
            stringMap.put(s.substring(i, i+1), 1);
        }
    }
    System.out.println(stringMap.toString());
    for(String st: stringMap.keySet()){
        System.out.println(st);
        if(stringMap.get(st) == 1){
            return st.charAt(0);
        } 
    }
    
    return '_';
}
