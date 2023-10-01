int solution(int[][] matrix) {

    int sum = 0;
                        
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[i].length; j++) {
            if(matrix[i][j] == 0) {
                for(int k = i; k < matrix.length; k++){
                    matrix[k][j] = 0;
                }
            } else {
                sum = sum + matrix[i][j];
            }
        }
    }
    
    return sum;
}
