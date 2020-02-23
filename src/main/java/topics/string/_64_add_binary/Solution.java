package topics.string._64_add_binary;

public class Solution {
    //使用语言的内置函数
    public String addBinary1(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    public String addBinary(String a, String b) {
        String result = null;
        int aLength = a.length();
        int bLength = b.length();
        if (aLength < bLength) return addBinary(b,a);

        int temp = 0;//进位
        StringBuffer buffer = new StringBuffer();
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int index = 0;
        for (int i = aLength - 1; i >= 0; i--) {
            if (aChars[i]=='1'){
                index++;
            }
            if (--bLength>=0&&bChars[bLength]=='1'){
                index++;
            }
            buffer.append(index%2);
            index/=2;
        }
        if (index==1){
            buffer.append(1);
        }
        return buffer.reverse().toString();
    }
}