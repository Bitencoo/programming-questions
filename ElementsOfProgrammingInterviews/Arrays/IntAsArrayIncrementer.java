//Exercise 5.2 - Page 45
public int[] incrementIntArray(int[] input) {
  int carryOut = 0;
  int index = input.length-1;
  
  do{
      if(input[index] == 9) {
          carryOut = 1;
          input[index] = 0;
          index--;
      } else {
        input[index] += 1;
        carryOut = 0;
      }
  } while (carryOut != 0);
  
  return input;
}
