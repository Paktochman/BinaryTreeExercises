public class Node {

    int value;
    Node left_child;
    Node right_child;

    public Node(int value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    // Postorder traversal: Left → Right → Root
    public void postorder_traversal() {
        if (left_child != null) left_child.postorder_traversal();
        if (right_child != null) right_child.postorder_traversal();
        System.out.print(value + " ");
    }
}
