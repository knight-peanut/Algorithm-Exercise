//解法一：toBinaryString(x^y)方法
//代码量少，运行速度较慢
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.toBinaryString(x^y).replaceAll("0","").length();
    }
}

//解法二：循环判断
//运行速度快
class Solution {
    public int hammingDistance(int x, int y) {
        int res = x ^ y;
        int count = 0;
        while(res != 0){
            if((res & 1) == 1){
                count++;
            }
            res = res >> 1;
        }
        
        return count;
    }
}