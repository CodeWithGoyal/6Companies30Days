// https://leetcode.com/problems/find-in-mountain-array/class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        int left = 0;
        int right = len -1;
        int peak = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(mid == 0){
                left = mid +1;
                continue;
            }
            if(mid == len - 1){
                right = mid - 1;
                continue;
            }
            int val = mountainArr.get(mid);
            int leftVal = mountainArr.get(mid - 1);
            int rightVal = mountainArr.get(mid + 1);
            if(val > leftVal && val > rightVal){
                 peak = mid;
                break;
            }
            else if(val > leftVal && val < rightVal){
                left = mid+1;
            }
            else if(val < leftVal){
                right = mid -1;
            }
        }
        left = 0;
        right = peak;
        while(left <= right){
            int mid = (left + right) /2;
            int val = mountainArr.get(mid);
            if(target == val){
                return mid;
            }
            else if(target > val){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        left = peak;
        right = len-1;
        while(left <= right){
            int mid = (left + right)/2;
            int val = mountainArr.get(mid);
            if(val == target) return mid;
            else if(target > val){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        // System.out.println(peak);
        return -1;
    }
}