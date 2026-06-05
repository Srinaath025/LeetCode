class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        char[]ch=s.toCharArray();
        st.push(0);
        int count=0;
        for(char c:ch)
        {
            if(c=='(')st.push(0);
            else
            {
                int s1=st.pop();
                int sc=st.pop();
                sc+=(s1==0)?1:2*s1;
                st.push(sc);
            }
        }

        return st.pop();
    }
}