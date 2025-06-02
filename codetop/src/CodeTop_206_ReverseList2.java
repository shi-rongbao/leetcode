/**
 * @author: ShiRongbao
 * @date: 2025-06-02
 * @description:
 */
public class CodeTop_206_ReverseList2 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        return recur(head, null);
    }

    private ListNode recur(ListNode cur, ListNode pre) {
        if (cur == null) {
            return pre;
        }

        ListNode result = recur(cur.next, cur);

        cur.next = pre;

        return result;
    }

}
