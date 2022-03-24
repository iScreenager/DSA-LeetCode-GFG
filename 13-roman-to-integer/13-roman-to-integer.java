class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i) ;
            int val = getVal(a);
            if(i<s.length()-1 && val<getVal(s.charAt(i+1))){
                val = getVal(s.charAt(i+1)) - val;
                i++;
            }
            ans+= val;

        }
        return ans;
        
    }
     public int getVal(char str){
        if(str=='I'){
            return 1;
        }
        if(str=='V'){
            return 5;
        }
        if(str=='X'){
            return 10;
        }
        if(str=='L'){
            return 50;
        }
        if(str=='C'){
            return 100;
        }
        if(str=='D'){
            return 500;
        }
        if(str=='M'){
            return 1000;
        }
         return 0;
    }
}