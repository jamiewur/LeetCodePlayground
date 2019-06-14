package Algorithm.Easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {

        int total = emails.length;
        String [] domains = new String[total];
        String [] locals = new String[total];

        for(int i=0; i<total;i++){
            String curent = emails[i];
            String [] parts = curent.split("@");
            String all = parts[0];
            if(all.contains("+")){
                String[] valid = all.split("\\+");
                locals[i] = valid[0].replace(".","");
            }
            else {
                locals[i] = all.replace(".","");
            }
            domains[i] = parts[1];
        }

        int count = 0;
        String [] cuurentA = new String[total];
        Set <String> a = new HashSet<>();
        for(int k=0;k<total;k++){
            cuurentA[k]= locals[k]+"@"+domains[k];
        }
        for(String b: cuurentA){
            a.add(b);
        }
        return a.size();
    }
}
