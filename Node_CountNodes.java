public class Node {

    int value;
    Node left_child;
    Node right_child;

    public Node(int value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    // Count total nodes in the tree
    public int count_nodes() {
        int leftCount = (left_child == null) ? 0 : left_child.count_nodes();
        int rightCount = (right_child == null) ? 0 : right_child.count_nodes();
        return 1 + leftCount + rightCount;
    }
}
