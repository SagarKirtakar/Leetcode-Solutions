class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int s = 0 , e = nums.length-1;

        while(s<=e) {
            int mid = s + (e - s)/2;

            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) {
                return mid;
            }else if(nums[mid] < nums[mid+1]){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return -1;
    }
}