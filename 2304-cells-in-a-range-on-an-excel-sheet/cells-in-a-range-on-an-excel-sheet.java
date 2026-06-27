class Solution {
    public List<String> cellsInRange(String s) {
        List<String>ll=new ArrayList<>();
        char a=s.charAt(0);
        char b=s.charAt(1);
        char c=s.charAt(3);
        char d=s.charAt(4);
        for(char i=a;i<=c;i++)
        {
            for(char j=b;j<=d;j++)
            {
                ll.add(""+i+j);
            }
        }
        return ll;
    }
}