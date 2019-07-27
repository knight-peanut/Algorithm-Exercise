//解题思路：利用题目特有的左右对称减一规则遍历数组解题
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int temp = 0;
        for(int i = 0; i < A.length; i++){
            int left = 0; 
            int right = A[0].length-1;
            while(left < right){
                temp = A[i][left];
				//启用规则
                A[i][left] = 1 - A[i][right];
                A[i][right] = 1 - temp;
                left++;
                right--;
            }
            if(left == right) A[i][left] = 1 - A[i][left];
        }
        return A;
    }
}
