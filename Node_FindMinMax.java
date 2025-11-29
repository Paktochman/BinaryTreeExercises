public class Node {

    int value;
    Node left_child;
    Node right_child;

    public Node(int value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    // Find minimum in BST
    public int find_min() {
        Node curr = this;
        while (curr.left_child != null) curr = curr.left_child;
        return curr.value;
    }

    // Find maximum in BST
    public int find_max() {
        Node curr = this;
        while (curr.right_child != null) curr = curr.right_child;
        return curr.value;
    }
}
