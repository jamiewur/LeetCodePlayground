package Algorithm.Easy;

public class ToLowerCase {

    public String toLowerCase(String str) {

        char[] a = str.toCharArray();
        int hashcode;
        StringBuilder sb = new StringBuilder();
        for(char chars:a){
            Character currentChar = chars;
            hashcode = currentChar.hashCode();
            if(hashcode>=65) {
                sb.append(Character.toLowerCase(currentChar));
            }
            else sb.append(currentChar);
        }
        return sb.toString();
    }
}
