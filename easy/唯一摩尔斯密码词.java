//解法:利用Set的集合特性处理
class Solution {
    private static String[] morse = {
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
        };
    public int uniqueMorseRepresentations(String[] words) {
        if (words == null) return 0;
        HashSet<String> set = new HashSet<String>();
        StringBuilder sb = new StringBuilder();
		//forEach的形式，取出数组元素赋值给s，直到取完为止
        for (String s : words) {
            for (char c : s.toCharArray()) {
		//morse[c - 'a']是取出匹配在morse以'a'为开始的c所在的位置的字符串
                sb.append(morse[c - 'a']);
            }
		//往集合里添加StringBuilder类对象sb的字符串型内容
            set.add(sb.toString());
		//循环结束之后将sb的值删除来方便sb对象的重复使用
            sb.delete(0, sb.length());
        }
		//返回得到集合的size即为所求答案
        return set.size();
    }
}