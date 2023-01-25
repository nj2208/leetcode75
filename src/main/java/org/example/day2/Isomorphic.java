package org.example.day2;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.pow;
// foo bar
// egg add
//
//        String str1 = "paper";
//        String str2 = "title";
public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        boolean retVal = false;
        if (s.equals(t)) {
            retVal = true;
        } else {
            if ((s.length() == t.length()) && s.length() <= 5 * pow(10, 4) && s.length() >= 1) {
                Map<Character, Character> map = new HashMap<>();
                for (int index = 0; index < s.length(); index++) {
                    if ((s.charAt(index) <= 127 && s.charAt(index) >= 1) &&
                            (t.charAt(index) <= 127 && t.charAt(index) >= 1)) {
                        if (map.isEmpty()) {
                            // First
                            map.put(s.charAt(index), t.charAt(index));

                        } else {
                            if (map.containsKey(s.charAt(index))) {
                                if (map.get(s.charAt(index)) != t.charAt(index) ) {
                                    retVal = false;
                                    break;
                                }
                                // Repeat entry in left string . Check for this key if
                                // corresponding same value exists in right string
                                if (map.get(s.charAt(index)) == t.charAt(index) && (index == s.length() -1)) {
                                    retVal = true;
                                    break;
                                }
                            } else {
                                    if (map.containsValue(t.charAt(index))) {
                                        retVal = false;
                                        break;
                                    }

                                map.put(s.charAt(index), t.charAt(index));
                            }
                        }
                        retVal = true;
                    }
                }
            }
        }
        return retVal;
    }
}
