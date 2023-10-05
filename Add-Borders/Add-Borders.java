String[] solution(String[] picture) {
    String[] sol = new String[picture.length + 2];
    sol[0] = "";
    sol[picture.length + 1] = "";
    
    for(int i = 0; i < picture[0].length() + 2; i++){
        sol[0] = sol[0] + "*";
        System.out.println(sol[0]);
        sol[picture.length + 1] = sol[picture.length + 1] + "*";
    }
    System.out.println(sol[0]);
    for(int i = 0; i < picture.length; i++){
        sol[i+1] = "*" + picture[i] + "*";
    }
    
    return sol;
}
