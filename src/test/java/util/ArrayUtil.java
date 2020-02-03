package util;

/**
 * 创建测试数据用的工具类
 */
public class ArrayUtil {
    /*
    11110
    11010
    11000
    00000
    1 island；
    */
    public static char[][] createNUmberOfIslandCharArray1() {
        return new char[][]{

                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}

        };

    }

    /*
11000
11000
00100
00011
    3 island；
    */
    public static char[][] createNUmberOfIslandCharArray2() {
        return new char[][]{

                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}

        };

    }

    public static char[][] createNUmberOfIslandCharArray3() {
        return new char[][]{

                {'1', '0', '1', '1', '0', '1', '1'}

        };

    }

    public static char[][] createNUmberOfIslandCharArray4() {
        return new char[][]{

                {'1'}, {'1'}

        };

    }
}
