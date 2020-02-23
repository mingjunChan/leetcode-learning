package topics.string._344_reverse_string;



public class Solution {

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            s = swap(s, i, j);
            i++;
            j--;
        }

    }

    private char[] swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        return s;
    }
}
