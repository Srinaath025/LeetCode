class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String ch:strs)
        {
            char []ch1=ch.toCharArray();
            Arrays.sort(ch1);
            String s=new String(ch1);

            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(ch);
        }

        return new ArrayList<>(map.values());
        
    }
}