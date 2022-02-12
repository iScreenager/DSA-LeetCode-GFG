class Solution {
           static String[] mob={"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }else{
            return letterCombinationsHelper(digits);
        }
        
    }
    public List<String> letterCombinationsHelper(String digits) {
         
        if(digits.length() == 0){
            List<String> bcode = new ArrayList<>();
           bcode.add("");
            return bcode;
        }
        
        char ch = digits.charAt(0);
      String temp = digits.substring(1);
        List<String> cdigits = letterCombinationsHelper(temp);
       
         List<String> mstr = new ArrayList<>();
        String chmob = mob[ch-'0'];
        for(int i=0;i<chmob.length();i++){
            char chInCode = chmob.charAt(i);
            for(String j: cdigits){
                mstr.add(chInCode+j);
            }
           
        }
        return mstr;
    }
}