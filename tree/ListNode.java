package tree;

public class ListNode
{
   public ListNode next;
    public int data;

    public ListNode(int data)
    {
        this.data = data;
        this.next = null;
    }


    public static ListNode getListNode()
    {
        ListNode start = new ListNode(10);
        start.next = new ListNode(12);
        start.next.next = new ListNode(11);
        start.next.next.next = new ListNode(11);
        start.next.next.next.next = new ListNode(12);
        start.next.next.next.next.next = new ListNode(11);
        start.next.next.next.next.next.next = new ListNode(10);

        return start;
    }

    public static ListNode getCycleListNode()
    {
        ListNode start = new ListNode(10);
        start.next = new ListNode(11);
        start.next.next = new ListNode(12);
        start.next.next.next = new ListNode(13);
        start.next.next.next.next = new ListNode(14);
        start.next.next.next.next.next = new ListNode(19);
        start.next.next.next.next.next.next =  start.next;

        return start;
    }

}
