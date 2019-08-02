/*
自除数 是指可以被它包含的每一位数除尽的数。
例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
还有，自除数不允许包含 0 。
给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
示例 1：
输入： 
上边界left = 1, 下边界right = 22
输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]。
*/








class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> mylist = new LinkedList<>();
        for(;left<=right;left++){
            if(findAns(left))
                mylist.add(left);       
        }
        return mylist;
    }
    
     private boolean findAns(int left) {
        boolean flag = true;
        char[] chArray = String.valueOf(left).toCharArray();
        int[] digits = new int[chArray.length];
        for (int j = 0; j < chArray.length; j++) {
            digits[j] = Character.getNumericValue(chArray[j]);
            if (digits[j] == 0) { 
                flag = false;
                break;
            }
            if (left % digits[j] != 0) { 
                flag = false;
                break;
            }
        }
        return flag;
    }
}