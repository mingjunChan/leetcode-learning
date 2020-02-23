package topics.string;

import org.junit.Test;
import topics.string._64_add_binary.Solution;

public class TestSolution {

    @Test
    public void test64() {
        Solution solution = new Solution();
        // System.out.println(solution.addBinary1("11","1"));

        System.out.println(solution.addBinary("1010", "1011"));

    }

    @Test
    public void test28(){
        topics.string._28_implement_strstr.Solution solution = new topics.string._28_implement_strstr.Solution();
            System.out.println(solution.strStr("mississippi",
                    "sippia"));
    }

}
