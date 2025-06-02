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

    public static void main(String[] args) {
        CodeTop_21_MergeTwoLists solution = new CodeTop_21_MergeTwoLists();

        // 构造两个链表
        // list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // 合并
        ListNode result = solution.mergeTwoLists(list1, list2);

        // 打印结果
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }

}
