class Solution {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == k) return true;

            // Handle duplicates: if left, mid, and right are all equal, we can't shrink from one side
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            } 
            // Left half is sorted
            else if (nums[left] <= nums[mid]) {
                if (nums[left] <= k && k < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // Right half is sorted
            else {
                if (nums[mid] < k && k <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}