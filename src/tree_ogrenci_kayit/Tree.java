package tree_ogrenci_kayit;

public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    Node insert(Node root, int no, String name, int not) {
        if (root == null) {
            return new Node(no, name, not);
        }
        if (no < root.no) {
            root.left = insert(root.left, no, name, not);
        } else {
            root.right = insert(root.right, no, name, not);
        }
        return root;
    }

    public void add(int no, String name, int not) {
        root = insert(root, no, name, not);
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.no + " " + root.name + " " + root.not);
            inOrder(root.right);
        }
    }

    public void print() {
        inOrder(root);
    }

    int max(Node node) {
        int maxNo = node.no;
        while (node.right != null) {
            maxNo = node.right.no;
            node = node.right;
        }
        return maxNo;
    }

    Node remove(Node root, int no) {
        if (root == null) {
            return null;
        }

        if (no < root.no) {
            root.left = remove(root.left, no);
        } else if (no > root.no) {
            root.right = remove(root.right, no);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int maxNo = max(root.left);
                root.no = maxNo;
                root.left = remove(root.left, maxNo);
            }
        }
        return root;
    }

    public void delete(int no) {
        root = remove(root, no);
    }
}
