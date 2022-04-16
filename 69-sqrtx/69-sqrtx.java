class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        
        int s = 1;
        int e = x/2;
        
        while(s < e){
            int mid = (s+(e-s)/2)+1;
            
          int div = x/mid;
            if(div == mid) return mid;
            if(div > mid) s = mid;
            else e = mid-1;
        }
        return s;
        
    }
}