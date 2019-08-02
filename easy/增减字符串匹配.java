/*
给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
如果 S[i] == "I"，那么 A[i] < A[i+1]
如果 S[i] == "D"，那么 A[i] > A[i+1]
并且出现D之后的输出排序要从最大的数开始用

示例 1：
输出："IDID"
输出：[0,4,1,3,2]
示例 2：
输出："III"
输出：[0,1,2,3]
*/


class Solution {
    public int[] diStringMatch(String S) {
        int N = S.length();
		//左右指针数
        int left = 0;
        int right = N;
		//解答输出始终比字符串长度大
        int[] ans = new int[N+1];
		//0~N-1的循环
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='I'){
                ans[i] = left;
                left++;
            }else{
                ans[i] = right;
                right--;
            }
        }
		//最后赋值给第N+1个数
        ans[N] = left;
        return ans;
    }
}