class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int a = num1.length()-1;
        int b = num2.length()-1;
        StringBuilder ans = new StringBuilder();
        while(a>=0 && b>=0){
            int sum = (num1.charAt(a)-'0')+(num2.charAt(b)-'0')+carry;
            carry = sum/10;
            ans.append(sum%10);
            a--;
            b--;
            
            
        }
        while(a>=0){
            int sum = (num1.charAt(a)-'0')+carry;
            carry = sum/10;
            ans.append(sum%10);
            a--;
         
            
        }
         while(b>=0){
            int sum = (num2.charAt(b)-'0')+carry;
            carry = sum/10;
            ans.append(sum%10);
            b--;
         
            
        }
         while(carry!=0){
            int sum = carry;
            carry = sum/10;
            ans.append(sum%10);
         
         
            
        }
        return ans.reverse().toString();
        
        
        
    }
}