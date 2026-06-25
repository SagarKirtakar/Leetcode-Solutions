class Solution {

    int pivotIndex(int nums[]) {

        int s = 0, e = nums.length - 1;
        int N = nums.length;
        int prev = 0; 
        int next = 0;
        int mid = 0;

        while(s<=e) {
            mid = s + (e - s) / 2;
            prev = (mid + N - 1) % N;
            next = (mid + 1) % N;

            if(nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                return mid;
            }else if(nums[mid] >= nums[0]) 
                 s = mid + 1;
            else  
                e = mid - 1;
        }

        return mid;
    }


    int Binary_Search(int nums[], int start, int end,int target) {

       while(start <= end) {
        int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] > target) {
                end = mid - 1;
            }else {
                start =  mid + 1;
            }
       }
        return -1;  
    }
    
    public int search(int[] nums, int target) {
        
        int index = pivotIndex(nums);
        int left = Binary_Search(nums, 0, index - 1, target);
        int right = Binary_Search(nums, index + 1, nums.length - 1, target);

        if(nums[index] == target) {
            return index;
        }else {
            if(left >= 0) {
                return left;
            }else {
                return right;
            }
        }
    
    }
}