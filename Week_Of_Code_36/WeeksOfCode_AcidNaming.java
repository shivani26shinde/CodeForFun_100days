// Weeks of Code 36 -- Acid naming

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeeksOfCode_AcidNaming {

    static String acidNaming(String acid_name) {
        boolean start = acid_name.startsWith("hydro");
        boolean end = acid_name.endsWith("ic");
        if(start == true){
            if(end == true){
                return "non-metal acid";
            }
        }
        else{
            if(end == true){
                return "polyatomic acid";
            }
        }
        return  "not an acid";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String acid_name = in.next();
            String result = acidNaming(acid_name);
            System.out.println(result);
        }
        in.close();
    }
}
