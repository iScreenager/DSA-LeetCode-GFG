class Solution {
    public boolean judgeSquareSum(int c) {
             long l = 0;
        long r = (long) Math.sqrt(c);
        // System.out.println(r);
        while(l <= r) {
            long sum = l * l + r * r;
            if (sum == c) {
                return true;
            }
            else if (sum > c) {
                r--;
            } else {
                l++;
            }
        }
        return false;
        
    }
}