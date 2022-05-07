package linkedlist;

import tree.Node;
import tree.Node;

public class FlatteningLinkedList
{
    public static void main(String[] args)
    {

        //https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1


        //input

        Node a = null;
        Node b = null;

        // end input

        Node temp = new Node(0);
        Node res = temp;

        while (a != null && b!= null)
        {
            if (a.data<b.data)
            {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            }else {
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }

        // if there are still some nodes available in either of the node a or b
        if (a != null)
        {
            temp.bottom = a;
        }else {
            temp.bottom = b;
        }

        // return res.bottom


    }
}
