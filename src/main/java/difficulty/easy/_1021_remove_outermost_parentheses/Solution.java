package difficulty.easy._1021_remove_outermost_parentheses;

import annotation.topics.Stack;

public class Solution {
    //(()()) (())
    //121210
    @Stack
    public String removeOuterParentheses(String S) {
        int stackFlag = 0;//充当栈的标志位
        char[] s = S.toCharArray();
        StringBuffer buffer = new StringBuffer();
        int start=0;
        int end = 0;
        for (int i = 0; i < s.length; i++) {
             if (s[i]=='('){
                 stackFlag++;
             }else{
                 stackFlag--;
             }
             if (stackFlag==0){
                 end = i;
                 if (end-start==1){
                     buffer.append("");
                 }else{
                     buffer.append(S.substring(start+1,end));
                 }
                 start = i+1;
                //(())
             }
        }


        return buffer.toString();
    }

//
//    public String removeOuterParentheses(String S) {
//        StringBuilder sb = new StringBuilder();
//        int level = 0;
//        for (char c : S.toCharArray()) {
//            if (c == ')') --level;
//            if (level >= 1) sb.append(c);
//            if (c == '(') ++level;
//        }
//        return sb.toString();
//    }
//
//    作者：huaouo
//    链接：https://leetcode-cn.com/problems/remove-outermost-parentheses/solution/jian-ji-de-java-shi-xian-by-huaouo/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
