package Algorithm.Easy;

public class SimilarRGBColor {
    public String similarRGB(String color) {

        int deci1 = Integer.parseInt(color.substring(1,3),16);
        int deci2 = Integer.parseInt(color.substring(3,5),16);
        int deci3 = Integer.parseInt(color.substring(5,7),16);
        int current =0;

        StringBuilder sb = new StringBuilder();
        sb.append("#");
        int [] a = new int[3];
        a[0] = deci1;
        a[1] = deci2;
        a[2] = deci3;

        for(int i:a){
            if(i/16 < 8) {
                if (i - ((i / 16) * 16 + (i / 16)) > ((i / 16) + 1) * 16 + (i / 16) + 1 - i)
                    current = ((i / 16) + 1) * 16 + (i / 16) + 1;
                else current = (i / 16) * 16 + (i / 16);
                sb.append(Integer.toHexString(current));
            }
            else {
                if (((i / 16) * 16 + (i / 16)) - i > i - (((i / 16) - 1) * 16 + (i / 16) - 1 ))
                    current = ((i / 16) - 1) * 16 + (i / 16) - 1 ;
                else current = (i / 16) * 16 + (i / 16);
                sb.append(Integer.toHexString(current));
            }
        }
        return sb.toString().replaceAll("0","00");
    }
}
