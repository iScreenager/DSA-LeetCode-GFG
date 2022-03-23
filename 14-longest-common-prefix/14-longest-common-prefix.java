class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
        String s = strs[0];
        String e = strs[strs.length-1];
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i)==e.charAt(i)){
                i++;
            }else{
                break;
            }
        }
     return i==0?"":s.substring(0,i);
        
    }
}