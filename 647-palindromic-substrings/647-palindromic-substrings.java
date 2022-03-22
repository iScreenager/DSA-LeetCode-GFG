class Solution {
    
    public int countSubstrings(String s) {
        int c = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String ss = s.substring(i,j);
                if(isPalindrome(ss)==true){
                    c++;
                }
                  }
        }
        return c;
        
    }
    
    public static boolean isPalindrome(String ss){
        int i=0;
        int j=ss.length()-1;
        while(i<=j){
            if(ss.charAt(i)!=ss.charAt(j)){
                return false;}
             i++;
        j--;
        }
        return true;
    }
}