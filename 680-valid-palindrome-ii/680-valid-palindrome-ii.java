class Solution {
    public boolean validPalindrome(String s) {
        int c1 = 0;
        int c2 = 0;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                
                i++;
                j--;
            }else{
                c1++;
                j--;
            }
            
        }
         i=0;
         j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                
                i++;
                j--;
            }else{
                c2++;
                i++;
            }
            
        }
      
     return c1>1 && c2>1?false:true;
        
    }
}