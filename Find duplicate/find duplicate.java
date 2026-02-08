public class Main {

    // Method to find duplicate number
    public static int findDuplicate(int[] nums) {

        // Step 1: Initialize two pointers
        int slow = nums[0];        // slow pointer moves 1 step
        int fast = nums[0];        // fast pointer moves 2 steps

        // Step 2: Detect cycle
        do {
            slow = nums[slow];        // move slow by 1 step
            fast = nums[nums[fast]];  // move fast by 2 steps
        } while (slow != fast);       // loop until they meet

        // Step 3: Find entrance of the cycle
        slow = nums[0];               // reset slow to start

        // Move both pointers 1 step at a time
        while (slow != fast) {
            slow = nums[slow];        // move slow by 1
            fast = nums[fast];        // move fast by 1
        }

        // Both pointers now point to duplicate number
        return slow;
    }

    public static void main(String[] args) {

        // Input array (numbers from 1 to n-1 with one duplicate)
        int[] nums = {1, 3, 4, 2, 2};

        // Print duplicate
        System.out.println(findDuplicate(nums));
    }
}
