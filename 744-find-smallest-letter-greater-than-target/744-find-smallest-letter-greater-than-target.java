class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
           int val = target-'a';
        int s = 0;
        int e = letters.length-1;
        while(s <= e){
            int m = s+(e-s)/2;
            
            int ch = letters[m]-'a';
            
            
           if(ch > val){
                e= m-1;
            }else{
                s = m+1;
            }
        }
        return letters[s%letters.length];
    }
}