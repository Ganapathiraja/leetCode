package treenode;

import tree.TreeNode;
import java.util.*;

public class ZigZagTreePrint
{
    public static void main(String[] args)
    {

        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(30);
        treeNode.left.left = new TreeNode(40);
        treeNode.left.right = new TreeNode(50);
        treeNode.left.left.left = new TreeNode(60);
        treeNode.left.right.left = new TreeNode(70);

        System.out.println(solveZigZag(treeNode));
    }

    private static List<List<Integer>> solveZigZag(TreeNode treeNode)
    {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        int f =1;
        while (!queue.isEmpty())
        {
            List<Integer> tempAns = new ArrayList<>() ;
            int sizeQueue = queue.size();
            while (sizeQueue > 0)
            {
                sizeQueue--;
                TreeNode temp = queue.peek();
                tempAns.add(temp.data);
                queue.poll();

                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }

            if (f % 2 == 0)
            {
                Collections.reverse(tempAns);
            }
            f++;
            ans.add(tempAns);
        }

    return ans;

    }
}
