package leetcode;
import java.io.*;
import java.util.*;
import java.lang.*;


public class StringPlay {


    public static void helper(char[] s, int left, int right) {
        if(left>=right) return;
        char tmp = s[left];
        s[left] = s[right];

    }
    public static void main (String[] args){
        String x = "hello";
        char[] s = x.toCharArray();
        helper( s, 0, s.length-1);
    }
}