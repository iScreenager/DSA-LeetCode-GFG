class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int res = 0;
        /*
            Approach : 
            Sort the second array first, so that we can effectively search 
            for the element we are searching for.
            
            Now, if mid == target or mid is atmost d distance apart, then we 
            should stop searching, as we found an element, 
            otherwise standard binary search, shorten our scope depending upon
            element is higher or lower.
            
            if no element found, then just do res++
            
        */
        for(int i : arr1){
            int low = 0;
            int high = arr2.length - 1;
            boolean found = false;
            
            while(low <= high){
                int mid = low + (high - low) / 2;
                if(arr2[mid] == i || Math.abs(arr2[mid] - i) <= d){
                    found = true;
                    break;
                }
                else if(arr2[mid] > i)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            
            if(!found)
                res++;
        }
        
        return res;
    }
}