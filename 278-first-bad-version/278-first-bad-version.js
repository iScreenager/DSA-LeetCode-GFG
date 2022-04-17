/**
 * Definition for isBadVersion()
 * 
 * @param {integer} version number
 * @return {boolean} whether the version is bad
 * isBadVersion = function(version) {
 *     ...
 * };
 */

/**
 * @param {function} isBadVersion()
 * @return {function}
 */
var solution = function(isBadVersion) {
    /**
     * @param {integer} n Total versions
     * @return {integer} The first bad version
     */
    return function(n) {
        
        if (isBadVersion(1)) {
		return 1;
	}

        
        let i = 1;
        let j = n;
        
        while(i < j){
            const m = Math.floor(i+(j-i)/2)+1;
            
            if(!isBadVersion(m)){
                 i = m;
            }else{
               j = m-1; 
            }
        }
        return j+1;
        
    };
};