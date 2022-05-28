class Solution {
    public List<List<String>> partition(String s) {
           List<List<String>> outer = new ArrayList<>();
            List < String > inner = new ArrayList < > ();
            helper(0,s,outer,inner);
            return outer;
        
    }
         void helper(int idx,String s,List<List<String>> outer, List<String> inner){
                if(idx==s.length()){
                        outer.add(new ArrayList<>(inner));
                        return;
                }
                
                for(int i=idx;i<s.length();++i){
                        if(isPalindrome(s,idx,i)){
                                inner.add(s.substring(idx,i+1));
                                helper(i+1,s,outer,inner);
                                inner.remove(inner.size()-1);
                        }
                }
        }
         boolean isPalindrome(String s, int start, int end){
                while(start <= end){
                        if(s.charAt(start++) != s.charAt(end--)){
                                return false;
                        }
                        
                }
                return true;
        }
}