int[] solution(int[] a) {
    int aux = 0;
    for(int i = 0; i < a.length; i++) {
        if(a[i] != -1){
            for(int j = i; j < a.length; j++){ 
                if(a[j] != -1){
                    if(a[j] < a[i]){
                        aux = a[i];
                        a[i] = a[j];
                        a[j] = aux;
                    }
                }
            }
        }
        
    }
    
    return a;
}
