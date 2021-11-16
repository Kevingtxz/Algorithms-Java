//21. Merge Two Sorted Lists
public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    };

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list_result = new ListNode();
        while(l1 != null || l2 != null){
            if(l1 != null) if(l2 == null || l1.val < l2.val) {
                next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else if(l2 != null){
                next = new ListNode(l2.val);
                l2 = l2.next;
            }
            next = next.next;
        }
        return list_result;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(l1, l2).next);
    }
}
