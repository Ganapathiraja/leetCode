package linkedlist;

import tree.Node;

class ReverseKGroupsLinkedList {

    public Node reverseKGroup(Node head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;

        Node start = dummy;
        Node end = head;
        int count = 0;
        while (end != null) {
            count++;
            // group
            if (count % k == 0) {
                // reverse linked list (start, end]
                start = reverse(start, end.next);
                end = start.next;
            } else {
                end = end.next;
            }
        }
        return dummy.next;
    }

    /**
     * reverse linked list from range (start, end), return last node.
     * for example:
     * 0->1->2->3->4->5->6->7->8
     * |           |
     * start       end
     *
     * After call start = reverse(start, end)
     *
     * 0->3->2->1->4->5->6->7->8
     *          |  |
     *       start end
     *
     * @return the reversed list's 'start' node, which is the precedence of node end
     */
    private Node reverse(Node start, Node end) {
        Node curr = start.next;
        Node prev = start;
        Node first = curr;
        while (curr != end){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        start.next = prev;
        first.next = curr;
        return first;
    }

    public static void main(String[] args)
    {

    }
}