
public class BinarySearchTree {

	Node root;
    public BinarySearchTree(int[] arr)
    {
        for (int i : arr)
            add(root, i);
    }
    public void printBinarySearchTree(Node node)
    {
        if (node == null) {
            return;
        }
        printBinarySearchTree(node.left);
        System.out.printf("%d ", node.data);
        printBinarySearchTree(node.right);
    }
    public void add(Node node, int data)
    {
       Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        } else {
            if (node.data < data) {
                if (node.right == null) {
                    node.right = newNode;
                    return;
                }
                add(node.right, data);
            } else {
                if (node.left == null) {
                    node.left = newNode;
                    return;
                }
                add(node.left, data);
            }
        }

    }
}

class Node {
    Node right;
    Node left;
    int data;
    public Node(int data)
    {
        this.data = data;
    }
}
