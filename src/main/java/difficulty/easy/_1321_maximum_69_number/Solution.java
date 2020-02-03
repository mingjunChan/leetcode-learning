package difficulty.easy._1321_maximum_69_number;

public class Solution {

    public int maximum69Number(int num)
    {

        String s = Integer.toString(num);
        System.out.println(s);
        s = s.replaceFirst("6","9");
        return Integer.valueOf(s);

    }
    /*{
        int result = num;
        int number = 0;

        int n = 0;
        while (num > 0) {
            if (num % 10 == 6) {
                number = 3 * (int) Math.pow(10, n);
            }
            num /= 10;
            n++;

        }
        result = result + number;
        return result;
    }*/
}
