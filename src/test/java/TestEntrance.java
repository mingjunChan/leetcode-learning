import org.junit.Test;

import java.util.LinkedList;

public class TestEntrance {

    @Test
    public void testAll() {

        String id = "08B3DA4472164ED681643F3BA383EC86\n" +
                "0CE99D21215E46C8BFCB668A7F4B124D\n" +
                "0F0EF52298024BACB7D850C8A31B0600\n" +
                "106D956125724F2197F40E139965BC3C\n" +
                "1B643F6557A94E74B394B4A1C5CE8F2E\n" +
                "24177E0AE9C74382ACBE4770BB91CDCA\n" +
                "2E045AE18CF14BE49EC06280EC954853\n" +
                "2EF24473F0A046C198CACEC70C6AB279\n" +
                "321E70A903174B3D9D7214D3CD82CA4F\n" +
                "34362892BD494A23A5D6F04FEE87C543\n" +
                "34AC6E8746434AFBBB79CACDB0218336\n" +
                "355FC8EBDB484BC7894931E397699A50\n" +
                "3FC23C04011A413DA23BD3BF8DFBE972\n" +
                "430CD13107E34BE48B9E9BD290573AA4\n" +
                "482934E0F8884311A6A48D851627C2A8\n" +
                "56260CB5F13F4D9DAC4FAAB0B30357FC\n" +
                "5B56402F90D544828B5498070DA8F6B1\n" +
                "6068205FF9FE41939313870561CA1B9F\n" +
                "618D545300A94E99843A712D1AA6F2E0\n" +
                "628F1E0FF1A64492A858A5073BAE6893\n" +
                "6451AB291ED548D3BE1607778C6E67E5\n" +
                "6CAA265926094A12AFA6C06353674A8E\n" +
                "719A37E5E26E49B4809C8C7DC0A21FBD\n" +
                "750F9D91D67C4A799EAE788EF031784D\n" +
                "75E88D2A83874606A78721256B5DAC79\n" +
                "7965D6B1167B475B856BF12E01B4D487\n" +
                "7AC1316F4DFF4ECBA608E9085AD40A7F\n" +
                "7B381808BD27475386EA7159B718D165\n" +
                "7DCA6B476D2048E985FA8F1C591031B7\n" +
                "7EADB33C2ED1453E95FBDA5AE8BD1C0E\n" +
                "88858DE2C72A4DAAB9649DAF5AC04D7B\n" +
                "8FD3F02BD8E54A6F9C0CBC60383FF5A2\n" +
                "95CB9453F10E4E7B968F8029C4EDDC95\n" +
                "99C1E5548FA54951B2638D7DD1FCFD1C\n" +
                "9D2854F0DE5A437991D18B3E3C11BA10\n" +
                "9D3D146283444C32945EE10F08903767\n" +
                "9FC704F93B674CDC9FF9193E4FA2FFA4\n" +
                "A2EBF0E52FFE4F73B0EF2687ABA27068\n" +
                "A5B45E0707FC44E78A696D8C69E63A88\n" +
                "AC023F62560E4252967B89F6475510BF\n" +
                "B2BF3EE5C0B64C4385F4DF568D914EB3\n" +
                "C3B7E916A28C40CB821E949C5BAFF0E4\n" +
                "C6B55F38FEC74035874F3E8096461BF3\n" +
                "C746DEEF7C8A4973A9DA35BA07A7D837\n" +
                "C90F5FD733C34524BA1E12A1957FBAEC\n" +
                "CF623C864E494ACEAC4CF19C18C6DC93\n" +
                "D07342AAA4E54B5CBB02DDF60E045386\n" +
                "D14DA5CAF7A245BC9C6C30D5C0F1765D\n" +
                "D47907DBEC7A4C0C8FBE2F52A218EF71\n" +
                "D74C08C1FB144654874C7977D01B38DF\n" +
                "D945009C604D4E0D92D58EEF267B2142\n" +
                "DC072D9BDE914E12B5F5DB5D51C6ABEF\n" +
                "DD4E629FD4454564BBB5BC0568F9F187\n" +
                "DE25B9307DE54C71B18BD1B541987E41\n" +
                "E04417FF40F54ABAADE1A55EE19FAD29\n" +
                "EA43E65A7AAB431AB2705AAA15AC0D51\n" +
                "F03694780D5D4E679E34F5695B372F23\n" +
                "F30CE2870BC1450CA158FCC9BAE04450\n" +
                "FF500E2E28C3419CB018CFA994EC0971";
        String[] ids = id.split("\n");
        for (String s : ids) {
        //    System.out.println("DELETE FROM `OP`.`P_MOBILE_CONTRACT_DTR_DEPT_REL` WHERE FTENANT_DEPT_ID = \"BD73724AF3524E76B17AC4206C4FC7B3\" AND FDOCTOR_ID = \""+s+"\";");
           System.out.println("INSERT INTO `OP`.`P_MOBILE_CONTRACT_DTR_DEPT_REL` (`FTENANT_DEPT_ID`, `FDOCTOR_ID`, `FIS_ONLINE`, `FCREATED_DATE`, `FLAST_MODIFYED_DATE`) VALUES ('D5C4F23C11AC46E39AA63C0B7269E9D5', '"+s+"', '1', '2020-01-31 20:00:57', '2020-01-31 20:00:57');");
        }
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
