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
    Set<Integer> seen = new HashSet<>();
    for(int n : nums){
        if(seen.contains(n)){
            return true;
        }
        seen.add(n);
    }
    return false;
    }
}