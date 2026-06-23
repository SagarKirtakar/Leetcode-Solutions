class Solution {

    int binary_search(int nums[], int target, boolean flag) {
        int s = 0, e = nums.length-1;

        int res = -1;

        while(s <= e) {
            int mid = s + (e - s) / 2;

            if(nums[mid] == target) {
                res = mid;
                if(flag) {
                    e = mid - 1;
                }else {
                    s = mid + 1;
                }
            }else if(nums[mid] > target) {
                e = mid - 1;
            }else {
                s = mid + 1;
            }

        }
        return res;
    }

    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = binary_search(nums,target,true);
        res[1] = binary_search(nums,target,false);
        return res;
    }
}