package tree;

import java.util.LinkedList;
import java.util.List;

public class Node {

    public Node next;
    public Node bottom;
    public int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }

    @Override
    public String toString()
    {
        return "Node{" +
            "next=" + next +
            ", data=" + data +
            '}';
    }
    static List<Integer> list = new LinkedList<>();
    static Node head=null;
    public static Node addNode()
    {

        for (int i=0;i<10;i++){
            list.add(i);
        }

        int count =0;
        while (count < list.size()){
            Node newNode = new Node(list.get(count));
            newNode.next = head;
            head = newNode;
            count++;
        }

        return head;
    }

    public Node getData()
    {
        return head;
    }
}
