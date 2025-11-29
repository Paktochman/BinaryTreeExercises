import java.util.Queue;
import java.util.LinkedList;

public class Node {

    int value;
    Node left_child;
    Node right_child;

    public Node(int value) {
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    // Level-order traversal (Breadth-First Search)
    public void level_order_traversal() {
        Queue<Node> q = new LinkedList<>();
        q.add(this);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.value + " ");
            if (curr.left_child != null) q.add(curr.left_child);
            if (curr.right_child != null) q.add(curr.right_child);
        }
    }
}
