/*
给定一个 N 叉树，返回其节点值的前序遍历。
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


//递归方法：
class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        if(root==null) return list;
        list.add(root.val);
        for(Node child:root.children){
            preorder(child);
        }
        return list;
    }
}

//非递归方法
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        if(root==null) return list;
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            list.add(node.val);
			//栈后入先出的特性
            for(int i=node.children.size()-1;i>=0;i--){
                stack.push(node.children.get(i));
            }
        }
        return list;
    }
}