// 290. Word Pattern

package com.leetCodeQns;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(WordPattern.wordPattern("cbaceb", "cat dog deer cat hen dog"));
    }

    static boolean  wordPattern(String pattern, String s){
        int len = pattern.length();
        String [] words = s.split(" ");
        if(len != words.length) return false;
        //pattern = abba s ="cat dog dog cat"
        Map<Character,String> chartoString = new HashMap<>();

        for(int i=0; i<len; i++){
            chartoString.put(pattern.charAt(i), words[i]);
        }
        Map<String, Character> stringToChart = new HashMap<>();
        for(int i=0; i<len; i++){
            stringToChart.put(words[i], pattern.charAt(i));
        }
        System.out.println(chartoString.toString());
        System.out.println(stringToChart.toString());

        for(int i=0; i<len; i++){
            if(!chartoString.get(pattern.charAt(i)).equals(words[i]) || !stringToChart.get(words[i]).equals(pattern.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
