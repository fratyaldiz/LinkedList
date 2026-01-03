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

    int max(Node node) {
        int maxValue = node.data;

        while (node.right != null) {
            maxValue = node.right.data;
            node = node.right;
        }
        return maxValue;
    }


    public Node remove(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (data > root.data) {
            root.right = remove(root.right, data);
            return root;
        }
        else if (data < root.data) {
            root.left = remove(root.left, data);
            return root;
        }
        else {
            if (root.left == null && root.right == null ) {
                return null;
            }
            else if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            else {
                int max = max(root.left);
                root.data = max;
                root.left = remove(root.left, max);
                return root;
            }
        }
    }
}
