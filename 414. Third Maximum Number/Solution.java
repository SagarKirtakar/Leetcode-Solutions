class Solution {
    public int thirdMax(int[] nums) {
        
        int count = 1;

        for(int i=0; i<nums.length; i++) {
            for(int j = i + 1; j<nums.length; j++) {
                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int k=nums.length-2; k>=0; k--) {
            if(nums[k] != nums[k+1]) count++;
            if(count == 3) return nums[k];
        }
        return nums[nums.length-1];
    }
}