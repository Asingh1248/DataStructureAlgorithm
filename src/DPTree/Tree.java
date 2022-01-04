package DPTree;

//Step 1: Two Class :Inner class
 class Node{

    Node left,right;  //Left and right bhi toh Node hi rahega
    int key;

    public Node(int key) {
        this.key = key;
        left=right=null; //imp
    }
}


public class Tree {

    public static void main(String[] args) {
        Node root_node = new Node(1);
        /*
                1
            /          \
            2           3
        /     \       /      \
      4         5    null    6

*/
     root_node.left = new Node(2);
     root_node.right = new Node(3);
     root_node.right.right = new Node(6);

     root_node.left.left = new Node(4);
     root_node.left.right = new Node(5);

    }





}
