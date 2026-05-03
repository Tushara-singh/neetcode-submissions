class Solution {
    public boolean hasDuplicate(int[] nums) {

    //     for(int i = 0 ;i<nums.length-1;i++){
    //         for(int j = i+1;j<nums.length;j++){
    //             if(nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }

    //     }
    // return false;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int n : nums){
        map.put(n,map.getOrDefault(n,0)+1);

    }

    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue()>1){
            return true;

        }
    }
    return false;
        
    }
}