class Solution {
    public int numJewelsInStones(String J, String S) {
        int jewel =0;
        Set<Character> set = new HashSet<> ();
		for (int i=0;i<J.length();i++)
		{
			char a = J.charAt(i);
			set.add(a);
		}


		for (int j=0;j<S.length();j++)
		{
			char a = S.charAt(j);
			if (set.contains(a))
			{
				jewel++;
			}
		}
        return jewel;
    }
}
