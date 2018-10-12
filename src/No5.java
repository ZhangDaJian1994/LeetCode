import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public String longestPalindrome(String s ) {
        int len = s.length();
        int maxLen = 0;
        String res = null;
        boolean[][] dp = new boolean[len][len];

        for (int i = len-1; i >=0;i--)
            for (int j = i; j< len;j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j-i<3 || dp[i+1][j-1]==true);
                if (dp[i][j] == true && (res == null || j-i+1 > maxLen)){
                    res = s.substring(i,j+1);
                    maxLen = res.length();
                }
            }
            return res;
    }
//    public String reverse(String s) {
//        int i = 0;
//        int j = s.length()-1;
//        StringBuffer sb = new StringBuffer();
//        for (;j>i;j--) {
//            sb.append(s.charAt(j));
//        }
//        return sb.toString();
//
//    }
//    public String findCommonSubString(String s1, String s2) {
//        s1.
//    }
}

public class No5 {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return Json.value(input).toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            String ret = new Solution().longestPalindrome(s);

            String out = (ret);

            System.out.print(out);
        }
    }
}