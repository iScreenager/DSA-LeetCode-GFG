/**
 * @param {number} num
 * @return {boolean}
 */
var isPerfectSquare = function(num) {
    var s = 1;
        var e = num;
        
        while(s<=e){
            const mid = Math.floor(s+(e-s)/2);
            
            var t = mid*mid;
            
            if(t==num){
                return true;
            }else if(t>num){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return false;
   
    
};