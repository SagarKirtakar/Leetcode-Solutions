public class Index {

    // Method to perform Linear Search
    // Returns the index of the target element if found
    // Returns -1 if the target is not present in the array
    public static int linear_search(int nums[], int target) {

        // Get the size of the array
        int n = nums.length;

        // Traverse the array element by element
        for (int i = 0; i < n; i++) {

            // Check if the current element matches the target
            if (nums[i] == target) {

                // Target found, return its index
                return i;
            }
        }

        // Target not found after checking all elements
        return -1;
    }

    public static void main(String[] args) {

        // Input array
        int[] nums = {10, 0, -1, 5, -7, 33, 9};

        // Element to search for
        int target = -7;

        // Call the linear search method
        int result = linear_search(nums, target);

        // Check the returned value
        if (result != -1) {

            // Target found
            System.out.println("Target found at index: " + result);

        } else {

            // Target not found
            System.out.println("Target not found..?");
        }
    }
}