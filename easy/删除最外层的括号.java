class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder str = new StringBuilder ();
        Stack<Character> stack = new Stack<>(); 
	//记录原语的开始和结束标志
        int start = 0,end = 0;
        boolean flag = false;
        
        for(int i=0;i<S.length();i++){
		//遇到左括号，入栈
            if(S.charAt(i)=='('){
                stack.push(S.charAt(i));
                if(!flag){
		//记录下开始的位置
                    start = i;
                    flag = true;
                }
            }
            
            if(S.charAt(i)==')'){
		//遇到右括号，出栈
                stack.pop();
                if(stack.isEmpty()){
                    end = i;
		//将去掉括号的原语追加到str
                    str.append(S.substring(start + 1,end));
                    flag = false;
		//重新开始下一个原语的检测
                    start = end;
                }
            }
        }
        return str.toString();
    }
}

