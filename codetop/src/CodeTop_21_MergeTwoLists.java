import java.util.List;

/**
 * @author: ShiRongbao
 * @date: 2025-06-03
 * @description:
 */
public class CodeTop_21_MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        }

        // 虚拟头节点
        ListNode dummy = new ListNode();
        ListNode pre = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }

        // 添加剩余部分
        pre.next = (list1 != null) ? list1 : list2;

        // 返回虚拟头节点的下一个节点
        return dummy.next;
    }

}
