class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> map = new HashMap<>();
      if(s.length() != t.length()){
        return false;
      }
      for(char c1: s.toCharArray()){
        map.put(c1,map.getOrDefault(c1,0)+1);
      }

      for(char ch : t.toCharArray()){
        if(!map.containsKey(ch)){
            return false;
        }
        map.put(ch,map.get(ch)-1);
        if(map.get(ch) == 0){
            map.remove(ch);
        }
      }
      
    return map.isEmpty();


    }
}
