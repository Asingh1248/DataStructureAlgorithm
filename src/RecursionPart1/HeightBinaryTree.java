package RecusrionPart1;


class Node {

    int key;

    Node left,right;

    public Node (int item){
        key=item;
        left=right=null;
    }

}

public class HeightBinaryTree {

    static Node root_node;


    HeightBinaryTree(int key){
        root_node=new Node(key);
    }

    HeightBinaryTree(){
        root_node=null;
    }

   public static void printTree(){
     int h = height(root_node);
     int i;
     for(i=1;i<=h;i++){
         int level = i-1;
         System.out.print("(level"+level+")"+ " ");
         printCurrentLevel(root_node,i);
         System.out.println();
     }

   }



    public static int height(Node root){

        if(root==null) //Smallest valid input is null
            return 0;
        else{
            int lheight=height(root.left);
            int rheight=height(root.right);
            //User the larger value
            return  Math.max(lheight,rheight)+1;  // Adding 0th node
        }
   }


    private static void printCurrentLevel(Node root_node, int level) {
        if(root_node==null)
            return;
        if(level==1)
            System.out.print(root_node.key+" ");
        else if(level>1)
        {
            printCurrentLevel(root_node.left,level-1);
            printCurrentLevel(root_node.right, level-1);
        }

    }

    public static void main(String[] args) {

         /*
                150
            /          \
       250               270
        /     \       /      \
      320 350  null  null    null

*/

        //Step 1: Constructing Node  - left,right and key in parameterized constructor
        //Step2  : Binary Tree we include the Node object (root_node)
        //tree.left = new NOde
        //Step 3 : print tree- height--printcurrentlevel
        HeightBinaryTree heightBinaryTree = new HeightBinaryTree();
        heightBinaryTree.root_node = new Node(150);  // V.imp  --static object
        heightBinaryTree.root_node.left= new Node(250);
        heightBinaryTree.root_node.right= new Node(270);
        heightBinaryTree.root_node.left.left = new Node(320);
        heightBinaryTree.root_node.left.right = new Node(350);

        System.out.println("Printing the nodes of tree level wise :");
        System.out.println("Level order traversal : ");
        heightBinaryTree.printTree();

        int h = heightBinaryTree.height(heightBinaryTree.root_node);
        System.out.println("Height of the Binary Tree is "+h);



    }

}
