class Solution {
    public boolean backspaceCompare(String s, String t) {
        String ansS =  checkBackSpace(s); 
        String ansT =  checkBackSpace(t);
            
            if(ansS.equals(ansT)){
                    return true;
            }else{
                    return false;
            }
    }
        
        public String checkBackSpace(String str){
                Stack<Character> st = new Stack<>();
                for(int i=0;i<str.length();i++){
                        if(str.charAt(i) == '#'){
                                if(!st.isEmpty())
                                
                                st.pop();
                        }else{
                              st.push(str.charAt(i));  
                        }
                }
                
                String ans = "";
                while(!st.isEmpty())
            ans += st.pop();
                return ans;
        }
}
