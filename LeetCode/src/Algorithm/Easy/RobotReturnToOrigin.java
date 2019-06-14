package Algorithm.Easy;

public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {

        int size = moves.length();
        int countU = 0;
        int countD = 0;
        int countR = 0;
        int countL = 0;

        for(int i= 0; i<size;i++){
            char current = moves.charAt(i);
            if(current =='U') countU++;
            else if(current == 'D') countD++;
            else if(current == 'L') countL++;
            else countR++;
        }

        if(countL == countR && countD == countU){
            return true;
        }
        else return false;
    }

}
