package Tree1;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 8);
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 5);
        bt.root = bt.insert(bt.root, 12);
        bt.root = bt.insert(bt.root, 20);
        bt.root = bt.insert(bt.root, 9);

        System.out.print("preOrder: ");
        bt.preOrder(bt.root);       //10 8 5 9 15 12 20

        System.out.println();

        System.out.print("inOrder: ");
        bt.inOrder(bt.root);        //5 8 9 10 12 15 20

        System.out.println();

        System.out.print("postOrder: ");
        bt.postOrder(bt.root);      // 5 9 8 12 20 15 10

        System.out.println();
        System.out.print("Height: " + bt.tree_height(bt.root));

        System.out.println();
        System.out.println("Size: " + bt.size(bt.root));

        bt.remove(bt.root, 10);
        bt.preOrder(bt.root);


        /*System.out.println();
        System.out.println("Kökün datası: " + bt.root.data);
        System.out.println("Kökün sağındaki datası: " + bt.root.right.data);
        System.out.println("Kökün solundaki datası: " + bt.root.left.data);
        System.out.println("Kökün solunun solundaki data: " + bt.root.left.left.data);
        */
    }
}
