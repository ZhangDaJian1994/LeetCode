//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.text.DecimalFormat;
//
//class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int len1 = nums1.length;
//        int len2 = nums2.length;
//
//
//    }
//}
//
//public class No4 {
//    public static int[] stringToIntegerArray(String input) {
//        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        if (input.length() == 0) {
//            return new int[0];
//        }
//
//        String[] parts = input.split(",");
//        int[] output = new int[parts.length];
//        for(int index = 0; index < parts.length; index++) {
//            String part = parts[index].trim();
//            output[index] = Integer.parseInt(part);
//        }
//        return output;
//    }
//
//    public static String doubleToString(String input) {
//        return new DecimalFormat("0.00000").format(input);
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            int[] nums1 = stringToIntegerArray(line);
//            line = in.readLine();
//            int[] nums2 = stringToIntegerArray(line);
//
//            double ret = new Solution().findMedianSortedArrays(nums1, nums2);
//
//            String out = doubleToString(ret);
//
//            System.out.print(out);
//        }
//    }
//}