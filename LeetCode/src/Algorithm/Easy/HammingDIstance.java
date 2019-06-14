package Algorithm.Easy;

public class HammingDIstance {

    public int hammingDistance(int x, int y) {

        String binaryOfx = Integer.toBinaryString(x);
        String binaryOfy = Integer.toBinaryString(y);
        int size;
        if(binaryOfx.length()>binaryOfy.length()){
            size = binaryOfx.length()-binaryOfy.length();
            for(int i=0;i<size;i++){
                binaryOfy = "0" +binaryOfy;
            }
        }
        else {
            size = binaryOfy.length()-binaryOfx.length();
            for(int j=0;j<size;j++){
                binaryOfx = "0" + binaryOfx;
            }
        }
        int count = 0;
        for(int k=0; k<binaryOfx.length();k++){
            if(binaryOfx.charAt(k)!=binaryOfy.charAt(k))
                count++;
        }
        return count;
    }
}
