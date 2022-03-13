class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int count =0;
        for(int i =0 ;i<nums1.length;i++){
            while(count<nums2.length){
                if(nums1[i]==nums2[count]){
                    list.add(nums2[count]);
                    count++;
                    break;
                }
                else if(nums1[i]<nums2[count]){
                    break;
                    
                }
                else{
                    count++;
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i =0 ;i < list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
        
        
        
    }
    
}
