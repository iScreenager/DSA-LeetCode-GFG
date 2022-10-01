class Solution {
    public int numDecodings(String s) {
        //dp[i] will store the number of ways to decode the String s.substring(i).
        Integer[] dp = new Integer[s.length()];
        
        return numDecodingsHelper(0, s, dp);
    }
    
    public int numDecodingsHelper(int idx, String s, Integer[] dp) {
        int n = s.length();
        //When the call will be made by standing at last index, meaning idx is equal to n now, so return 1. 
		//As String of length one has 1 way to decode it.
        if (idx == n) {
            return 1;
        }
        
        //If character at idx is 0, then return 0, as '0' or '0d'(where d is between 1 and 9) is invalid and 
		//cannot be mapped to a character.
        if (s.charAt(idx) == '0') {
            return 0;
        }
        
        //If dp[idx] is not null, meaning it already contains the number of ways to decode the 
		//String s.substring(idx), so return it.
        if (dp[idx] != null) {
            return dp[idx];
        }
        
        //If one digit is taken.
        int count = numDecodingsHelper(idx + 1, s, dp);
        
        //If two digits are taken.
        //If idx is less than or equal to second last position, then only a call can be made.
        if (idx < n - 1) {
            //If char at index idx is '1', meaning digits formed can be between '10' and '19' or if char at 
			//index idx is '2' and it's next char value is less than '7', meaning digits formed can be between 
			//'20' and '26', then only make the call.
            if (s.charAt(idx) == '1' || s.charAt(idx) == '2' && s.charAt(idx + 1) < '7') {
                count += numDecodingsHelper(idx + 2, s, dp);
            }
        }
        
        //Store the count in dp[idx] before returning it so that call is not made again for index idx.
        dp[idx] = count;
        
        return count;
    }
}