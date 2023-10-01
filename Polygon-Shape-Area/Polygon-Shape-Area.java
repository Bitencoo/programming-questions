int solution(int n) {
    int shapeArea = 1;
    
    for(int i = 0; i < n; i++){
        shapeArea = shapeArea + (4 * i);
    }
    
    return shapeArea;
}
