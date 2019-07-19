class Solution {
    public int numJewelsInStones(String J, String S) {
        int jLength = J.length();
        int sLength = S.length();
        int sum =0;
        for (int i=0;i<jLength;i++)
        {
            for (int j=0;j<sLength;j++)
            {
                if(J.charAt(i)==S.charAt(j))
                    sum++;
            }
        }
        return sum;
    }
}
