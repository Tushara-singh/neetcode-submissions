class Solution {
    public int[] twoSum(int[] nums, int target) {
        // a+b=7
        // b=7-a;
    HashMap<Integer,Integer> seen = new HashMap<>();
  
     for(int i = 0;i<nums.length;i++){
       int num = target - nums[i];
       if(seen.containsKey(num)){
        int j = seen.get(num);
        return new int[]{Math.min(i,j),Math.max(i,j)};

       }
       seen.put(nums[i],i);
     }
     return new int[]{-1,-1};
}
}