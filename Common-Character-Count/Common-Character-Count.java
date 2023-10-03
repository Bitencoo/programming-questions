int solution(String s1, String s2) {
    Map<Character, Integer> countChars = new HashMap();
    int sumChars = 0;
    
    for(char c : s1.toCharArray()){
        if(!countChars.containsKey(c)) {
            countChars.put(c, 1);
        } else {
            countChars.put(c, countChars.get(c) + 1);
        }
    }
    
    for(char c: s2.toCharArray()){
        if(countChars.containsKey(c)){
            if(countChars.get(c) > 0) {
                sumChars++;
                countChars.put(c, countChars.get(c) - 1);
            }
        }
    } 
    
    return sumChars;
}
