public class Node {

    int value;
    Node left_child;
    Node right_child;

    public Node(int value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    // Inorder traversal: Left → Root → Right
    public void inorder_traversal() {
        if (left_child != null) left_child.inorder_traversal();
        System.out.print(value + " ");
        if (right_child != null) right_child.inorder_traversal();
    }
}
