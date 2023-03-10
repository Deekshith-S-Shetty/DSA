class MirrorOfBinaryTree {
    static class Node {
        int val;
        Node left;
        Node right;
    }

    public static Node createNode(int val) {
        Node newNode = new Node();
        newNode.val = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static Node mirrorTree(Node tree) {
        if(tree == null) return tree;

        Node left = mirrorTree(tree.left);
        Node right = mirrorTree(tree.right);

        tree.left = right;
        tree.right = left;
        return tree;
    }

    public static void main(String args[]) {
        Node tree = createNode(5);
        tree.left = createNode(3);
        tree.right = createNode(6);
        tree.left.left = createNode(2);
        tree.left.right = createNode(4);
        System.out.print("Inorder of original tree: ");
        inOrder(tree);

        // Function call
        mirrorTree(tree);

        System.out.print("\nInorder of mirror tree: ");
        inOrder(tree);
    }
}