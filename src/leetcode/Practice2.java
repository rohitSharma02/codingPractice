package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    //driver function
      public static void main(String() args){
          int[] coins = {1,2,3};
          Map<Integer, Integer> h = new HashMap<>();
          int amt = 6;
          helper(coins,amt,h);
    }

    public static int helper(int[] coins, int amt, Map<Integer, Integer> h){
          if(amt == 0) return 0;
          if(h.containsKey(amt)){
              return h.get(amt);
          }
          for(int i = 0; i< coins.length; i++){

          }

          return val;
    }
}
