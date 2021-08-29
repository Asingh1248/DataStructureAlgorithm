import java.util.ArrayList;
import java.util.*;

public class Solution {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main (String args[]){
        
        int T ;
        
        T=sc.nextInt();
        System.out.println("Test case :"+T);
        ArrayList<Integer> queries = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> queryvalue=new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<=T;i++)
        {
            System.out.println("Query for TestCase :"+i);
            int query = sc.nextInt();
            queries = functionaddqueries(i);
            System.out.println("ArrayList for queries :"+queries);
            // queryvalue.add(queries)
        }
    }
    
    public static ArrayList<Integer> functionaddqueries(int query)
    {
        //Scanner sc = new Scanner(System.in);
        ArrayList<Integer> queriesval = new ArrayList<Integer>(); 
        ArrayList<ArrayList<Integer>> queriesList = new ArrayList<ArrayList<Integer>>();
        queriesList=null;
        for(int i=0;i<=query;i++){
            int q1=sc.nextInt();
            int q2=sc.nextInt();
            System.out.println("ArrayList VAL1 :"+q1 + "VAL2 :"+q2);
            queriesval.add(q1);
            queriesval.add(q2);
            // queriesList.add(queriesval);
        }
        
        return queriesval;
    }

// 	public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> queries) {
        
        
// 		// Write your code here
// 		return 0;
// 	}
}


INPUT

1
2
1 3
2 2

OUTPUT
Test case :1
Query for TestCase :1
ArrayList VAL1 :1VAL2 :3
ArrayList VAL1 :2VAL2 :2
ArrayList for queries :[1, 3, 2, 2]

Target:

2
2
1 3
2 2
3
1 2
2 3
2 1