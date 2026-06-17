class Solution {
    public void moveZeroes(int[] nums) {

        // j keeps track of the position where the next non-zero element should be placed
        int j = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // If current element is non-zero
            if (nums[i] != 0) {

                // Swap nums[i] with nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // Move j to the next position
                j++;
            }
        }
    }
}