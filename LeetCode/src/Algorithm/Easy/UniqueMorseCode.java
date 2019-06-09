package Algorithm.Easy;

import java.util.ArrayList;

/**
 * Return the number of different transformations among all words we have.
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 */
public class UniqueMorseCode {

    public int uniqueMorseRepresentations(String[] words) {

        String [] morse ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        ArrayList<StringBuilder> sbArray = new ArrayList<>();
        for(String word:words){
            StringBuilder kk = new StringBuilder();
            char []a = word.toCharArray();
            for(int i =0; i<word.length();i++){
                kk.append(morse[a[i]-'a']);
            }
            sbArray.add(new StringBuilder(kk));
        }
        System.out.println(sbArray.size());
        int count = 0;
        for(int j=0; j<sbArray.size();j++ ){
            for(int k=j+1;k<sbArray.size();k++){
                if(sbArray.get(j).toString().contains(sbArray.get(k).toString()))
                    count++;
            }
        }
        if(sbArray.size()==1){
            return 1;
        }
        return count;
    }
}
