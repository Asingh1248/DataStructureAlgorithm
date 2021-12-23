public class Solution {
    public static boolean checkPalindrome(int number){
        boolean check=false;
        int input=number;
        int rev=0;
//         String ans="";
        while(number!=0){
            int rem=number%10;
            rev=(rev*10)+rem;
//             if(rev==0){
//                 String val=Integer.toString(rev);
//                 ans=ans+val;
//                 //System.out.println(ans);
//             }
            number=number/10;
        }
        //System.out.println("Reverse of number:"+rev);
//         ans=ans+Integer.toString(rev);
//         System.out.println("Answer is :"+Integer.parseInt(ans));
        if(input==rev)
        {
           return true;
        }
        else{
           return false; 
        }
        
    }
    
	public static String nextLargestPalindrome(String number, int length) {
		// Write your code here
        
//         boolean found=false;
        int num=Integer.parseInt(number);
        int initial=num+1;
        while(!checkPalindrome(initial)){  
           num=num+1;      
        }
        String ans=Integer.toString(num);
        return ans;
	}
}