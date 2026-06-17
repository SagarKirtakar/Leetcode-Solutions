class Solution {
    public int[] plusOne(int[] digits) {

        // Start checking from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, simply add 1
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Return updated array
            }

            // If digit is 9, make it 0 and carry 1 to the previous digit
            digits[i] = 0;
        }

        // If all digits were 9 (e.g., 999 -> 1000)
        int[] ans = new int[digits.length + 1];

        // Put 1 at the beginning
        ans[0] = 1;

        return ans;
    }
}