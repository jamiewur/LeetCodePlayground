package Algorithm.Easy;

public class MaximumNumberBalloons {
    public int maxNumberOfBalloons(String text) {
        int a=0;
        int[] c = new int[26];
        for(int i=0;i<26;i++){
            c[i]=0;
        }
        for(char t:text.toCharArray()){
            c[t-97]++;
        }
        if(c[0]>=1 &&c[1]>=1 && c[13]>=1 && c[11]>=2 && c[14]>=2){
            a = Math.min(c[0],Math.min(c[1],Math.min(c[11]/2,Math.min(c[13],c[14]/2))));
        }
        return a;
    }
}
