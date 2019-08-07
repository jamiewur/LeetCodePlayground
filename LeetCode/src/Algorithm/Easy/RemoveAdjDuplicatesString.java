package Algorithm.Easy;

import java.util.Stack;

public class RemoveAdjDuplicatesString {
    public String removeDuplicates(String S) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<S.length();i++){
        if(S.charAt(i)==s.peek() && !s.empty()) s.pop();
        else s.push(S.charAt(i));
    }
        StringBuilder sb = new StringBuilder();
        for(char r:s) sb.append(r);
        return sb.toString().substring(0,s.size());
}
}
