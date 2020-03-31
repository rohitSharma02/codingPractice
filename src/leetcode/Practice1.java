package leetcode;

public class Practice1 {

    public static void main(String[] args){
        String str = "hello";
        char[] s = str.toCharArray();
        System.out.println(s);
        helper(s, 0, s.length -1);
        System.out.println(s);
    }

    public static void helper(char[] s,int left,int right){
        if(left >= right) return ;

        char tmp = s[left];

        s[left++] = s[right];
        //System.out.println("l: "+s[left]);
        //System.out.println(s[right]);
        s[right--] = tmp;
        helper(s,left,right);

    }
}
