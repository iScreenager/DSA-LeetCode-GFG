class Solution {
    public int[][] merge(int[][] intervals) {
            
        if(intervals.length == 1) return intervals;
            
            Arrays.sort(intervals,(a, b) -> Double.compare(a[0], b[0]));
            
            ArrayList<int[]> result = new ArrayList<>();
            
            int[] newInterval = intervals[0];
            result.add(newInterval);
            
            for(int[] i:intervals){
                   if(i[0] <= newInterval[1]){
                           newInterval[1] = Math.max(newInterval[1],i[1]);
                           
                   } 
                    else{
                            newInterval=i;
                            result.add(newInterval);
                            
                    }
            }
            return result.toArray(new int[result.size()][]);
    }
}