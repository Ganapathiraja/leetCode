package bfs;

public class T_DFS
{
    public static void main(String[] args)
    {

        // DFS has 3 traversal pointers they are in-order , pre-order , post-order


        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        //preOrder
        // RLR (ROOT LEFT RIGHT)
        System.out.println("Pre-Order");
        preorder(root);

        System.out.println();

        //inorder
        //Left Root Right
        System.out.println("In-Order");
        inorder(root);
        System.out.println();

        //postOrder
        //Left Right Root
        System.out.println("Post-Order");
        postorder(root);
        System.out.println();
    }

    static void preorder(Node TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse root
        System.out.print(TreeNode.data + " ");
        // Traverse left
        preorder(TreeNode.left);
        // Traverse right
        preorder(TreeNode.right);
    }

    static void inorder(Node TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse left
        inorder(TreeNode.left);
        // Traverse root
        System.out.print(TreeNode.data + " ");
        // Traverse right
        inorder(TreeNode.right);
    }

    static void postorder(Node TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse left
        postorder(TreeNode.left);
        // Traverse right
        postorder(TreeNode.right);
        // Traverse root
        System.out.print(TreeNode.data + " ");
    }
}

