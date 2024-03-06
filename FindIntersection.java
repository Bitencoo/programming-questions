//Find Intersection - Coderbyte
import java.util.*; 
import java.io.*;

class Main {

  public static String FindIntersection(String[] strArr) {
    // code goes here  
    HashMap<String, Integer> valuesStringA = new HashMap();
    String intersection = "";
    for(String s : strArr[0].split(",")){
      if(!valuesStringA.containsKey(s.trim())) {
        valuesStringA.put(s, Integer.parseInt(s.trim()));
      }
    }

    for(String s : strArr[1].split(",")){
      if(valuesStringA.containsKey(s)) {
        valuesStringA.put(s, Integer.parseInt(s.trim()));
        intersection += s;
      }
    }

    if(intersection.equals("")) {
      return "false";
    }

    return intersection.replace(" ", ",");
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}
