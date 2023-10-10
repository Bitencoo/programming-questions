int[][] solution(int[][] a) {
    int aux = 0;
    for(int i = 0; i < a.length; i++){
        for(int j = i; j < a[i].length; j++){
            aux = a[j][i];
            a[j][i] = a[i][j];
            a[i][j] = aux;
        }
    }
    
    for(int i = 0; i < a.length; i++){
        for(int j = 0; j < a[i].length / 2; j++){
            aux = a[i][j];
            a[i][j] = a[i][a[i].length - 1 - j];
            a[i][a[i].length - 1 - j] = aux;
        }
    }
    
    return a;
}
