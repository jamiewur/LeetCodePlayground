package Algorithm.Easy;
import java.util.ArrayList;
import java.util.Stack;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        ArrayList<String> a = new ArrayList<>();
        for (String string : words) {
            if(isSameLine(string)) a.add(string);
        }
        return a.toArray(new String[a.size()]);
    }

    public boolean isSameLine(String s){
        String KeyboardLine2 = "asdfghjklASDFGHJKL";
        String KeyboardLine1 = "qwertyuiopQWERTYUIOP";
        String KeyboardLine3 = "zxcvbnmZXCVBNM";
        String currentString;
        if(KeyboardLine2.contains(""+s.charAt(0))) currentString = KeyboardLine2;
        else if(KeyboardLine1.contains(""+s.charAt(0))) currentString = KeyboardLine1;
        else currentString = KeyboardLine3;
        for(char c:s.toCharArray()){
            if(!currentString.contains(""+c)) return false;
        }
        return true;
    }
}
