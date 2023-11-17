 import java.util.Arrays;

public record J_Minimize_maximumpairsum() {
   
    public static int minMaxPairSum(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Initialize pointers for the smallest and largest elements
        int left = 0;
        int right = nums.length - 1;

        // Initialize the maximum pair sum
        int maxPairSum = 0;

        // Pair up the elements and calculate the maximum pair sum
        while (left < right) {
            int pairSum = nums[left] + nums[right];
            maxPairSum = Math.max(maxPairSum, pairSum);

            // Move pointers
            left++;
            right--;
        }

        return maxPairSum;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums1 = {3, 5, 2, 3};
        System.out.println(minMaxPairSum(nums1));  // Output: 7

        int[] nums2 = {3, 5, 4, 2, 4, 6};
        System.out.println(minMaxPairSum(nums2));  // Output: 8
    }
}

