public class Solution {
    
   public static String mirror (int mid,char [] num){
       
       
   }
        
	public static String nextLargestPalindrome(String number, int length) {
		// Write your code here
         //int num=Integer.parseInt(number);
        char [] num = number.toCharArray();  
        
        if(length%2==0){
             //123.4 = 
             int mid=length/2;
             int midLeft=num[mid-1]-'0';
             int midRight=num[mid]-'0';
              
             //System.out.println("Midleft :"+midLeft);
             //Case1 :
             if(midLeft>midRight){
                 num[mid]=(char)(midLeft+'0');
                 //System.out.println("Mid number :"+num[mid]);
                char []nextSmallest=mirror(mid,num);
             }
             //System.out.println("Now number :"+num.toString());
         }
        
        return "hello";
	}
}