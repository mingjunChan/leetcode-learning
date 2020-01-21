package base;

import sun.font.CreatedFontTracker;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
    }

   public static ListNode createListNode(int[] nums) {

        ListNode head = new ListNode(nums[0]);
        ListNode node = head;
        for (int i = 1; i < nums.length; i++) {
            node.next = new ListNode(nums[i]);
            node = node.next;

        }
        return head;
    }

    public static void soutListNode(ListNode head) {

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3};
        ListNode head = createListNode(nums);
        soutListNode(head);
    }
}