package difficulty.easy._1290_convert_binary_number_in_a_linked_list_to_integer;

import base.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int getDecimalValue(ListNode head) {
        List<Integer> nums = new ArrayList<Integer>();
        ListNode temp = head ;

        while(temp!=null){
           int val = temp.val;
           nums.add(Integer.valueOf(val));
           temp = temp.next;
        }
        int result = 0;
        Collections.reverse(nums);
        for (int i = 0; i < nums.size(); i++) {
            result+=Math.pow(2,i)*nums.get(i);
        }


        return result;
    }
}