public class Node {

    int value;
    Node left_child;
    Node right_child;

    public Node(int value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    // Preorder traversal: Root → Left → Right
    public void preorder_traversal() {
        System.out.print(value + " ");
        if (left_child != null) left_child.preorder_traversal();
        if (right_child != null) right_child.preorder_traversal();
    }
}

