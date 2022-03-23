/**
 * @param {string} s
 * @return {boolean}
 */
var validPalindrome = function(s) {
    let i = 0;
    let j = s.length-1;
    let c1 = 0;
    let c2 = 0;
    while(i<=j){
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }else{
            c1++;
            i++;
        }
        
    }
    i=0;
    j=s.length-1;
    while(i<=j){
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }else{
            c2++;
            j--;
        }
        
    }
    
   return c1>1 && c2>1? false:true; 
};