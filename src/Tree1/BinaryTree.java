package Tree1;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    Node newNode(int data) {
        return new Node(data);
    }

    Node insert(Node root, int data) {
        if (root == null) {
            return newNode(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    void preOrder(Node root) {  // KÖK -> SOL -> SAĞ önce kök
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) {       //  SOL -> KÖK -> SAĞ
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) {     //  SOL -> SAĞ -> KÖK
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    int tree_height(Node root) {
        if (root == null)
            return 0;
        return Math.max(tree_height(root.left), tree_height(root.right)) + 1;
    }

    int size(Node root) {
        if (root == null) return 0;
        else {
            return 1 + size(root.left) + size(root.right);
        }
    }


}
