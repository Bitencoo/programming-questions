int[] solution(int[] sourceArray, int[] destinationArray) {
    int maxLength = 0;
    int startIdx = 0;
    int currentLength = 0;
    int currentStart = 0;

    for (int i = 0; i < sourceArray.length; i++) {
        if (sourceArray[i] == destinationArray[i]) {
            currentLength++;
        } else {
            currentLength = 0;
            currentStart = i + 1;
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            startIdx = currentStart;
        }
    }

    if (maxLength == 0) {
        return new int[]{0, 0};
    } else {
        return new int[]{maxLength, startIdx};
    }
}
