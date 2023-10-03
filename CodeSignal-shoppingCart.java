String[] solution(String[] requests) {
    LinkedHashMap<String, Integer> items = new LinkedHashMap<>();
    
    for(String s: requests){
        
        if(s.split(":")[0].trim().contains("add")){
            
            items.put(s.split(":")[1].trim(), 1);
        }
        
        if(s.split(":")[0].trim().contains("remove")){
            System.out.println(s.split(":")[1].trim());
            items.remove(s.split(":")[1].trim());
            
        }
        
        if(s.contains("quantity_upd")){
            items.put(s.split(":")[1].trim(), items.get(s.split(":")[1].trim()) + Integer.parseInt(s.split(":")[2].trim()));
        }
        
        if(s.contains("checkout")){
            items.clear();
        }
    }
    
    String[] cart = new String[items.size()];
    int i = 0;
    for(String s: items.keySet()){
        cart[i] = s + " : " + items.get(s);
        i++;
    }
    
    
    return cart;
}
