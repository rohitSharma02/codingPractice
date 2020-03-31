package leetcode;
import java.util.Map;
import java.util.HashMap;

public class CoinExchange {
 public static void main(String[] args){
     int amt = 5;
     int[] coins = {1,5,10};
     Map<Integer,Integer> h = new HashMap<>();
     //int len = coins.length;
     helper(amt, coins, h);
     System.out.println(helper(amt, coins, h));
    }

 public static int helper(int amt, int[] coins, Map<Integer,Integer> map) {
     if (amt == 0) return 0;
     if (map.containsKey(amt)) {
         return map.get(amt);
     }
     int min = Integer.MAX_VALUE;
     for (int i = 0; i < coins.length; i++) {
         if (coins[i] > amt) {
             continue;
         }

         int val = helper(amt - coins[i], coins, map);
         if (val < min) {
             min = val;
         }

     }

     min = (min == Integer.MAX_VALUE ? min : min + 1);

     map.put(amt,min);
     helper(amt, coins,map);
     return min;
 }
}
