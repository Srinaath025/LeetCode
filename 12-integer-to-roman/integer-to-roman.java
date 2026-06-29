class Solution {
    public String intToRoman(int num) {
        int []arr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[]arr1={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String s="";

        for(int i=0;i<arr.length;i++)
        {
            while(num>=arr[i])
            {
                s=s+arr1[i];
                num=num-arr[i];
            }
        }

        return s;

        
    }
}