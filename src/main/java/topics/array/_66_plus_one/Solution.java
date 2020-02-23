package topics.array._66_plus_one;

public class Solution {
    public int[] plusOne(int[] digits) {
        int flag = 0,plusNum=1;//进位
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]+flag+plusNum!=10){
                digits[i]++;
                return digits;
            }else{
                plusNum=0;
                flag=1;
                digits[i]=0;
            }

        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
