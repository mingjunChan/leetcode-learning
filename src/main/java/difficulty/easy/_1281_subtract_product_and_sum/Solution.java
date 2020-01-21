package difficulty.easy._1281_subtract_product_and_sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int subtractProductAndSum(int n) {
        int product = 0;
        int sumOfDigits = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (n > 0) {
            list.add(n % 10);
            n = n / 10;
        }

        product = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            product = list.get(i) * product;
        }

        sumOfDigits = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sumOfDigits = list.get(i) + sumOfDigits;
        }
        int result = 0;
        result = product - sumOfDigits;

        return result;
    }
//官方题解简便算法

    public int subtractProductAndSumByLeetcode(int n) {
        int sum = 0 ; int product = 1;
        while (n>0){
            int digit = n%10;
            product*=digit;
            sum+=digit;
            n/= 10;
        }
return product - sum;

    }


}
