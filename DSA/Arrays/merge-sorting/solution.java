class Solution {
    public int[] mergeSort(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergesort(int[] nums, int left, int right) {
        if (left >= right) return;                 // fix 1: base case
        int mid = left + (right - left) / 2;       // fix 2: parentheses
        mergesort(nums, left, mid);
        mergesort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {              // fix 5: <= keeps it stable
                temp[k] = nums[i];
                i++;
                k++;
            } else {
                temp[k] = nums[j];
                j++;
                k++;
            }
        }

        // fix 3: leftovers go AFTER the loop (only one of these runs)
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // fix 4: copy back into the original array
        for (k = 0; k < temp.length; k++) {
            nums[left + k] = temp[k];
        }
    }
}