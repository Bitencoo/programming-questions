//Caesar Cipher - HackerRank
public static String caesarCipher(String s, int k) {
    // Write your code here
        StringBuilder sb = new StringBuilder();
        int newChar;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetter(c)) {
                if(Character.isUpperCase(c)) {
                    newChar = ((c - 'A'+ k) % 26) + 'A'; 
                } else {
                    newChar = ((c - 'a'+ k) % 26) + 'a'; 
                }
                c = (char) newChar;
            } 
            sb.append(c);
        }
        return sb.toString();
    }
