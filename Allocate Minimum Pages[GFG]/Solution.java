class Solution {

    int max_arr(int arr[]) {
        int max = arr[0];
        for (int x : arr) {
            if (max < x)
                max = x;
        }
        return max;
    }

    long sum_arr(int arr[]) {
        long sum = 0;
        for (int x : arr)
            sum += x;
        return sum;
    }

    boolean isValid(int arr[], int k, long max_page) {

        int student = 1;
        long sum = 0;   

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > max_page) {
                student++;
                sum = arr[i];
            }

            if (student > k)
                return false;
        }

        return true;
    }

    public int findPages(int[] arr, int k) {

        if (k > arr.length)
            return -1;

        long s = max_arr(arr);
        long e = sum_arr(arr);
        long res = -1; 

        while (s <= e) {

            long mid = s + (e - s) / 2;

            if (isValid(arr, k, mid)) {
                res = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return (int) res;
    }
}