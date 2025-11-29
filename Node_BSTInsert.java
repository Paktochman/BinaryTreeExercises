public class Node {

    int value;
    Node left_child;
    Node right_child;

    public Node(int value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    // Insert value into BST
    public void insert(int value) {
        if (value < this.value) {
            if (left_child == null) left_child = new Node(value);
            else left_child.insert(value);
        } else {
            if (right_child == null) right_child = new Node(value);
            else right_child.insert(value);
        }
    }
}
