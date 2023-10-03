String[] solution(String[] inputArray) {
    int highest = 0;
    for(String s: inputArray) {
        if(s.length() > highest){
            highest = s.length();
        }
    }
    
    List<String> ans = new ArrayList<>();
    for(String s: inputArray) {
        if(s.length() == highest){
            ans.add(s);
        }
    }
    
    String[] ansArray = new String[ans.size()];
    for(int i = 0; i < ansArray.length; i++) {
        ansArray[i] = ans.get(i);
    }
    
    return ansArray;
}
