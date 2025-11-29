public class Node {

    int value;
    Node left_child;
    Node right_child;

    public Node(int value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    // Search value in BST
    public boolean search(int value) {
        if (value == this.value) return true;

        if (value < this.value) {
            return (left_child != null) && left_child.search(value);
        } else {
            return (right_child != null) && right_child.search(value);
        }
    }
}
