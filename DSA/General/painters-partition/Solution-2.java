class Solution {
    public int paint(int A, int B, int[] C) {
        long low = 0;
        long high = 0;

        // 1. Set search bounds in terms of board length first (avoids repeated * B inside the loop)
        for (int len : C) {
            low = Math.max(low, len);
            high += len;
        }

        long ans = high;

        // 2. Binary search on the maximum board length assigned to any single painter
        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canPaint(A, C, mid)) {
                ans = mid;
                high = mid - 1; // Try to minimize the maximum board length further
            } else {
                low = mid + 1;  // Need more capacity per painter
            }
        }

        // 3. Multiply by time per unit B and apply modulo at the very end
        long mod = 10000003L;
        return (int) (((ans % mod) * (B % mod)) % mod);
    }

    private boolean canPaint(int A, int[] C, long maxLen) {
        int count = 1;
        long total = C[0];

        for (int i = 1; i < C.length; i++) {
            if (total + C[i] > maxLen) {
                count++;
                total = C[i];
                if (count > A) {
                    return false; // Early exit once painters exceed A
                }
            } else {
                total += C[i];
            }
        }

        return count <= A;
    }
}