//203. Remove Linked List Elements
public class RemoveLinkedListElements {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    };

    private static void removeValue(ListNode head, int val) {
        if(head.next != null){
            if(head.next.val==val){
                head.next=head.next.next;
                removeValue(head, val);
            }
            else removeValue(head.next, val);
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val==val)
            head=head.next;
        if(head != null)
            removeValue(head, val);
        return head;
    }

/*
    public static ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.val == val) return removeElements(head.next, val);
        head.next = removeElements(head.next, val);
        return head;
    }
*/
public static void main(String[] args) {
        int[] numbers = {1,2,6,3,4,5,6};
        ListNode first_node = new ListNode(numbers[0]);
        ListNode last_node = first_node;
        for(int i=1; i<numbers.length; i++){
            last_node.next = new ListNode(numbers[i]);
            last_node = last_node.next;            
        }
        ListNode result = removeElements(list_node, 6);
        System.out.println(result);
    }
}
