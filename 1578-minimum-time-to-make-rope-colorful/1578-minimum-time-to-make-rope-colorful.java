class Solution {
  public int minCost(String colors, int[] neededTime) {

    int n=neededTime.length;
    int i=0;
    int ans=0;
    
    while(i<n){
        int j=i+1;
        
        int mintime=neededTime[i];
        
        while(j<n && colors.charAt(i)==colors.charAt(j)){
            if(mintime<=neededTime[j]){
                ans+=mintime;
                mintime=neededTime[j];
            }
            else{
                ans+=neededTime[j];
            }
            j++;
        }
        i=j;
    }
    return ans;
}
}