package topics.string._28_implement_strstr;

public class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        if (haystack.length()==1&&needle.length()==1){
            if (needle.equals(haystack)) return 0;
            return -1;
        }
        if (haystack.length()<needle.length()){
            return -1;
        }

        int index = -1;
        for (int i = 0; i < haystack.length() - 1; i++) {

            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }
            index = i;
            for (int j = i,k=0; k < needle.length() ; j++,k++) {

                if (j==haystack.length()||haystack.charAt(j) != needle.charAt(k)) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) break;

        }
        return index;
    }

}
