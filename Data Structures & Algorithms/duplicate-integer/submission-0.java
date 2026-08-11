class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        for(int s:map.values()){
            System.out.println(s);
            if(s>1)
             return true;
        }
        return false;
        
    }
}