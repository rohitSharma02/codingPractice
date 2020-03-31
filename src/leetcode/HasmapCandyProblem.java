package leetcode;

import java.util.*;

public class HasmapCandyProblem {
    public static void main(String[] args) {

        int[] A = {1, 2};
        int[] B = {2, 3};

        candy(A,B);
        System.out.println(candy(A,B));
    }

    public static int[] candy(int[] A, int B[]){
        int Sa = 0;
        int Sb = 0;

        for (int x : A) Sa += x;
        for (int x : B) Sb += x;

        int delta = (Sb - Sa) / 2;

        Set<Integer> setB = new HashSet();
        for(int x: B) setB.add(x);
        for(int x: A){
            if(setB.contains(x+delta))
                return new int[]{x , x+delta};

        }
        return null;
    }
}
