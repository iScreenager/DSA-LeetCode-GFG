class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        // enumerate all possible number i
        for (int x = 0; x <= nums[len - 1]; x++) {
            // find the first index that nums[idx] >= i
            int idx = findFirstGreaterOrEqual(x, nums);
            if (len - idx == x) {
                return x;
            }
        }
        return -1;
    }

    private int findFirstGreaterOrEqual(int target, int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (nums[left] >= target) {
            return left;
        }
        return right; // whether right >= target or right > target
    }
}