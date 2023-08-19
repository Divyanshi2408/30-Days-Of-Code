class Solution {
    public String decodeString(String s) {
        Stack<Integer> numstack = new Stack<>();
        Stack<StringBuilder> strstack = new Stack<>();
        StringBuilder str = new StringBuilder();
        int num = 0;
        for(char c: s.toCharArray()){
            if(c >='0' && c <= '9'){
                num = num*10 +c-'0';
            }
            else if(c == '['){
                strstack.push(str);
                str = new StringBuilder();
                numstack.push(num);
                num = 0;
            }
            else if(c == ']'){
               StringBuilder temp = str;
               str = strstack.pop();
               int count = numstack.pop();
               while(count-->0){
                   str.append(temp);
               } 
            }
            else{
                 str.append(c);
            }
        }
        return str.toString();
    }
}