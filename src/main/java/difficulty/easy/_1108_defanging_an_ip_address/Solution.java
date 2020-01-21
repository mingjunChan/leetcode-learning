package difficulty.easy._1108_defanging_an_ip_address;

public class Solution {
    public String defangIPaddr(String address) {
        //考察正则表达式特殊字符匹配
        return address.replace(".", "[.]");

    }

}
