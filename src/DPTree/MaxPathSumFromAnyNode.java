package DPTree;

public class MaxPathSumFromAnyNode {

    static class A{
        int result = Integer.MIN_VALUE;
    }

    public static void main(String[] args) {

        Node root= new Node(1);
        root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        System.out.println("Max Path Sum from any Node to any Node is :"+maxPathSumFromAnyNode(root));

    }

    private static int maxPathSumFromAnyNode(Node root) {
        if(root ==null)
         return 0;

        A a =new A();
        int maxPathSum= solve(root,a);
        return a.result;
    }

    private static int solve(Node root, A a) {
        if(root ==null)
            return 0;
        int lht=solve(root.left,a);
        int rht=solve(root.right,a);

        int temp=Math.max(Math.max(lht,rht)+root.key,root.key);   //Case 1 : Big U and Negtaive
        int ans=Math.max(temp,lht+rht+root.key);  //case 2: Samll u
        a.result=Math.max(temp,ans);

        return temp;

    }

}

//Max path sum is 42