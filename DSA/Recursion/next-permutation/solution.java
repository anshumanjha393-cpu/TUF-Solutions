
class Solution {
    public int[] nextPermutation(int[] A) {
        int idx = -1;
        int n = A.length;

        
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                idx = i;
                break;
            }
        }

        
        if (idx == -1) {
            reverse(A, 0, n - 1);
            return A;
        }

        
        for (int i = n - 1; i > idx; i--) {
            if (A[i] > A[idx]) {
                int temp = A[i];
                A[i] = A[idx];
                A[idx] = temp;
                break;
            }
        }

        
        reverse(A, idx + 1, n - 1);

        return A;
    }

    private void reverse(int[] A, int left, int right) {
        while (left < right) {
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;

            left++;
            right--;
        }
    }
}
