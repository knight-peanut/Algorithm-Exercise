//题解一：String replace()方法
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}

//题解二: 利用StingBuilder类
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                str.append("[");
                str.append(".");
                str.append("]");
           }else{
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }
}

