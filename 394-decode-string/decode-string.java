class Solution {
    public String decodeString(String s) {
        Stack<Integer>st=new Stack<>();
        Stack<StringBuilder>s1=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int num=0;
        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                num=num*10+(ch-'0');
            }

            else if(ch=='[')
            {
                st.push(num);
                s1.push(sb);
                num=0;
                sb=new StringBuilder();
            }

            else if(ch==']')
            {
                int r=st.pop();
                StringBuilder r1=s1.pop();
                for(int i=0;i<r;i++)
                {
                    r1.append(sb);
                }

                sb=r1;
            }

            else 
            {
                sb.append(ch);
            }
        }

        return sb.toString();
        
    }
}