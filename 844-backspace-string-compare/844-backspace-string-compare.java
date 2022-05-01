class Solution {
    public boolean backspaceCompare(String s, String t) {
        String ansS = removeSpace(s);
        String ansT = removeSpace(t);
            
            if(ansS.equals(ansT)){
                    return true;
            }else{
                    return false;
            }
    }
        
        public String removeSpace(String s){
                Stack<Character> st = new Stack<>();
                for(int i=0;i<s.length();i++){
                        if(s.charAt(i) == '#'){
                                if(!st.isEmpty())
                                st.pop();
                        }else{
                              st.push(s.charAt(i));  
                        }
                }
                String ans = "";
                while(!st.isEmpty())
            ans += st.pop();
                return ans;
        }
}
