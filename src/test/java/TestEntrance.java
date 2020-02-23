import org.junit.Test;
import topics.array._118_pascals_triangle.Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class TestEntrance {



    @Test
    public void testIntegerNull(){
        Integer a = null;
        Integer b = 1;
        Integer c = 0;
        c = a+b;

        System.out.println();
    }

    private static List<String> getNullFieldList(List<String> nullFiedList) {
        if (nullFiedList==null) {
            return new ArrayList<String>();
        }
        return nullFiedList;
    }

    @Test
    public void test(){
        List<String> nullFiedList = null;
        getNullFieldList(nullFiedList).add("xxx");
        System.out.println(nullFiedList.toString());
    }
    private int[] testint(int[] a){
        int[] b = a;
        b[0] = 0;
        b[1] = 1;
b[2] = 2;
        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i]+" ");
        }
return a;
    }

    @Test
    public void testAll() {
        String cloudUserIds = "0EA4A06F349242B38CC6E60D8219924C\r\n" +
                "2168A14D868A403BBA4EE6D8EF6A00D2\r\n" +
                "28CACDCE3E6946618C19DABF775D2A2B\r\n" +
                "398F7AE24FEA4C0C979C5CE383EAF557\r\n" +
                "3F1F1917C1DA4150BAA0DEC5C9F343C6\r\n" +
                "41C5FE8CB42D42019E1DF08F46F267CB\r\n" +
                "474AF4EF87694A6798BE18FCC4E556A4\r\n" +
                "4784FB2E9AE54C0482C2881E5A86B2E3\r\n" +
                "4C666F13DF9742A5BC33E46B7FB2320B\r\n" +
                "50D7F8618D014719BBAA9DB43BF288F8\r\n" +
                "574EA6A50BFB42C98D34998EEAF85794\r\n" +
                "57CD33C7A3B5437FBE6B25C90571B86B\r\n" +
                "5FCD4E5C6BE14B88B3E7A10965060BFD\r\n" +
                "6A1C351E6C5B42F38A0EB58FB4C7EDBC\r\n" +
                "6CD8EA5E24BA4E85B13D990BE2BA71F9\r\n" +
                "7E9B9EF35F844DD58348FC8114F20900\r\n" +
                "8F5D3697E3034B36AF73CD9DB5544C77\r\n" +
                "946DE7E44C0C4654A8D343A9BB0E995F\r\n" +
                "9F477B51457945D1B26170BB64FAC1C0\r\n" +
                "A8A4C521E8EC485C9FE84FAB0BEC4FA6\r\n" +
                "BD72A6012B654080BC0BAFF27421E211\r\n" +
                "D48ECA60D15943BF9DB009DDC6F8E244\r\n" +
                "DB41659CEF304AA1BB91C25780C543FD\r\n" +
                "E2851672047D430E9FCA812E9D83A190\r\n" +
                "E292FC06220B47828E22989BEF3C2973";
        String[] cloudUserIdArray = cloudUserIds.split("\r\n");
        for (int i = 0; i < 100 ; i++) {
            int j = (int)(Math.random()*(cloudUserIdArray.length-1+1));

        String cloudUserId = cloudUserIdArray[j];
            System.out.println("j:"+j+" cloudUserId:"+cloudUserId);

        }

       // PMobileCloudUser cloudUser = 	cloudUserService.findCloudUserById(cloudUserId);
        //return cloudUser;
    }

    @Test
    public void testInderOf() {
        if ("科室咨询服务（肺炎咨询专问）".contains("科室咨询")) {
            System.out.println("success");
        }

    }

    @Test
    public void testStringSubString() {
        //""
        System.out.println("()".substring(1, 1));
    }

    @Test
    public void testLinkList() {
        //
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(null);
        linkedList.add(null);
        System.out.println(linkedList);
    }

}
