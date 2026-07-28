import java.util.HashMap;

public class A08_LargestSubarrayWithZeroSum {
   public static int LargestSubarrayWithZeroSum(int[] arr) {
      int sum = 0, length = 0;
      HashMap<Integer, Integer> map = new HashMap<>();

      for (int j = 0; j < arr.length; j++) {
         sum += arr[j];
         if (map.containsKey(sum)) {
            length = Math.max(length, j - map.get(sum));
         } else {
            map.put(sum, j);
         }
      }

      return length;
   }

   public static void main(String[] args) {
      int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
      System.out.println(LargestSubarrayWithZeroSum(arr));
   }
}