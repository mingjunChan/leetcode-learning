package difficulty.easy._237_delete_node_in_a_linked_list;

import base.ListNode;

public class Solution {

    //1->2->3->null
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
