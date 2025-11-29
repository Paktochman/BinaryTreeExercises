public class Node {

    int value;
    Node left_child;
    Node right_child;

    public Node(int value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    // Validate BST
    public boolean is_valid_bst() {
        return is_valid_bst_helper(this, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean is_valid_bst_helper(Node node, int min, int max) {
        if (node == null) return true;
        if (node.value <= min || node.value >= max) return false;
        return is_valid_bst_helper(node.left_child, min, node.value)
            && is_valid_bst_helper(node.right_child, node.value, max);
    }

    // Delete a node from BST
    public Node delete(int value) {
        if (value < this.value) {
            if (left_child != null) left_child = left_child.delete(value);
        } else if (value > this.value) {
            if (right_child != null) right_child = right_child.delete(value);
        } else {
            // No child
            if (left_child == null && right_child == null) return null;

            // One child
            if (left_child == null) return right_child;
            if (right_child == null) return left_child;

            // Two children: find inorder successor
            int successorValue = right_child.find_min();
            this.value = successorValue;
            right_child = right_child.delete(successorValue);
        }
        return this;
    }
}
