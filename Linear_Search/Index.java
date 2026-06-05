public class Index {
    
    public static int linear_search(int nums[] , int target) {

        int n = nums.length;

        for(int i=0; i<n; i++) {

            if(nums[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {10,0,-1,5,-7,33,9};

        int target = -77;
        int result = linear_search(nums,target);

        if(result != -1) {
            System.out.println("Target found at index: "+result);
        }else {
            System.out.println("Target not found..?");
        }
    }
}
