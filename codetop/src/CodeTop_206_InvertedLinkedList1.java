/**
 * @author: ShiRongbao
 * @date: 2025-06-02
 * @description:
 */
public class CodeTop_206_InvertedLinkedList1 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode pre = null;
        ListNode current = head;
        ListNode temp;

        while (current != null) {
            temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }

        return pre;
    }


}
