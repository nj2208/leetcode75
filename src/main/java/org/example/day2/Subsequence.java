package org.example.day2;

import static java.lang.Math.pow;
//        String str1 = "foo";
//        String str2 = "bar";
public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        boolean retVal = false;
        s.toLowerCase();
        t.toLowerCase();
        if (s.equals(t)) {
            retVal = true;
        }
        if ( (s.length() <= 100) && (( t.length() >=0)  || (s.length() >= 0))
                && ( t.length() <= 10000 )  || (s.length() <= 10000) ) {


        }
        return retVal;
    }
}
