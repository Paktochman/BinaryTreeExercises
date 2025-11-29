public class Node {

    int value;
    Node left_child;
    Node right_child;

    public Node(int value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    public int height() {
        int leftHeight = (left_child == null) ? 0 : left_child.height() + 1;
        int rightHeight = (right_child == null) ? 0 : right_child.height() + 1;
        return Math.max(leftHeight, rightHeight);
    }
}
