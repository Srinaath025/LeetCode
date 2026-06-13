class Solution {
    public boolean closeStrings(String word, String word1) {
        if(word.length()!=word1.length()) return false;
        HashMap<Character,Integer>hp=new HashMap<>();
        HashMap<Character,Integer>hp1=new HashMap<>();
        for(char ch:word.toCharArray())
        {
            hp.put(ch,hp.getOrDefault(ch,0)+1);
        }
        for(char ch1:word1.toCharArray())
        {
            hp1.put(ch1,hp1.getOrDefault(ch1,0)+1);
        }

        if(!hp.keySet().equals(hp1.keySet())) return false;
        List<Integer>l=new ArrayList<>(hp.values());
        List<Integer>l1=new ArrayList<>(hp1.values());
        Collections.sort(l);
        Collections.sort(l1);
        return l.equals(l1);
        

        
    }
}