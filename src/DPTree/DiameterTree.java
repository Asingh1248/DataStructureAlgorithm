package DPTree;

public class DiameterTree {


    static class A   // I need to pass by reference
    {
        int result =Integer.MIN_VALUE;
    }

    public static void main(String[] args) {

          Node root = new Node(1);
          root.left=new Node(2);
          root.right=new Node(3);
          root.right.right=new Node(6);
          root.left.left=new Node(4);
          root.left.right= new Node(5);

        System.out.println("Diameter of tree is :"+diameter(root));

    }

     static int  diameter(Node root) {
        if(root==null)
            return 0;

        A a = new A();
        int height_of_tree=solve(root,a); //Passing the root, a by reference
        return a.result;
    }

    private static int solve(Node root, A a) {
        if(root==null)
            return 0;
        int lht= solve(root.left,a);
        int rht= solve(root.right,a);

        int temp=1+Math.max(lht,rht); //case 1: Big U
        int ans=Math.max(temp,1+lht+rht); //case 2 : Small U
        a.result=Math.max(a.result, ans);

        return temp;
    }



}
