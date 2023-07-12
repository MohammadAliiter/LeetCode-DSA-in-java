public class thirdNodefromlastinlist {
   static class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    
     static class LinkedList {
        public ListNode findThirdFromEnd(ListNode head) {
            if (head == null || head.next == null || head.next.next == null) {
                return null; // Not enough nodes in the list
            }
    
            ListNode slow = head;
            ListNode fast = head;
    
            // Move the fast pointer two nodes ahead
            int count = 0;
            while (fast != null && count < 2) {
                fast = fast.next;
                count++;
            }
    
            // If the fast pointer reached the end, the list is not long enough
            if (fast == null) {
                return null;
            }
    
            // Move both pointers until the fast pointer reaches the end
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
    
            // The slow pointer is now pointing to the third node from the end
            return slow;
        }
    }
    
        public static void main(String[] args) {
            // Example usage
            LinkedList list = new LinkedList();
    
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
    
            ListNode thirdFromEnd = list.findThirdFromEnd(head);
            if (thirdFromEnd != null) {
                System.out.println("Value of the third node from the end: " + thirdFromEnd.val);
            } else {
                System.out.println("List is not long enough.");
            }
        }
    
    
}
