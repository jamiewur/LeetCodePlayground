package Algorithm.Easy;

public class DIStringMatch {

    public int[] diStringMatch(String S) {

        int[] a = new int[S.length()+1];
        int cMAX = S.length();
        int cMIN = 0;

        for(int j=0;j<S.length();j++){
            if(S.charAt(j)=='I'){
                a[j] = cMIN;
                cMIN++;
            }
            else {
                a[j] = cMAX;
                cMAX --;
            }
        }

        if(S.endsWith("I")){
            a[S.length()]=cMIN;
        }
        else a[S.length()] = cMAX;

        return a;
    }
}
