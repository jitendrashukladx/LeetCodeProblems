//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeSortedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head;
            ListNode temp = new ListNode();
            head = temp;
            //head=last;

            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    temp.next = l1;
                    l1 = l1.next;
                }
                else {
                    temp.next = l2;
                    l2 = l2.next;
                }
                temp = temp.next;
            }
            if(l1!= null) temp.next = l1;
            if(l2!=null) temp.next = l2;
            return head.next;
        }
}


/*
**Another solution using recursion for better space complexity
*/
/**
 * Definition for singly-linked list.


 public class ListNode {
 int val;
 ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 **/
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //At the very end of stack
        //return the opposite
        //if l1 is null it means it finished
        //so the leftover nodes from l2 will connect to the
        //end of l1
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        //Check which one is lower
        if (l1.val < l2.val) {
            //Now set the next node of the CURRENT lower(l1.next)
            //to the LOWER of the next recursion
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            //Same explanation as the if statement above
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}