package DynamicProgrammingPart4;

public class BooleanParenthenization {

    public static void main(String[] args) {

       // String X="T|F&T^F";
        String symbols = "TTFT";
        String operators = "|&^";
        StringBuilder S = new StringBuilder();
        int j = 0;

        for (int i = 0; i < symbols.length(); i++)
        {
            S.append(symbols.charAt(i));
            if (j < operators.length())
                S.append(operators.charAt(j++));
        }

        String X=S.toString();
        int n =X.length();

        char a[]=X.toCharArray();

        //Step 1 :Decide i and j and Extra Logic why we require 4th parameter for solve ()
        int ans =solve(a,0,n-1,true);
        System.out.println("No of ways to partition boolean expression: "+X + " is "+ans + " to evaluate to true");

    }

    private static int solve(char[] s, int i, int j, boolean isTrue) {
        //Step 2: Decide the base condition:
//
        if(i>j) //No element
           return 0;

        //Now Understandable
        if(i==j){  //Note Here i and j always be T or F
            if(isTrue)
                return (s[i]=='T')?1:0;  //Imp
            else
                return (s[i]=='F')?1:0;
        }

        //Step 3: K loop scheme :Note k will be always the operator andh hence  K= k+2

        int ans=0;
        //Second character is operator and hence k=i+1
        for(int k=i+1;k<=j-1;k=k+2)
        {
            // left side (T or F and |)^ (T xor F) //right side :(
            //Left-hand side
            int lT=solve(s,i,k-1,true);
            int lF=solve(s,i,k-1,false);

            //Right-hand side

            int rT=solve(s,k+1,j,true);
            int rF=solve(s,k+1,j,false);

            //Step 4: using temp ans to calculate the answer

            //(T or F and |)[^,&,|]--k (T xor F)

            //T&T=T,T&F=F,F&T=F,F&F=F
            if(s[k]=='&'){
                if(isTrue==true)
                  ans +=lT*rT;
                else
                  ans+=lT*rF+ lF*rT + lF*lF;
            }


            else if(s[k]=='|'){
                if(isTrue==true)
                    ans+=lT*rT+lT*rF+lF*rT;
                else
                    ans+=lF*rF;
            }

            else if(s[k]=='^'){
                if(isTrue==true)
                    ans+=lT*rF+lF*rT;
                else
                    ans+=lT*rT+ lF*rF;
            }


        }

      return  ans;

    }

}


//Op :
// There are 4 ways
// ((T|T)&(F^T)), (T|(T&(F^T))), (((T|T)&F)^T) and
// (T|((T&F)^T))