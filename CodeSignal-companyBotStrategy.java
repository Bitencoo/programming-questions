double solution(int[][] trainingData) {
    double qtyRight = 0;
    double sumValues = 0;
    for(int i = 0; i < trainingData.length; i++){
        if(trainingData[i][1] == 1){
            qtyRight++;
            sumValues = sumValues + trainingData[i][0];
        }
    }
    
    if(qtyRight == 00 || sumValues == 0){
        return 0.0;
    }
    
    return sumValues / qtyRight;
}
