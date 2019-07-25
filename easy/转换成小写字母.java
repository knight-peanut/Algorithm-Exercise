class Solution {
    public String toLowerCase(String str) {
        StringBuilder st =new StringBuilder();
        for(int i=0;i<str.length();i++){
            if('A'<=str.charAt(i) && str.charAt(i)<='Z'){
                st.append((char)(str.charAt(i)+32));
            }else{
                st.append(str.charAt(i));
            }
               
        }
        return st.toString();
    }
}