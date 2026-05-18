class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //k=2//
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
      
        }
        //converting map to list
        // List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        // //descending order
        // Collections.sort(list,(e1,e2)->e2.getValue().compareTo(e1.getValue()));
        // int[] arr = new int[k];
        // for(int i = 0 ;i<k;i++){
        //     arr[i] = list.get(i).getKey();
        // }
        return map.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
        .limit(k).mapToInt(entry->entry.getKey()).toArray();
        
     
        
    }
}
