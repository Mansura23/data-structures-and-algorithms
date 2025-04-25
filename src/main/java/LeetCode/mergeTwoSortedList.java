package LeetCode;


public class mergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode();
       ListNode curr = dummy;
       while (l1 != null && l2 != null) {
           if (l1.val < l2.val) {
               curr.next = l1;
               l1 = l1.next;
           }
           else {
               curr.next = l2;
               l2 = l2.next;
           }
           curr = curr.next;
       }
       if (l1 != null) {
           curr.next = l1;
       }
       if (l2 != null) {
           curr.next = l2;
       }
       return dummy.next;




    }

        public static void main(String[] args) {
            ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
            ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

            mergeTwoSortedList solution = new mergeTwoSortedList();
            ListNode merged = solution.mergeTwoLists(list1, list2);

            // Print the merged list
            while (merged != null) {
                System.out.print(merged.val + " ");
                merged = merged.next;
            }
            // Output: 1 1 2 3 4 4
        }


}
