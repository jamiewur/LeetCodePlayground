package Algorithm.Easy;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


/**A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 *A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
 *Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 *Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
 */
public class RemoveOutermostParentheses {

    int pointer = 0;
    int beginpointer = 0;
    int endpointer = 0;
    int sum = 0;
    StringBuilder sb = new StringBuilder();

    public String removeOuterParentheses(String S) {

        char [] b = S.toCharArray();
        Character [] charObject = S.chars().mapToObj(c ->(char)c).toArray(Character[]::new);
        ArrayList<Character> bb = new ArrayList<Character>(Arrays.asList(charObject));
        Iterator iterator = bb.iterator();
        while(iterator.hasNext()&& pointer< S.length()) {
            if (sum == 0) {
                beginpointer = pointer;
            }
            Character currentChar = S.charAt(pointer);
            if (currentChar.hashCode() == 40) {
                sum += 1;
                pointer++;
            } else if (currentChar.hashCode() == 41) {
                sum += -1;
                pointer++;
            }

            if (sum == 0) {
                endpointer = pointer;
                sb.append(S.substring(beginpointer+1, endpointer-1));
            }
        }
        return sb.toString();
}

}